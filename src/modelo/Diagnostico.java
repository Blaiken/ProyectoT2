package modelo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
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
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class Diagnostico {
    
    public void generar_reporte(JLabel TextNombre, JLabel TextCedula, 
            JLabel TextFechaNacimiento, JLabel TextCorreo, JLabel TextPeso, 
            JLabel TextEstatura, JLabel TextFechaInicioU, JLabel TextFechaInicioA, JLabel TextIntecidadFlujo,
            JLabel TextDuracion, JLabel TextOvulacion, JLabel TextDiasFertiles, JLabel TextDiasSeguridad,
            JLabel TextProximoCiclo, JLabel TextPeriodo, JTable tablaSintoma) throws BadElementException, IOException {
        
        Document document = new Document();
        String Estudiante = TextNombre.getText();
        String Cedula = TextCedula.getText();
        String FechaNacimiento = TextFechaNacimiento.getText();
        String Correo = TextCorreo.getText();
        String Peso = TextPeso.getText();
        String Estatura = TextEstatura.getText();
        String FechaInicioU = TextFechaInicioU.getText();
        String FechaInicioA = TextFechaInicioA.getText();
        String IntencidadFlujo = TextIntecidadFlujo.getText();
        String Duracion = TextDuracion.getText();
        String Ovulacion = TextOvulacion.getText();
        String Diasfertiles = TextDiasFertiles.getText();
        String DiasSeguridad = TextDiasSeguridad.getText();
        String ProximoCiclo = TextProximoCiclo.getText();
        String Periodo = TextPeriodo.getText();
        String dest = ".pdf";
      
        try {
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar diagnóstico de " + Estudiante + "...");
            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File Destino = fileChooser.getSelectedFile();
                PdfWriter.getInstance(document, new FileOutputStream(Destino + dest));
            }
            
            document.open();
           
            Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
            Paragraph PTituloPrincipal = new Paragraph("- Diagnóstico -", fuenteNegrita);
            PTituloPrincipal.setSpacingAfter(10f);
            PTituloPrincipal.setAlignment(Element.ALIGN_CENTER);
            document.add(PTituloPrincipal);
            
            Font fuenteGrande = new Font(Font.FontFamily.TIMES_ROMAN,16);
            Paragraph PNombre = new Paragraph ("Nombre: " + Estudiante + ".", fuenteGrande);
            PNombre.setSpacingAfter(10f);
            document.add(PNombre);
            
            Paragraph PCedula = new Paragraph ("Cédula: " + Cedula + ".", fuenteGrande);
            PCedula.setSpacingAfter(10f);
            document.add(PCedula);
            
            Paragraph PFechaNacimiento = new Paragraph ("Fecha de nacimiento: " + FechaNacimiento + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PFechaNacimiento);
            
            Paragraph PTelefono = new Paragraph ("Correo electrónico: " + Correo + ".", fuenteGrande);
            PCedula.setSpacingAfter(10f);
            document.add(PTelefono);
            
            Paragraph PPeso = new Paragraph ("Peso: " + Peso + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PPeso);
            
            Paragraph PEstatura = new Paragraph ("Estatura: " + Estatura + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PEstatura);
            
            Paragraph PFechaInicioU = new Paragraph ("Fecha de Inicio-Último: " + FechaInicioU + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PFechaInicioU);
            
            Paragraph PFechaInicioA = new Paragraph ("Fecha de Inicio-Actual: " + FechaInicioA + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PFechaInicioA);
            
            Paragraph PIntencidadFlujo = new Paragraph ("Intencidad del Flujo: " + IntencidadFlujo + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PIntencidadFlujo);
            
            Paragraph PDuracion = new Paragraph ("Duración: " + Duracion + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PDuracion);
            
            Paragraph POvulacion = new Paragraph ("Ovulación: " + Ovulacion + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(POvulacion);
            
            Paragraph PDiasFertiles = new Paragraph ("Días Fértiles: " + Diasfertiles + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PDiasFertiles);
            
            Paragraph PDiasSeguridad = new Paragraph ("Días de Seguridad: " + DiasSeguridad+ ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PDiasSeguridad);
            
            Paragraph PProximoCiclo = new Paragraph ("Próximo Ciclo: " + ProximoCiclo + ".", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PProximoCiclo);
            
            Paragraph PPeriodo = new Paragraph (Periodo + "\nLo màs recomendable es que hagas una prueba de embarazo.", fuenteGrande);
            PFechaNacimiento.setSpacingAfter(10f);
            document.add(PPeriodo);
            
            Font fuenteNegritaSub = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
            Paragraph parrafo12 = new Paragraph("Diagnóstico de Síntomas", fuenteNegritaSub);
            parrafo12.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo12.setSpacingAfter(10f);
            document.add(parrafo12);
            
            TableModel modelo = tablaSintoma.getModel();
            int filas = modelo.getRowCount();
            Font fuenteNegrita2 = new Font(Font.FontFamily.HELVETICA,16,Font.BOLD);
            Font fuenteMediana = new Font(Font.FontFamily.TIMES_ROMAN,12);
            for (int i = 0; i < filas; i++) {
                Paragraph sintoma = new Paragraph (modelo.getValueAt(i, 0) + " -> Durabilidad: " + modelo.getValueAt(i, 1) + ", Intensidad: " +  modelo.getValueAt(i, 2), fuenteGrande);
                sintoma.setSpacingAfter(10f);
                document.add(sintoma);
                if (modelo.getValueAt(i, 0).equals("Calambres")){
                    Paragraph parrafo2 = new Paragraph ("- Calambres", fuenteNegrita2);
                    parrafo2.setSpacingAfter(10f);
                    document.add(parrafo2);

                    
                    Paragraph parrafo3 = new Paragraph ("Los calambres menstruales son dolores., Estos dolores suelen ser cólicos y pueden variar en intensidad de leves a muy fuertes.", fuenteMediana);
                    parrafo3.setSpacingAfter(10f);
                    document.add(parrafo3);
                    Paragraph parrafo4 = new Paragraph ("La causa principal de los calambres menstruales son las prostaglandinas, unas sustancias químicas que hacen que el útero se contraiga para expulsar el revestimiento uterino. Un nivel elevado de prostaglandinas puede causar contracciones más fuertes y dolorosas.");
                    parrafo4.setSpacingAfter(10f);
                    document.add(parrafo4);
                    
                    Paragraph parrafo5 = new Paragraph ("- Recomendaciones", fuenteNegrita2);
                    parrafo5.setSpacingAfter(10f);
                    document.add(parrafo5);

                    Paragraph parrafo6 = new Paragraph ("·Aplicación de calor: utiliza una almohadilla térmica o una botella de agua caliente en la zona abdominal baja. El calor relaja los músculos y reduce el dolor.");
                    parrafo6.setSpacingAfter(10f);
                    document.add(parrafo6);

                    Paragraph parrafo7 = new Paragraph ("·Baños calientes: Sumergirte en un bao caliente puede ser muy relajante y aliviar la tensión muscular", fuenteMediana);
                    parrafo7.setSpacingAfter(10f);
                    document.add(parrafo7);

                    Paragraph parrafo8 = new Paragraph ("Si tus calambres menstruales son muy fuertes, interfieren con tus actividades diarias o empeoran con el tiempo, es importante que consultes a un médico.", fuenteMediana);
                    parrafo8.setSpacingAfter(10f);
                    document.add(parrafo8);
                } else if (modelo.getValueAt(i, 0).equals("Dolor en los senos")){
                    
                    Paragraph parrafo9 = new Paragraph ("- Dolor en los senos", fuenteNegrita2);
                    parrafo9.setSpacingAfter(10f);
                    document.add(parrafo9);

                    Paragraph parrafo10 = new Paragraph ("El dolor en los senos es una queja común entre muchas mujeres, especialmente durante el ciclo menstrual. Esta molestia, también conocida como mastalgia, suele ser causada por los cambios hormonales que ocurren durante este período.", fuenteMediana); 
                    parrafo10.setSpacingAfter(10f);
                    document.add(parrafo10);

                    Paragraph parrafo11 = new Paragraph ("- Causas por las que duelen los senos durante la menstruación", fuenteNegrita2);
                    parrafo11.setSpacingAfter(10f);
                    document.add(parrafo11);

                    Paragraph parrafo124 = new Paragraph ("·Fluctuaciones hormonales: El aumento en los niveles de estrógeno y progesterona antes de la menstruación provoca que los tejidos de los senos se hinchen y se vuelvan más sensibles.", fuenteMediana);
                    parrafo124.setSpacingAfter(10f);
                    document.add(parrafo124);

                    Paragraph parrafo13 = new Paragraph ("·Retención de líquidos: Estos cambios hormonales también pueden causar retención de líquidos en los senos, lo que aumenta la sensibilidad y el dolor.", fuenteMediana);
                    parrafo13.setSpacingAfter(10f);
                    document.add(parrafo13);

                    Paragraph parrafo14 = new Paragraph ("·Cambios en el tejido mamario: Los tejidos mamarios pueden experimentar cambios en su estructura y tamaño durante el ciclo menstrual, lo que puede provocar dolor.", fuenteMediana);
                    parrafo14.setSpacingAfter(10f);
                    document.add(parrafo14);

                    Paragraph parrafo16 = new Paragraph ("- Recomendaciones", fuenteNegrita2);
                    parrafo16.setSpacingAfter(10f);
                    document.add(parrafo16);

                    Paragraph parrafo17 = new Paragraph ("En la mayoría de los casos, el dolor en los senos relacionado con el ciclo menstrual es benigno y no requiere tratamiento médico. Sin embargo, es importante consultar a un médico si:", fuenteMediana);
                    parrafo17.setSpacingAfter(10f);
                    document.add(parrafo17);

                    Paragraph parrafo18 = new Paragraph ("·El dolor es intenso y persistente.\n·Se presenta acompañado de otros síntomas como bultos, enrojecimiento o secreción por el pezón.\n·El dolor empeora con el tiempo.", fuenteMediana);
                    parrafo18.setSpacingAfter(10f);
                    document.add(parrafo18);
            
                } else if (modelo.getValueAt(i, 0).equals("Brotes de acné")){
                    
                    Paragraph parrafo19 = new Paragraph ("- Brotes de acné", fuenteNegrita2);
                    parrafo19.setSpacingAfter(10f);
                    document.add(parrafo19);

                    Paragraph parrafo20 = new Paragraph ("Los brotes de acné durante su ciclo menstrual se debe principalmente a las fluctuaciones hormonales que ocurren durante el ciclo menstrual.", fuenteMediana);
                    parrafo20.setSpacingAfter(10f);
                    document.add(parrafo20);

                    Paragraph parrafo21 = new Paragraph ("Pueden aparecer tanto por el aumento de andrógenos(que estimulan las glándulas sebáceas, haciendo que produzcan más sebo), como por obstrucción en los poros, o inflamación debido a los cambios hormonal.", fuenteMediana);
                    parrafo21.setSpacingAfter(10f);
                    document.add(parrafo21);

                    Paragraph parrafo22 = new Paragraph ("- Recomendación", fuenteNegrita2);
                    parrafo22.setSpacingAfter(10f);
                    document.add(parrafo22);

                    Paragraph parrafo23 = new Paragraph ("·Evita tocarse la cara: Las manos pueden transferir bacterias a la piel y empeorar el acné.", fuenteMediana);
                    parrafo23.setSpacingAfter(10f);
                    document.add(parrafo23);
            
                } else if (modelo.getValueAt(i, 0).equals("Fatiga")){
                    
                     
                    Paragraph parrafo24 = new Paragraph ("- Fatiga", fuenteNegrita2);
                    parrafo24.setSpacingAfter(10f);
                    document.add(parrafo24);

                    Paragraph parrafo25 = new Paragraph ("Durante el ciclo menstrual suelen ocurrir una sería de cambios hormonales y los niveles de las hormonas como estrógenos y progesterona varían durante el ciclo, estos cambios pueden afectar tanto el metabolismo, como el ciclo del sueño entre otros, contribuyendo a la fatiga, como también durante la menstruación, se suele perder sangre, nutrientes y hierro, esto puede causar  anemia  lo cual produce Fatiga.", fuenteMediana);
                    parrafo25.setSpacingAfter(10f);
                    document.add(parrafo25);

                    Paragraph parrafo26 = new Paragraph ("La fatiga bien podría ser un síntoma del síndrome Premenstrual, aunque si la fatiga menstrual interfiere significativamente con tu vida diaria o si sospechas que puede haber una causa subyacente, es importante consultar a un médico.", fuenteMediana);
                    parrafo26.setSpacingAfter(10f);
                    document.add(parrafo26);
            
                } else if (modelo.getValueAt(i, 0).equals("Hinchazón abdominal")){
                    
                     
                     Paragraph parrafo27 = new Paragraph ("- Hinchazón abdominal", fuenteNegrita2);
                    parrafo27.setSpacingAfter(10f);
                    document.add(parrafo27);

                    Paragraph parrafo28 = new Paragraph ("La principal razón de la hinchazón abdominal durante el periodo menstrual son las fluctuaciones hormonales. Los niveles de estrógeno y progesterona, las hormonas que regulan el ciclo menstrual, experimentan cambios significativos. Estos cambios hormonales pueden provocar:", fuenteMediana); 
                    parrafo28.setSpacingAfter(10f);
                    document.add(parrafo28);

                    Paragraph parrafo29 = new Paragraph ("·Retención de líquidos: El estrógeno puede hacer que el cuerpo retenga más líquido, lo que se traduce en una sensación de hinchazón.", fuenteMediana);
                    parrafo29.setSpacingAfter(10f);
                    document.add(parrafo29);    

                    Paragraph parrafo30 = new Paragraph ("·Cambios en el sistema digestivo: La progesterona puede ralentizar el sistema digestivo, causando gases y estreñimiento, lo que contribuye a la sensación de hinchazón.", fuenteMediana);   
                    parrafo30.setSpacingAfter(10f);
                    document.add(parrafo30);       

                    Paragraph parrafo31 = new Paragraph ("- Recomendaciones", fuenteNegrita2);
                    parrafo31.setSpacingAfter(10f);
                    document.add(parrafo31);

                    Paragraph parrafo32 = new Paragraph ("·Reduce el consumo de sodio: La sal retiene liquídos, asi que limita el consumo de alimentos procesados.", fuenteMediana);
                    parrafo32.setSpacingAfter(10f);
                    document.add(parrafo32);

                    Paragraph parrafo33 = new Paragraph ("·Aumenta el consumo de potasio:Alimentos ricos en potasio como espinacas y aguacate ayudan a equilibrar los niveles de sodio y reducir la retención de liquidos.", fuenteMediana);
                    parrafo33.setSpacingAfter(10f);
                    document.add(parrafo33);

                    Paragraph parrafo34 = new Paragraph  ("·Limita los alimentos flatulentos:Brócoli, coliflor, legumbres pueden aumentar la producción de gases y aumentar la inchazón.", fuenteMediana);
                    parrafo34.setSpacingAfter(10f);
                    document.add(parrafo34);       

                    Paragraph parrafo35 = new Paragraph ("Si la hinchazón abdominal es persistente, intensa o va acompañada de otros síntomas como dolor abdominal severo, fiebre, vómitos, sangrado anormal o dificultad para orinar, es importante consultar a un médico.", fuenteMediana);
                    parrafo35.setSpacingAfter(10f);
                    document.add(parrafo35);
            
                } else if (modelo.getValueAt(i, 0).equals("Dolor lumbar")){
                    
                     
                    Paragraph parrafo36 = new Paragraph ("- Dolor lumbar", fuenteNegrita2);
                    parrafo36.setSpacingAfter(10f);
                    document.add(parrafo36);

                    Paragraph parrafo37 = new Paragraph ("Las principales causas del dolor lumbar durante la menstruación son las contracciones uterinas, que se producen al expulsar el revestimiento uterino, y el aumento de prostaglandinas, que provocan tanto contracciones como inflamación en los tejidos cercanos. Además, la tensión muscular en la espalda baja, a menudo causada por posturas incómodas o estrés, puede agravar este dolor.", fuenteMediana);
                    parrafo37.setSpacingAfter(10f);
                    document.add(parrafo37);

                    Paragraph parrafo38 = new Paragraph ("- Recomendaciones", fuenteNegrita2);
                    parrafo38.setSpacingAfter(10f);
                    document.add(parrafo38);

                    Paragraph parrafo39 = new Paragraph ("·Aplicación de calor\n·Baños calientes", fuenteMediana);
                    parrafo39.setSpacingAfter(10f);
                    document.add(parrafo39);
                } else if (modelo.getValueAt(i, 0).equals("Retención de liquidos")){
                    
                     
                    Paragraph parrafo40 = new Paragraph ("- Retención de liquidos", fuenteNegrita2);
                    parrafo40.setSpacingAfter(10f);
                    document.add(parrafo40);

                    Paragraph parrafo41 = new Paragraph ("La causa de la retención de líquidos durante la menstruación son las fluctuaciones hormonales. Los niveles de estrógeno y progesterona, hormonas que regulan el ciclo menstrual, experimentan cambios significativos. Estos cambios hormonales pueden hacer que el cuerpo retenga más líquido.", fuenteMediana);
                    parrafo41.setSpacingAfter(10f);
                    document.add(parrafo41);

                    Paragraph parrafo42 = new Paragraph ("- Recomendación", fuenteNegrita2);
                    parrafo42.setSpacingAfter(10f);
                    document.add(parrafo42);

                    Paragraph parrafo43 = new Paragraph ("·En la alimentación:Reduce el consumo de sal, aumenta el consumo de alimentos ricos en potasio, como bananas, aguacate y espinacas.", fuenteMediana);
                    parrafo43.setSpacingAfter(10f);
                    document.add(parrafo43);
                } else {
                    Paragraph parrafo40 = new Paragraph ("Diagnóstico a evaluar por parte de la Ginecóloga", fuenteMediana);
                    parrafo40.setSpacingAfter(10f);
                    document.add(parrafo40);
                }
            }
            
            Paragraph parrafo44 = new Paragraph ("- Cambios", fuenteNegrita2);
            parrafo44.setSpacingAfter(10f);
            document.add(parrafo44);
            
            Paragraph parrafo45 = new Paragraph ("A lo largo del ciclo menstrual, los niveles de estrógeno y progesterona, las hormonas sexuales femeninas, experimentan cambios constantes. Estos cambios hormonales influyen directamente en nuestro sistema nervioso central, lo que a su vez afecta nuestro estado de ánimo y emociones.", fuenteMediana);
            parrafo45.setSpacingAfter(10f);
            document.add(parrafo45);       
          
            Paragraph parrafo46 = new Paragraph ("Es completamente normal experimentar cambios de humor durante el ciclo menstrual.", fuenteMediana); 
            parrafo46.setSpacingAfter(10f);
            document.add(parrafo46);
           
            Paragraph parrafo47 = new Paragraph ("- Tipo de dolor", fuenteNegrita2);
            parrafo47.setSpacingAfter(10f);
            document.add(parrafo47);
            
            Paragraph parrafo48 = new Paragraph ("·Espalda: Durante la menstruación, el útero se contrae para expulsar el revestimiento uterino. Estas contracciones pueden causar dolor no solo en el abdomen, sino también irradiarse hacia la espalda baja.", fuenteNegrita2);
            parrafo48.setSpacingAfter(10f);
            document.add(parrafo48);
           
            Paragraph parrafo49 = new Paragraph ("·Cabeza: Antes de la menstruación, los niveles de estrógeno disminuyen. Esta disminución puede estar provocando cambios en los vasos sanguíneos del cerebro y desencadenar el dolor de cabeza.", fuenteNegrita2);
            parrafo49.setSpacingAfter(10f);
            document.add(parrafo49);
            
            document.close();
            
            JOptionPane.showMessageDialog(null, "El diagnóstico guardado con éxito.");
            
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al crear el PDF: " + e.getMessage());
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
        

    public Diagnostico() {
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
        String subject = "Ginecología";
        String content = "Entrega al número de cédula " + LblNombre.getText() + ".";

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
