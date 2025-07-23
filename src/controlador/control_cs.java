package controlador;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class control_cs {

    public void crearcopiabd() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/proyectot2";
        String username = "root";
        String password = "1234";
        String[] tablasARespaldar = {"cambiomenstruacion", "ciclomenstrual", "diagnostico", "estudiantef", "historialciclo", "respaldoseguridad", "sintomas"};
        File backupFile = chooseFile();

        if (backupFile == null) {
            return;
        }

        if (!backupFile.getAbsolutePath().endsWith(".sql")) {
            backupFile = new File(backupFile.getAbsolutePath() + ".sql");
        }

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement();
             FileWriter fileWriter = new FileWriter(backupFile)) {

            // Escribir el encabezado y configuraciones iniciales
            fileWriter.write("-- --------------------------------------------------------\n");
            fileWriter.write("-- Host:                         127.0.0.1\n");
            fileWriter.write("-- Versión del servidor:         10.5.25-MariaDB - mariadb.org binary distribution\n");
            fileWriter.write("-- SO del servidor:              Win64\n");
            fileWriter.write("-- HeidiSQL Versión:             12.6.0.6765\n");
            fileWriter.write("-- --------------------------------------------------------\n\n");
            fileWriter.write("/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;\n");
            fileWriter.write("/*!40101 SET NAMES utf8 */;\n");
            fileWriter.write("/*!50503 SET NAMES utf8mb4 */;\n");
            fileWriter.write("/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;\n");
            fileWriter.write("/*!40103 SET TIME_ZONE='+00:00' */;\n");
            fileWriter.write("/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;\n");
            fileWriter.write("/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;\n");
            fileWriter.write("/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;\n\n");

            // Crear la declaración de la base de datos
            fileWriter.write("-- Volcando estructura de base de datos para proyect_ii\n");
            fileWriter.write("CREATE DATABASE IF NOT EXISTS `proyectot2` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;\n");
            fileWriter.write("USE `proyectot2`;\n\n");

            // Respaldar solo las tablas especificadas
            for (String tableName : tablasARespaldar) {
                System.out.println("Respaldando tabla: " + tableName);
                backupTable(statement, fileWriter, tableName);
            }

            // Configuraciones finales de SQL
            fileWriter.write("/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;\n");
            fileWriter.write("/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;\n");
            fileWriter.write("/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;\n");
            fileWriter.write("/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;\n");
            fileWriter.write("/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;\n");

            // Bloque try-catch para la impresión del mensaje de éxito
            try {
                JOptionPane.showMessageDialog(null,
                    "Respaldo de la base de datos creado exitosamente.",
                    "CREADO CON ÈXITO",
                    JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                System.err.println("Error al mostrar el mensaje de éxito: " + e.getMessage());
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("Error al crear el respaldo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private File chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar respaldo");
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null;
        }
    }

    private void backupTable(Statement statement, FileWriter fileWriter, String tableName) throws Exception, IOException {
        // Crear la declaración de la tabla
        fileWriter.write("-- Volcando estructura para tabla proyectot2." + tableName + "\n");
        try (ResultSet rsTable = statement.executeQuery("SHOW CREATE TABLE " + tableName)) {
            if (rsTable.next()) {
                String createTable = rsTable.getString(2);
                fileWriter.write(createTable + ";\n\n");
            }
        }

        // Insertar datos en la tabla
        fileWriter.write("-- Volcando datos para la tabla proyectot2." + tableName + ": ~0 rows (aproximadamente)\n");
        try (ResultSet rsData = statement.executeQuery("SELECT * FROM " + tableName)) {
            int columnCount = rsData.getMetaData().getColumnCount();
            while (rsData.next()) {
                StringBuilder insertStatement = new StringBuilder("INSERT INTO " + tableName + " VALUES(");
                for (int i = 1; i <= columnCount; i++) {
                    insertStatement.append("'").append(rsData.getString(i)).append("'");
                    if (i < columnCount) {
                        insertStatement.append(", ");
                    }
                }
                insertStatement.append(");\n");
                fileWriter.write(insertStatement.toString());
                System.out.println("Insertando datos en: " + tableName);
            }
            fileWriter.write("\n");
        }
    }
}
