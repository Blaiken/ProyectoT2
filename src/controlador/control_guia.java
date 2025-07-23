package controlador;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Diagnostico;

public class control_guia {
    
    conexion_bd con = new conexion_bd();
    
    public void BuscarCedula(JTextField TextCedula, JTextField TextCorreo, JLabel LblCedula){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            
            String consulta = "SELECT correo FROM estudiantef WHERE cedula LIKE ?;";
                ps = con.establecerConexion().prepareStatement(consulta);
                ps.setString(1, TextCedula.getText());
                rs = ps.executeQuery();
                
                while (rs.next()){
                    TextCorreo.setText(rs.getString("correo"));
                }
                
                LblCedula.setText(TextCedula.getText());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros.\nError: " + e.toString());
        }
        
    }
    
    public static boolean ComprobarConexion() {
        try {
            URL url = new URL("http://www.google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(5000);
            connection.connect();
            int responseCode = connection.getResponseCode();
            return (200 <= responseCode && responseCode <= 399);
        } catch (IOException e) {
            return false;
        }
    }
    
        private static String emailFrom = "menstrutrackproject@gmail.com";
        private static String passwordFrom = "auqncwjfuiuwtcdp";

        private Properties mProperties;
        private Session mSession;
        private MimeMessage mCorreo;

        public File[] mArchivosAdjuntos;
        public String nombres_archivos;
        

    public control_guia() {
        this.mArchivosAdjuntos = new File[1]; // Inicializa la variable con tamaño 1 para evitar NullPointerException
        this.nombres_archivos = "";
    }

    public void setArchivosAdjuntos(File[] archivos) {
        this.mArchivosAdjuntos = archivos;
        this.nombres_archivos = "";
        for (File archivo : archivos) {
            this.nombres_archivos += archivo.getName() + "<br>";
        }
    }

    public void CrearEmail(JTextField LblCorreo, JLabel LblNombre) {
        mProperties = new Properties();
        nombres_archivos = "";

        String emailTo = LblCorreo.getText().trim();
        String subject = "Guìa - Ginecología";
        String content = "Entrega de la guìa a " + LblNombre.getText() + ".";

        // Simple mail transfer protocol
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");

        mSession = Session.getDefaultInstance(mProperties);

        try {
            MimeMultipart mElementosCorreo = new MimeMultipart();
            // Contenido del correo
            MimeBodyPart mContenido = new MimeBodyPart();
            mContenido.setContent(content, "text/html; charset=utf-8");
            mElementosCorreo.addBodyPart(mContenido);

            // Agregar archivo adjunto
            if (mArchivosAdjuntos.length > 0 && mArchivosAdjuntos[0] != null) {
                MimeBodyPart mAdjunto = new MimeBodyPart();
                mAdjunto.setDataHandler(new DataHandler(new FileDataSource(mArchivosAdjuntos[0].getAbsolutePath())));
                mAdjunto.setFileName(mArchivosAdjuntos[0].getName());
                mElementosCorreo.addBodyPart(mAdjunto);
            }

            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailFrom));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setContent(mElementosCorreo);

        } catch (AddressException ex) {
            Logger.getLogger(Diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EnviarEmail() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailFrom, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();

            JOptionPane.showMessageDialog(null, "¡Correo enviado!");
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(Diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Diagnostico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Compartir(JTextField LblCorreo, JLabel LblNombre){
        if(ComprobarConexion()){
            CrearEmail(LblCorreo, LblNombre);
            EnviarEmail();
        } else {
            JOptionPane.showMessageDialog(null, "No estás conectado a Internet...\nVerifica tu conexión.");
        }
    }
    
}
