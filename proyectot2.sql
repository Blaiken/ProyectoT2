-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.5.25-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Volcando estructura de base de datos para proyect_ii
CREATE DATABASE IF NOT EXISTS `proyectot2` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;
USE `proyectot2`;

-- Volcando estructura para tabla proyectot2.cambiomenstruacion
CREATE TABLE `cambiomenstruacion` (
  `cedula` int(11) NOT NULL,
  `humor` varchar(20) NOT NULL,
  `tipodolor` varchar(20) NOT NULL,
  `sensiemocional` varchar(20) NOT NULL,
  `fecharegistro` date DEFAULT NULL,
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`codigo`),
  KEY `fk_cedula2` (`cedula`),
  CONSTRAINT `fk_cedula2` FOREIGN KEY (`cedula`) REFERENCES `estudiantef` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Volcando datos para la tabla proyectot2.cambiomenstruacion: ~0 rows (aproximadamente)
INSERT INTO cambiomenstruacion VALUES('11111111', 'Alegre', 'Cabeza', 'Bajo', '2024-11-25', '11');
INSERT INTO cambiomenstruacion VALUES('22222222', 'Ansiosa', 'Espalda', 'Bajo', '2024-11-25', '12');
INSERT INTO cambiomenstruacion VALUES('11111111', 'Alegre', 'Espalda', 'Bajo', '2024-11-25', '13');
INSERT INTO cambiomenstruacion VALUES('22222222', 'Alegre', 'Espalda', 'Bajo', '2024-11-25', '14');
INSERT INTO cambiomenstruacion VALUES('33333333', 'Alegre', 'Espalda', 'Bajo', '2024-11-25', '15');

-- Volcando estructura para tabla proyectot2.ciclomenstrual
CREATE TABLE `ciclomenstrual` (
  `cedula` int(11) NOT NULL,
  `fechainiciou` date NOT NULL,
  `fechainicioa` date NOT NULL,
  `intensidadflujo` enum('Bajo','Medio','Alto') NOT NULL,
  `duracion` int(11) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `ovulacion` date NOT NULL,
  `diasfertilesantes` int(11) NOT NULL,
  `diasfertilesdespues` int(11) NOT NULL,
  `diasseguridadantes` int(11) NOT NULL,
  `diasseguridaddespues` int(11) NOT NULL,
  `proximociclo` date NOT NULL,
  `fecharegistro` date DEFAULT NULL,
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`codigo`),
  KEY `fk_cedula3` (`cedula`),
  CONSTRAINT `fk_cedula3` FOREIGN KEY (`cedula`) REFERENCES `estudiantef` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Volcando datos para la tabla proyectot2.ciclomenstrual: ~0 rows (aproximadamente)
INSERT INTO ciclomenstrual VALUES('11111111', '2024-11-01', '2024-11-24', 'Bajo', '23', 'Normal', '2024-11-12', '10', '12', '9', '13', '2024-12-17', '2024-11-25', '9');

-- Volcando estructura para tabla proyectot2.diagnostico
CREATE TABLE `diagnostico` (
  `codhc` int(11) NOT NULL,
  `cedula` int(11) NOT NULL,
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`codigo`),
  KEY `fk_codhc` (`codhc`),
  KEY `fk_cedula4` (`cedula`),
  CONSTRAINT `fk_cedula4` FOREIGN KEY (`cedula`) REFERENCES `estudiantef` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_codhc` FOREIGN KEY (`codhc`) REFERENCES `historialciclo` (`codhc`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Volcando datos para la tabla proyectot2.diagnostico: ~0 rows (aproximadamente)

-- Volcando estructura para tabla proyectot2.estudiantef
CREATE TABLE `estudiantef` (
  `cedula` int(11) NOT NULL,
  `nacionalidad` enum('V','E') NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `fechanace` date NOT NULL,
  `correo` varchar(50) NOT NULL DEFAULT '',
  `peso` float NOT NULL,
  `altura` int(11) NOT NULL,
  `fecharegistro` date DEFAULT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Volcando datos para la tabla proyectot2.estudiantef: ~0 rows (aproximadamente)
INSERT INTO estudiantef VALUES('11111111', 'V', 'Jesus Eduardo', '2007-10-18', '416', '40.0', '200', '2024-11-25');
INSERT INTO estudiantef VALUES('22222222', 'V', 'Lucy Mendez', '2007-08-21', 'play26087@gmail.com', '54.32', '160', '2024-11-25');
INSERT INTO estudiantef VALUES('26781065', 'V', 'Daniel Parra', '2006-10-13', '412', '69.0', '156', '0000-00-00');
INSERT INTO estudiantef VALUES('33333333', 'V', 'Gabriela Salazar', '2007-11-15', 'grabiela@gmail.com', '44.0', '150', '2024-11-25');

-- Volcando estructura para tabla proyectot2.historialciclo
CREATE TABLE `historialciclo` (
  `codhc` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` int(11) NOT NULL,
  PRIMARY KEY (`codhc`),
  KEY `fk_cedula5` (`cedula`),
  CONSTRAINT `fk_cedula5` FOREIGN KEY (`cedula`) REFERENCES `estudiantef` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Volcando datos para la tabla proyectot2.historialciclo: ~0 rows (aproximadamente)

-- Volcando estructura para tabla proyectot2.respaldoseguridad
CREATE TABLE `respaldoseguridad` (
  `opcion` enum('si','no') NOT NULL,
  PRIMARY KEY (`opcion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Volcando datos para la tabla proyectot2.respaldoseguridad: ~0 rows (aproximadamente)

-- Volcando estructura para tabla proyectot2.sintomas
CREATE TABLE `sintomas` (
  `cedula` int(11) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `intensidad` varchar(20) NOT NULL,
  `durabilidad` varchar(20) NOT NULL,
  `fecharegistro` date DEFAULT NULL,
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`codigo`),
  KEY `fk_cedula` (`cedula`),
  CONSTRAINT `fk_cedula` FOREIGN KEY (`cedula`) REFERENCES `estudiantef` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Volcando datos para la tabla proyectot2.sintomas: ~0 rows (aproximadamente)
INSERT INTO sintomas VALUES('11111111', 'Calambres', 'Minutos', 'Bajo', '2024-11-25', '22');
INSERT INTO sintomas VALUES('22222222', 'Calambres', 'Minutos', 'Bajo', '2024-11-25', '23');
INSERT INTO sintomas VALUES('33333333', 'Dolor lumbar', 'Un día', 'Medio', '2024-11-25', '24');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
