package controlador;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Image;
import java.io.IOException;
import com.itextpdf.text.PageSize;
import java.io.File;
import javax.swing.JFileChooser;

public class guiapdf {
    
    public void crearPDF() throws BadElementException, IOException {
        Document document = new Document();
        String dest = "GuiaGinecologa.pdf";
        try {
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar PDF");
            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File Destino = fileChooser.getSelectedFile();
                PdfWriter.getInstance(document, new FileOutputStream(Destino + dest));
            }        
            
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();
           
            Font fuenteNegrita = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
            Paragraph parrafo1 = new Paragraph("Ciclo Menstrual y Anatomía Femenina", fuenteNegrita);
            parrafo1.setSpacingAfter(10f);
            document.add(parrafo1);
           
            Font fuenteGrande = new Font(Font.FontFamily.TIMES_ROMAN,12);
            Paragraph parrafo50 = new Paragraph ("El ciclo menstrual o ciclo ovárico consiste en una serie de cambios regulares que de forma natural ocurren en el sistema reproductor femenino los cuales hacen posible el embarazo o la menstruación, en caso de que el primero no tenga lugar, durante este ciclo se desarrollan los ovocitos.", fuenteGrande);
            parrafo50.setSpacingAfter(10f);
            document.add(parrafo50);
           
            Font fuenteNegrita2 = new Font(Font.FontFamily.HELVETICA,16,Font.BOLD);
            Paragraph parrafo2 = new Paragraph ("La menstruacion", fuenteNegrita2);
            parrafo2.setSpacingAfter(10f);
            document.add(parrafo2);
            
            Paragraph parrafo3 = new Paragraph ("Es la descamación del revestimiento interno del útero(endometrio), que se acompaa d sangrado. se produce aproximadamente en ciclos mensuales durante los años fértiles de la vida de la mujer, excepto durante el embarazo.", fuenteGrande);
            parrafo3.setSpacingAfter(10f);
            document.add(parrafo3);
            
            Paragraph parrafo4 = new Paragraph ("La menstruación empieza en la pubertad (con la menarquia) y cesa definitivamente con la menopausia.la menopausia se define como 1 año después del ultimo ciclo menstrual.", fuenteGrande);
            parrafo4.setSpacingAfter(10f);
            document.add(parrafo4);
           
            String rutaImagen = "imagenes/imagen2.jpg";
            Image imagen = Image.getInstance(rutaImagen);
            imagen.setAlignment(Image.ALIGN_CENTER);
            imagen.setSpacingBefore(10f);
            document.add(imagen);
            
            Paragraph parrafo5 = new Paragraph ("La primera menstruación ocurre entre los once y quince años y recibe el nombre de menarquía. La edad promedio de la menarquía es generalmente superior en los países desarrollados que en los países en vías de desarrollo. La misma aparece cuando todas las partes del aparato reproductor de la niña han madurado y funcionan en conjunto. Esto indica el comienzo de la capacidad reproductiva.", fuenteGrande);
            parrafo5.setSpacingAfter(10f);
            document.add(parrafo5);
            
            Paragraph parrafo6 = new Paragraph ("Durante la primera menstruación se desprende el endometrio junto a una cantidad de sangre. Este sangrado suele tomarse como señal de que una mujer no está embarazada (aunque existen algunas excepciones que pueden causar sangrados durante el embarazo; en el inicio del embarazo pueden producir un fuerte sangrado).", fuenteGrande);
            parrafo6.setSpacingAfter(10f);
            document.add(parrafo6);
            
            Paragraph parrafo7 = new Paragraph ("La menstruación media suele durar unos días, normalmente entre tres y cinco, aunque se considera normal las que estén entre dos y siete días. La pérdida de sangre suele ser de unos 35 ml, considerándose normal entre 10 y 80 ml. Las mujeres que tienen menorragia tienen predisposición a sufrir anemia", fuenteGrande);
            parrafo7.setSpacingAfter(10f);
            document.add(parrafo7);
            
            Paragraph parrafo8 = new Paragraph ("Durante los primeros días de la menstruación son comunes los dolores en el abdomen, la espalda o la parte superior de los muslos. El dolor uterino severo se conoce como dismenorrea y es más frecuente entre las adolescentes y mujeres jóvenes (afectando al 67,2 % de las adolescentes). La dismenorrea puede explicarse como un proceso inflamatorio. Aunque aun se desconocen muchos aspectos, se sabe que el proceso es mediado por prostaglandinas y células polimorfonucleares. La progesterona tiene propiedades antiinflamatorias, al caer los niveles de progesterona se desencadena el proceso inflamatorio. Cuando comienza la menstruación los síntomas del síndrome premenstrual, como irritabilidad o hinchazón y dolor de los pechos, decrecen.Existen a la venta gran variedad de productos sanitarios para que las mujeres usen durante la menstruación (compresas, tampones y copas).", fuenteGrande);
            parrafo8.setSpacingAfter(10f);
            document.add(parrafo8);
            
            Paragraph parrafo9 = new Paragraph ("Fases del Ciclo Menstrual", fuenteNegrita2);
            parrafo9.setSpacingAfter(10f);
            document.add(parrafo9);
          
            Font fuenteNegrita3 = new Font(Font.FontFamily.UNDEFINED,13,Font.BOLD);
            Paragraph parrafo10 = new Paragraph ("- Fase Menstrual", fuenteNegrita3);
            parrafo10.setSpacingAfter(10f);
            document.add(parrafo10);
            
            Paragraph parrafo11 = new Paragraph ("La bajada de estrógenos y progesterona en el cuerpo de la mujer provoca que se desprenda el endometrio que recubre el interior uterino, el cual se expulsa a través de un sangrado vaginal", fuenteGrande);
            parrafo11.setSpacingAfter(10f);
            document.add(parrafo11);
            
            Paragraph parrafo12 = new Paragraph ("- Preovulación", fuenteNegrita3);
            parrafo12.setSpacingAfter(10f);
            document.add(parrafo12);
            
            Paragraph parrafo13 = new Paragraph ("También llamada fase folicular o fase proliferativa ya que durante este periodo el endometrio crece y se engruesa por acción del estradiol.[11] Suele durar desde el primer hasta el decimotercer día del ciclo.", fuenteGrande);
            parrafo13.setSpacingAfter(10f);
            document.add(parrafo13);
            
            Paragraph parrafo14 = new Paragraph ("A través de la influencia de la hormona foliculoestimulante (FSH), que aumenta durante los primeros días del ciclo, se estimulan unos pocos folículos ováricos. Estos folículos, presentes desde el nacimiento,se van desarrollando en un proceso llamado foliculogénesis.", fuenteGrande);
            parrafo14.setSpacingAfter(10f);
            document.add(parrafo14);
            
            Paragraph parrafo15 = new Paragraph ("La foliculogénesis comprende la formación y maduración del folículo ovárico, una densa cáscara empaquetada de células somáticas que contiene un ovocito inmaduro y donde tiene lugar la meiosis. Eso describe la progresión de una serie de pequeños folículos primordiales en grandes folículos preovulatorios que ocurre en parte durante el ciclo menstrual. Dura 2 meses desde el principio hasta el final.", fuenteGrande);
            parrafo15.setSpacingAfter(10f);
            document.add(parrafo15);
          
            Paragraph parrafo16 = new Paragraph ("Posteriormente, todos los folículos dejan de crecer y entran en atresia; excepto uno. Este es el folículo dominante y continuará hasta su madurez, formando el folículo de Graaf, que contiene el ovocito que se libera en la ovulación.", fuenteGrande);
            parrafo16.setSpacingAfter(10f);
            document.add(parrafo16);
            
            Paragraph parrafo17 = new Paragraph ("- Fase Secretora", fuenteNegrita3);      
            parrafo17.setSpacingAfter(10f);
            document.add(parrafo17);
            
            Paragraph parrafo18 = new Paragraph ("El cuerpo lúteo que se forma en el ovario segrega progesterona, la cual actúa sobre el endometrio haciendo que éste alcance el grosor adecuado y se vuelva receptivo.", fuenteGrande);  
            parrafo18.setSpacingAfter(10f);
            document.add(parrafo18);
            
            Paragraph parrafo19 = new Paragraph ("- Ovulación", fuenteNegrita3);
            parrafo19.setSpacingAfter(10f);
            document.add(parrafo19);
            
            Paragraph parrafo20 = new Paragraph ("En un ciclo de 28 días se presenta entre el decimocuarto y el decimoquinto día del ciclo. El ovocito es liberado del ovario y es conducido hasta el útero a través de la trompa de Falopio (Tuba Uterina).", fuenteGrande);
            parrafo20.setSpacingAfter(10f);
            document.add(parrafo20);
            
            Paragraph parrafo21 = new Paragraph ("Durante la fase folicular, el estradiol suprime la producción de hormona luteinizante (LH) desde la glándula pituitaria anterior. Cuando el óvulo está a punto de llegar a la madurez, los niveles de estradiol llegan a un umbral sobre el que este efecto se revierte y el estrógeno estimula la producción de una gran cantidad de hormona luteinizante. Este proceso, conocido como pico de hormona luteinizante, comienza alrededor del día 12 de un ciclo medio y puede durar 48 horas.", fuenteGrande);
            parrafo21.setSpacingAfter(10f);
            document.add(parrafo21);
            
            Paragraph parrafo22 = new Paragraph ("Este pico de LH es el que produce la ovulación, pues provoca la activación de genes proinflamatorios que debilitan y rompen la pared folicular, causando que el folículo libere su ovocito secundario.Cuál de los dos ovarios ovulará cada vez, si el derecho o el izquierdo, parece ser aleatorio, y no se sabe si existe una coordinación entre ambos lados.En ocasiones, ambos ovarios liberan un óvulo, si ambos son fecundados, se dan como resultado hermanos gemelos (gemelos di-cigóticos, también llamados mellizos).", fuenteGrande); 
            parrafo22.setSpacingAfter(10f);
            document.add(parrafo22);
            
            Paragraph parrafo23 = new Paragraph ("Tras ser liberado del ovario al espacio peritoneal, el ovocito es captado por las trompas de Falopio a través de la fimbria o franja ovárica, que es un tejido ubicado al final de cada trompa de Falopio. Al cabo de aproximadamente un día, un ovocito sin fecundar se desintegra y se expulsa por el sangrado vaginal de la siguiente menstruación, comenzando así un nuevo ciclo. En cambio, si se produce la fecundación el ovocito completa su maduración, dando lugar al óvulo maduro.", fuenteGrande);
            parrafo23.setSpacingAfter(10f);
            document.add(parrafo23);
            
            Paragraph parrafo24 = new Paragraph ("La fecundación por un espermatozoide suele ocurrir en la ampolla, la sección más ancha de las trompas de Falopio. Un óvulo fecundado comienza inmediatamente el proceso de embriogénesis o desarrollo. Este embrión en desarrollo tarda unos tres días en llegar al útero y otros tres para arraigar en el endometrio.Para entonces suele haber llegado al estadio de blastocisto.", fuenteGrande);
            parrafo24.setSpacingAfter(10f);
            document.add(parrafo24);
            
            Paragraph parrafo25 = new Paragraph ("- Postovulación", fuenteNegrita3);
            parrafo25.setSpacingAfter(10f);
            document.add(parrafo25);
            
            Paragraph parrafo26 = new Paragraph ("También conocida como fase lútea o fase secretora. Suele durar del 16.º hasta el 28.º día del ciclo.", fuenteGrande);
            parrafo26.setSpacingAfter(10f);
            document.add(parrafo26);
            
            Paragraph parrafo27 = new Paragraph ("El cuerpo lúteo, que procede del folículo de Graaf después de liberar al ovocito, juega un papel importante en esta fase. Este cuerpo continúa creciendo un tiempo tras la ovulación y produce cantidades significativas de hormonas, particularmente progesterona. La progesterona juega un rol vital haciendo al endometrio receptivo para la implantación del blastocisto y para que sirva de soporte durante el inicio del embarazo; como efecto secundario eleva la temperatura basal de la mujer", fuenteGrande);
            parrafo27.setSpacingAfter(10f);
            document.add(parrafo27);
            
            Paragraph parrafo28 = new Paragraph ("Por otro lado, detiene la producción de FSH y LH que necesita para mantenerse, por lo que los niveles de progesterona decrece y el cuerpo lúteo se atrofia. Los niveles en caída de progesterona desencadenan la menstruación y el inicio del siguiente ciclo. Desde la ovulación hasta la bajada de progesterona que provoca la menstruación suelen pasar dos semanas.", fuenteGrande);
            parrafo28.setSpacingAfter(10f);
            document.add(parrafo28);
            
            Paragraph parrafo29 = new Paragraph ("Si el óvulo es fecundado, los niveles de progesterona se mantienen y, por lo tanto, no se pierde el cuerpo lúteo. Además, el embrión resultante produce gonadotropina coriónica humana (hCG), muy similar a la hormona luteinizante, permitiendo que se conserve el cuerpo lúteo. Dado que esta hormona solo se produce por el embrión, la mayoría de pruebas de embarazo buscan la presencia de esta hormona.", fuenteGrande);
            parrafo29.setSpacingAfter(10f);
            document.add(parrafo29);
            
            Paragraph parrafo30 = new  Paragraph ("Duración del Ciclo", fuenteNegrita2);
            parrafo30.setSpacingAfter(10f);
            document.add(parrafo30);
            
            Paragraph parrafo31 = new Paragraph ("Aunque mucha gente cree que el ciclo menstrual medio dura unos 28 días, un estudio a gran escala de más de 30 000 ciclos de más de 2300 mujeres reveló que el ciclo medio dura 29,1 con una desviación estándar de siete días y medio y un intervalo de predicción de entre 15 y 45 días. En este estudio, el subgrupo de datos con duraciones de ciclo entre 15 y 45 días tenía una media de 28,1 días con una desviación estándar de cuatro días. Un estudio de menor escala de 140 mujeres realizada en 2006 halló una media de 28,9 día", fuenteGrande);          
            parrafo31.setSpacingAfter(10f);
            document.add(parrafo31);
            
            Paragraph parrafo32 = new Paragraph ("La variabilidad de la duración del ciclo menstrual es mayor en mujeres por debajo de los veinticinco años y menor en mujeres de 35 y 39 años. La variabilidad se vuelve a incrementar en mujeres de 40 a 44 años. Normalmente, variaciones de la duración del ciclo entre ocho y veinte días se considera una irregularidad moderada, y una variación de 21 días o más se considera muy irregular.", fuenteGrande);
            parrafo32.setSpacingAfter(10f);
            document.add(parrafo32);
            
            Font fuenteNegrita4 = new Font(Font.FontFamily.HELVETICA,16);
            Paragraph parrafo33 = new  Paragraph ("¿Qué sucede sino me baja la regla en un tiempo estimado?", fuenteNegrita4);
            parrafo33.setSpacingAfter(10f);
            document.add(parrafo33);
            
            Paragraph parrafo34 = new Paragraph ("Que no te baje la menstruación en un mes puede ser una de las primeras señales de embarazo. Sin embargo, no siempre quiere decir que éste sea el motivo. A veces, simplemente no te baja el periodo un mes sin razón alguna, sobre todo durante los primeros años después de que baja por primera vez. Muchas otras cosas pueden hacer que tu ciclo menstrual y la regularidad de tu periodo cambien. Por ejemplo:", fuenteGrande);
            parrafo34.setSpacingAfter(10f);
            document.add(parrafo34);
            
            Paragraph parrafo35 = new Paragraph ("- Usar anticonceptivos hormonales, como las pastillas anticonceptivas, el parche anticonceptivo, el anillo vaginal, el implante anticonceptivo o el dispositivo intrauterino (DIU) hormonal.\n- Tomar la pastilla del día después.\n- Cambios hormonales.\n- Tener una enfermedad.\n- Tomar ciertos medicamentos.\n- Hacer mucho ejercicio.\n- Tener una alimentación y una nutrición malas.\n- Tener estrés.\n- Subir o bajar de peso repentinamente.\n- Tener muy poca grasa corporal, lo que puede pasar si eres atleta o tienes algún trastorno alimenticio.", fuenteGrande);
            parrafo35.setSpacingAfter(10f);
            document.add(parrafo35);
            
            String rutaImagen4 = "imagenes/imagen4.jpg";
            Image imagen4 = Image.getInstance(rutaImagen4);
            imagen4.setAlignment(Image.ALIGN_CENTER);
            imagen4.setSpacingBefore(10f);
            float anchoMaximo = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen4.scaleToFit(anchoMaximo,altoMaximo);
            document.add(imagen4);
            
            Paragraph parrafo36 = new  Paragraph ("El Utero", fuenteNegrita4); 
            parrafo36.setSpacingAfter(10f);
            document.add(parrafo36);
            
            Paragraph parrafo37 = new Paragraph ("El útero es un órgano muscular hueco que se ubica en la pelvis femenina, entre la vejiga y el recto. Los ovarios producen los óvulos, que se desplazan a través de las trompas de Falopio. Una vez que el óvulo abandona el ovario puede ser fertilizado y se implanta en las paredes del útero. La principal función del útero es alimentar al feto en desarrollo antes del nacimiento.", fuenteGrande);
            parrafo37.setSpacingAfter(10f);
            document.add(parrafo37);
            
            String rutaImagen5 = "imagenes/imagen5.jpg";
            Image imagen5 = Image.getInstance(rutaImagen5);
            imagen5.setAlignment(Image.ALIGN_CENTER);
            imagen5.setSpacingBefore(10f);
           
            float anchoMaximo5 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo5 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen5.scaleToFit(anchoMaximo5,altoMaximo5);
            document.add(imagen5);
            
            Paragraph parrafo38 = new Paragraph ("La función principal del útero es recibir al huevo (cigoto o cigota) para su implantación (véase blastocisto y endometrio) y nutrición, por medio de vasos sanguíneos especialmente desarrollados para ese propósito. El óvulo fertilizado se convierte en un embrión que se desarrolla en un feto, para luego nacer una cría de la especie determinada.", fuenteGrande); 
            parrafo38.setSpacingAfter(10f);
            document.add(parrafo38);
            
            Paragraph parrafo39 = new Paragraph ("Por ser el órgano de la menstruación, el útero está propenso a alteraciones que causan hemorragia uterina disfuncional e hiperplasia endometrial.", fuenteGrande);
            parrafo39.setSpacingAfter(10f);
            document.add(parrafo39);
            
            String rutaImagen6 = "imagenes/imagen6.jpg";
            Image imagen6 = Image.getInstance(rutaImagen6);
            imagen6.setAlignment(Image.ALIGN_CENTER);
            imagen6.setSpacingBefore(10f);
            float anchoMaximo6 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo6 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen6.scaleToFit(anchoMaximo6,altoMaximo6);
            document.add(imagen6);
            
            Paragraph parrafo40 = new  Paragraph ("Ciclos Regulares e Irregulares", fuenteNegrita4);
            parrafo40.setSpacingAfter(10f);
            document.add(parrafo40);
            
            Paragraph parrafo41= new Paragraph ("Los ciclos menstruales regulares son una parte fundamental de la salud reproductiva femenina. Se caracterizan por una duración predecible, que generalmente oscila entre 21 y 35 días, con un promedio de 28 días. Durante este ciclo, el cuerpo experimenta una serie de cambios hormonales que preparan el útero para un posible embarazo.", fuenteGrande); 
            parrafo41.setSpacingAfter(10f);
            document.add(parrafo41);
            
            Paragraph parrafo42 = new Paragraph ("Las mujeres con ciclos regulares suelen tener períodos que llegan a intervalos consistentes y experimentan síntomas similares cada mes, como calambres o cambios de humor. La regularidad del ciclo puede ser un indicador de la salud hormonal y reproductiva de una mujer.", fuenteGrande);
            parrafo42.setSpacingAfter(10f);
            document.add(parrafo42); 
            
            String rutaImagen7 = "imagenes/imagen7.jpg";
            Image imagen7 = Image.getInstance(rutaImagen7);
            imagen7.setAlignment(Image.ALIGN_CENTER);
            imagen7.setSpacingBefore(10f);
            document.add(imagen7);
            
            Paragraph parrafo43 = new Paragraph ("Por otro lado, los ciclos menstruales irregulares son aquellos en los que la duración del mismo están fuera de los rangos normales. Es importante aclarar que las menstruaciones irregulares no son más que un síntoma, jamás debe tomárselas como una enfermedad.", fuenteGrande);
            parrafo43.setSpacingAfter(10f);
            document.add(parrafo43);
            
            Paragraph parrafo44 = new Paragraph ("Los motivos por los que una mujer puede tener un ciclo menstrual irregular se pueden clasificar como:", fuenteGrande);
            parrafo44.setSpacingAfter(10f);
            document.add(parrafo44);
            
            Paragraph parrafo45 = new Paragraph ("-Primarios: son debidos a un retraso de la pubertad, ausencia de ovarios, o trastornos hormonales", fuenteGrande);
            parrafo45.setSpacingAfter(10f);
            document.add(parrafo45);
            
            Paragraph parrafo46 = new Paragraph ("-Secundarios: como consecuencia de una infección a nivel genital, cáncer de ovario, menopausia precoz o alternación en la hipófisis", fuenteGrande);
            parrafo46.setSpacingAfter(10f);
            document.add(parrafo46);
          
            String rutaImagen8 = "imagenes/imagen8.jpg";
            Image imagen8 = Image.getInstance(rutaImagen8);
            imagen8.setAlignment(Image.ALIGN_CENTER);
            imagen8.setSpacingBefore(10f);
            float anchoMaximo8 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo8 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen8.scaleToFit(anchoMaximo8,altoMaximo8);
            document.add(imagen8);
            
            Paragraph parrafo47 = new  Paragraph ("Causas comunes de ciclos irregulares", fuenteNegrita4); 
            parrafo47.setSpacingAfter(10f);
            document.add(parrafo47);
            
            Paragraph parrafo48 = new Paragraph ("- Desequilibrio hormonal.\n- Estrés .\n- Cambios de peso.\n- Ejercicio excesivo.\n- Trastornos médicos .", fuenteGrande);
            parrafo48.setSpacingAfter(10f);
            document.add(parrafo48);
           
            String rutaImagen9 = "imagenes/imagen9.jpg";
            Image imagen9 = Image.getInstance(rutaImagen9);
            imagen9.setAlignment(Image.ALIGN_CENTER);
            imagen9.setSpacingBefore(10f);
            float anchoMaximo9 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo9 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen9.scaleToFit(anchoMaximo9,altoMaximo9);
            document.add(imagen9);
            
            Paragraph parrafo49 = new Paragraph ("Los periodos de algunas personas son muy irregulares. Esto puede puede suceder porque simplemente es la manera como el cuerpo de una persona funciona naturalmente o también por un problema de salud.", fuenteGrande);
            parrafo49.setSpacingAfter(10f);
            document.add(parrafo49);
            
            Paragraph parrafo51= new  Paragraph ("Días de Seguridad", fuenteNegrita4);
            parrafo51.setSpacingAfter(10f);
            document.add(parrafo51);
            
            Paragraph parrafo52 = new Paragraph ("El ciclo menstrual promedio dura entre 28 y 32 días, aunque puede variar de una persona a otra. La ovulación generalmente ocurre alrededor del día 14 de un ciclo de 28 días, pero esto puede cambiar según la duración del ciclo.", fuenteGrande);
            parrafo52.setSpacingAfter(10f);
            document.add(parrafo52);
            
            Paragraph parrafo53 = new Paragraph ("En el ciclo de 28 días, la ovulacion sería el día 14, que es la mitad del  ciclo, se debe estar ovulando los días 13,14,15, que son los días más fértiles.", fuenteGrande);
            parrafo53.setSpacingAfter(10f);
            document.add(parrafo53);
            
            Paragraph parrafo54 = new Paragraph ("En esos tres días cuando se debe tener relaciones sexuales, pero también se debe tener un margen de seguridad de dos días hacia atrás y dos días hacia adelante, por lo menos no tener relaciones esa semana.\nPor cuestiones de seguridad en los días, 12,13,14,15,16 no, porque hay una serie de cambios hormonales y físicos  que pueden influir en la fertilidad.", fuenteGrande);
            parrafo54.setSpacingAfter(10f);
            document.add(parrafo54);
            
            Paragraph parrafo55= new  Paragraph ("Ovulación", fuenteNegrita4); 
            parrafo55.setSpacingAfter(10f);
            document.add(parrafo55);
            
            Paragraph parrafo56 = new Paragraph ("La ovulación se produce cuando sale el ovocito del ovario y se expulsa para ser recogido por las trompas de Falopio. Así, en el caso de que el esperma llegue, pueda producir la unión del ovocito y el espermatozoide en dichas trompas.", fuenteGrande); 
            parrafo56.setSpacingAfter(10f);
            document.add(parrafo56);
            
            Paragraph parrafo57= new Paragraph ("Para que esto pase durante los ciclos anteriores un grupo de folículos (como pequeños globos microscópicos rellenos de líquido, donde están ovocitos todavía inmaduros) han sido seleccionados, van creciendo y madurando, pero solo uno de ellos será el que finalmente logre ser el folículo dominante, que será capaz (bajo el influjo de las hormonas segregadas por el cerebro (hipotálamo e hipófisis), junto con las fabricadas por el ovario), de ser expulsado a través de un pequeño orificio en la superficie del ovario a la cavidad abdominal, donde las parte más distal (extremo) de la trompa recogerá ese ovocito.", fuenteGrande);
            parrafo57.setSpacingAfter(10f); 
            document.add(parrafo57);
            
            Font fuenteNegrita5 = new Font(Font.FontFamily.HELVETICA,13);
            Paragraph parrafo58= new  Paragraph ("Los 6 síntomas de ovulación que debes observar.", fuenteNegrita5); 
            parrafo58.setSpacingAfter(10f);
            document.add(parrafo58);
            
            Paragraph parrafo59= new  Paragraph ("1. Cambia tu flujo y moco cervical: textura \"clara de huevo\"", fuenteNegrita5);
            parrafo59.setSpacingAfter(10f);
            document.add(parrafo58);
            
            Paragraph parrafo60= new  Paragraph ("2. Dolor en el bajo vientre e hinchazón abdominal", fuenteNegrita5);
            parrafo60.setSpacingAfter(10f);
            document.add(parrafo60);
            
            Paragraph parrafo61= new  Paragraph ("3. Notas cambios en los pechos", fuenteNegrita5);
            parrafo61.setSpacingAfter(10f);
            document.add(parrafo61);
            
            Font fuenteNegrita6 = new Font(Font.FontFamily.UNDEFINED,13);
            Paragraph parrafo62 = new  Paragraph ("Síntomas que notas en las mamas", fuenteNegrita6);
            parrafo62.setSpacingAfter(10f);
            document.add(parrafo62);
            
            Paragraph parrafo63= new  Paragraph("- Tensión y dolor en los pechos.\n- Turgencia y sensibilidad mamaria.", fuenteNegrita6);
            parrafo63.setSpacingAfter(10f);
            document.add(parrafo63);
            
            String rutaImagen11 = "imagenes/imagen11.jpg";
            Image imagen11 = Image.getInstance(rutaImagen11);
            imagen11.setAlignment(Image.ALIGN_CENTER);
            imagen11.setSpacingBefore(10f);
            float anchoMaximo11 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo11 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen11.scaleToFit(anchoMaximo11,altoMaximo11);
            document.add(imagen11);
            
            Paragraph parrafo64= new  Paragraph ("4. Aumenta tu libido", fuenteNegrita6);
            parrafo64.setSpacingAfter(10f);
            document.add(parrafo64);
            
            Paragraph parrafo65= new  Paragraph ("5. Carrusel de sentimientos y emociones", fuenteNegrita6);
            parrafo65.setSpacingAfter(10f);
            document.add(parrafo65);
            
            Paragraph parrafo66= new  Paragraph ("6.Detectas una subida de la temperatura corporal.", fuenteNegrita6);
            parrafo66.setSpacingAfter(10f);
            document.add(parrafo66);
            
            String rutaImagen10 = "imagenes/imagen10.jpg";
            Image imagen10 = Image.getInstance(rutaImagen10);
            imagen10.setAlignment(Image.ALIGN_CENTER);
            imagen10.setSpacingBefore(10f);
           
            float anchoMaximo10 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo10 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen10.scaleToFit(anchoMaximo10,altoMaximo10);
            document.add(imagen10);
            
            Paragraph parrafo67= new  Paragraph ("Periodo Premenstrual", fuenteNegrita4);
            parrafo67.setSpacingAfter(10f);
            document.add(parrafo67);
            
            Paragraph parrafo68= new Paragraph ("El ciclo menstrual de muchas mujeres incluye una fase conocida como el periodo premenstrual, que se refiere a los días previos a la menstruación. Durante esta etapa, es común experimentar una variedad de cambios físicos y emocionales debido a las fluctuaciones hormonales. Sin embargo, no todas las mujeres experimentan estos cambios de la misma manera. Para algunas, estos síntomas son leves y manejables, mientras que para otras, pueden ser un desafío significativo. Aquí es donde entra el término síndrome premenstrual (SPM). A diferencia del simple periodo premenstrual, el SPM que muchos suelen confundir, es un conjunto más grave de síntomas que puede afectar la calidad de vida y requiere atención médica.", fuenteGrande);
            parrafo68.setSpacingAfter(10f);
            document.add(parrafo68);
            
            Paragraph parrafo69= new Paragraph ("Por lo cual el periodo premenstrual es una fase natural del ciclo menstrual, mientras que el síndrome premenstrual implica una serie de síntomas que pueden ser debilitantes y necesitan un enfoque más específico para su manejo", fuenteGrande);
            parrafo69.setSpacingAfter(10f);
            document.add(parrafo69);
            
            Paragraph parrafo70= new  Paragraph ("Sintomatologías en el Ciclo", fuenteNegrita4);
            parrafo70.setSpacingAfter(10f);
            document.add(parrafo70);
            
            Paragraph parrafo71= new Paragraph ("1. Dolores abdominales: Los cólicos menstruales son muy comunes y pueden variar en intensidad. Se deben a contracciones del útero.", fuenteGrande);
            parrafo71.setSpacingAfter(10f);
            document.add(parrafo71);
            
            Paragraph parrafo72= new Paragraph ("2. Cambios de humor: Las fluctuaciones hormonales pueden provocar cambios emocionales, como irritabilidad, ansiedad o tristeza.", fuenteGrande);
            parrafo72.setSpacingAfter(10f);
            document.add(parrafo72);
            
            Paragraph parrafo73= new Paragraph ("3. Sensibilidad en los senos: Muchas mujeres sienten que sus senos están más sensibles o hinchados antes y durante la menstruación.", fuenteGrande);
            parrafo73.setSpacingAfter(10f);
            document.add(parrafo73);
            
            Paragraph parrafo74= new Paragraph ("4. Fatiga: La pérdida de sangre y los cambios hormonales pueden provocar cansancio o fatiga durante el ciclo.", fuenteGrande);
            parrafo74.setSpacingAfter(10f);
            document.add(parrafo74);
            
            Paragraph parrafo75= new Paragraph ("5. Dolores de cabeza: Algunas personas experimentan migrañas o dolores de cabeza asociados con su ciclo menstrual.", fuenteGrande);
            parrafo75.setSpacingAfter(10f);
            document.add(parrafo75);
            
            Paragraph parrafo76= new Paragraph ("6. Sensación de mareo: Algunas personas pueden experimentar mareos o vértigo, especialmente si tienen una pérdida significativa de sangre.", fuenteGrande);
            parrafo76.setSpacingAfter(10f);
            document.add(parrafo76);
           
            String rutaImagen12 = "imagenes/imagen12.jpg";
            Image imagen12 = Image.getInstance(rutaImagen12);
            imagen12.setAlignment(Image.ALIGN_CENTER);
            imagen12.setSpacingBefore(10f);
            float anchoMaximo12 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo12 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen12.scaleToFit(anchoMaximo12,altoMaximo12);
            document.add(imagen12);
            
            Paragraph parrafo77 = new  Paragraph ("Cambios Internos", fuenteNegrita4); 
            parrafo77.setSpacingAfter(10f);
            document.add(parrafo77);
            
            Paragraph parrafo78= new Paragraph ("El ciclo menstrual involucra una serie de cambios hormonales y fisiológicos que afectan a diferentes sistemas del cuerpo. A lo largo del ciclo, las hormonas como el estrógeno y la progesterona juegan un papel crucial en la regulación de estos procesos, todo esto asociado a cada una de las fases del ciclo menstrual.", fuenteGrande);
            parrafo78.setSpacingAfter(10f);
            document.add(parrafo78);
            
            Paragraph parrafo79 = new Paragraph ("Los motivos pueden ser endógenos —programados por el reloj biológico de cada mujer— o exógenos.Estos últimos hacen referencia a aspectos más controlables como, por ejemplo, la alimentación, el estilo de vida o el ambiente externo.", fuenteGrande);
            parrafo79.setSpacingAfter(10f);
            document.add(parrafo79);
            
            Paragraph parrafo80 = new Paragraph ("En esa serie de cambios se pueden encontrar:", fuenteNegrita4);
            parrafo80.setSpacingAfter(10f);
            document.add(parrafo80);
            
            Paragraph parrafo81 = new Paragraph ("1. Hormonas", fuenteNegrita6);
            parrafo81.setSpacingAfter(10f);
            document.add(parrafo81);
            
            Paragraph parrafo82 = new Paragraph ("La interacción entre la hormona foliculoestimulante (FSH) y la hormona luteinizante (LH) es esencial para el desarrollo de los folículos y la ovulación. El estrógeno y la progesterona son responsables de preparar el útero para una posible implantación.", fuenteGrande);
            parrafo82.setSpacingAfter(10f);
            document.add(parrafo82);
            
            Paragraph parrafo83= new Paragraph ("2. Revestimiento Uterino", fuenteNegrita6);
            parrafo83.setSpacingAfter(10f);
            document.add(parrafo83);
            
            Paragraph parrafo84 = new Paragraph ("A medida que las hormonas fluctúan, el endometrio se engrosa durante la fase folicular y se prepara para recibir un óvulo fertilizado. Si no hay fertilización, este revestimiento se descompone, lo que lleva a la menstruación. El endometrio es la capa de revestimiento más interna del útero y su función es evitar las adherencias entre las paredes opuestas del miometrio, manteniendo así la permeabilidad de la cavidad uterina. Durante el ciclo menstrual o el ciclo estral, el endometrio crece hasta convertirse en una capa de tejido glandular grueso y rico en vasos sanguíneos.", fuenteGrande);
            parrafo84.setSpacingAfter(10f);
            document.add(parrafo84);
           
            String rutaImagen13 = "imagenes/imagen13.jpg";
            Image imagen13 = Image.getInstance(rutaImagen13);
            imagen13.setAlignment(Image.ALIGN_CENTER);
            imagen13.setSpacingBefore(10f);
            float anchoMaximo13 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo13 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen13.scaleToFit(anchoMaximo13,altoMaximo13);
            document.add(imagen13);
            
            Paragraph parrafo85 = new Paragraph("3. Cambios Físicos", fuenteNegrita4);
            parrafo85.setSpacingAfter(10f);
            document.add(parrafo85);
            
            Paragraph parrafo86 = new Paragraph ("Durante el ciclo, muchas personas experimentan síntomas como sensibilidad en los senos, calambres abdominales, cambios en el apetito y fluctuaciones en el estado de ánimo, influenciados por los niveles hormonales.", fuenteGrande);
            parrafo86.setSpacingAfter(10f);
            document.add(parrafo86);
            
            Paragraph parrafo87 = new Paragraph ("4. Ciclo Ovárico", fuenteNegrita4);
            parrafo87.setSpacingAfter(10f);
            document.add(parrafo87);
            
            Paragraph parrafo88 = new Paragraph ("Los ovarios alternan entre desarrollar folículos y liberar óvulos, lo que es fundamental para la fertilidad, consiste en una serie de cambios regulares que de forma natural ocurren en el sistema reproductor femenino (especialmente en el útero y los ovarios) los cuales hacen posible el embarazo o la menstruación, en caso de que el primero no tenga lugar, durante este ciclo se desarrollan los ovocitos.", fuenteGrande);
            parrafo88.setSpacingAfter(10f);
            document.add(parrafo88);
            
            Paragraph parrafo89 = new Paragraph ("5. Efectos Sistémicos", fuenteNegrita4);
            parrafo89.setSpacingAfter(10f);
            document.add(parrafo89);
            
            Paragraph parrafo90= new Paragraph ("Las variaciones hormonales pueden afectar otros sistemas del cuerpo, como el sistema digestivo y el emocional, contribuyendo a síntomas como hinchazón o cambios en el sueño., Tales como:", fuenteGrande);
            parrafo4.setSpacingAfter(10f);
            document.add(parrafo90);
            
            Paragraph parrafo91 = new Paragraph ("*El Sistema Inmunológico", fuenteNegrita4);
            parrafo91.setSpacingAfter(10f);
            document.add(parrafo91);
            
            Paragraph parrafo92 = new Paragraph ("*El Metabolismo", fuenteNegrita4);
            parrafo92.setSpacingAfter(10f);
            document.add(parrafo92);
           
            String rutaImagen14 = "imagenes/imagen14.jpg";
            Image imagen14 = Image.getInstance(rutaImagen14);
            imagen14.setAlignment(Image.ALIGN_CENTER);
            imagen14.setSpacingBefore(10f);
            float anchoMaximo14 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo14 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen14.scaleToFit(anchoMaximo14,altoMaximo14);
            document.add(imagen14);
            
            Paragraph parrafo93 = new Paragraph ("*La piel y el Cabello", fuenteNegrita4);
            parrafo93.setSpacingAfter(10f);
            document.add(parrafo93);
            
            Paragraph parrafo94 = new Paragraph ("*Sistema Cardiovascular", fuenteNegrita4);
            parrafo94.setSpacingAfter(10f);
            document.add(parrafo94);
            
            Paragraph parrafo95 = new Paragraph ("*Efectos Cognitivos", fuenteNegrita4);
            parrafo95.setSpacingAfter(10f);
            document.add(parrafo95);
            
            Paragraph parrafo96= new Paragraph ("Uno de los cambios que pueden ocurrir durante la adolescencia es la pubertad donde ocurren muchos cambios hormonales", fuenteGrande);
            parrafo96.setSpacingAfter(10f);       
            document.add(parrafo96);
            
            Paragraph parrafo97= new Paragraph  ("Pubertad: Durante ella, hay un aumento en la producción de hormonas sexuales como los estrógenos en las chicas y los andrógenos en los chicos. En las chicas, esto provoca el desarrollo de características sexuales secundarias, como el crecimiento de senos y el inicio del ciclo menstrual.", fuenteGrande);
            parrafo97.setSpacingAfter(10f);       
            document.add(parrafo97);
            
            Paragraph parrafo98 = new Paragraph ("Trastornos Menstruales", fuenteNegrita4);
            parrafo98.setSpacingAfter(10f);       
            document.add(parrafo98);
            
            Paragraph parrafo99= new Paragraph ("Conexión con el Hipotálamo", fuenteGrande);
            parrafo90.setSpacingAfter(10f);       
            document.add(parrafo99);
            
            Paragraph parrafo100= new Paragraph ("El hipotálamo es una región del cerebro que juega un papel crucial en la regulación del ciclo menstrual. Controla la liberación de hormonas que afectan directamente a los ovarios y, por ende, al ciclo menstrual. Los trastornos menstruales pueden estar relacionados con disfunciones en esta área, ya que el hipotálamo regula la producción de hormonas como la gonadotropina liberadora de hormona (GnRH), que a su vez estimula la producción de hormonas como FSH (hormona foliculoestimulante) y LH (hormona luteinizante).", fuenteGrande);
            parrafo100.setSpacingAfter(10f);       
            document.add(parrafo100);
            
            Paragraph parrafo101= new Paragraph ("Los trastornos menstruales son condiciones que afectan el ciclo menstrual de una persona, causando irregularidades en la menstruación, dolor o síntomas asociados. Estos trastornos pueden manifestarse de diversas formas, como amenorrea (ausencia de menstruación), dismenorrea (dolor menstrual), menorragia (sangrado excesivo) y otros problemas que pueden interferir con la salud reproductiva y la calidad de vida.", fuenteGrande);
            parrafo101.setSpacingAfter(10f);       
            document.add(parrafo101);
            
            Paragraph parrafo102 = new Paragraph ("Clasificación de Trastornos Menstruales", fuenteNegrita4);
            parrafo102.setSpacingAfter(10f);
            document.add(parrafo102);
            
            Paragraph parrafo103= new Paragraph ("1. Amenorrea: Ausencia de menstruación.", fuenteGrande);
            parrafo103.setSpacingAfter(10f);       
            document.add(parrafo103);

            String rutaImagen15 = "imagenes/imagen15.jpg";
            Image imagen15 = Image.getInstance(rutaImagen15);
            imagen15.setAlignment(Image.ALIGN_CENTER);
            imagen15.setSpacingBefore(10f);
            float anchoMaximo15 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo15 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen15.scaleToFit(anchoMaximo15,altoMaximo15);
            document.add(imagen15);
            
            Paragraph parrafo104= new Paragraph (" - Amenorrea Funcional: Causada por factores como el estrés, la pérdida de peso drástica o el ejercicio excesivo.\n- Amenorrea primaria: No se ha presentado la menstruación en una persona que ha alcanzado la edad adecuada.\n- Amenorrea secundaria: Cese de menstruaciones en una persona que previamente las había tenido.", fuenteGrande);
            parrafo104.setSpacingAfter(10f);       
            document.add(parrafo104);
            
            Paragraph parrafo105= new Paragraph ("2. Dismenorrea: Dolor intenso durante la menstruación. Puede ser:", fuenteGrande);
            parrafo105.setSpacingAfter(10f);       
            document.add(parrafo105);
            
            String rutaImagen16 = "imagenes/imagen16.jpg";
            Image imagen16 = Image.getInstance(rutaImagen16);
            imagen16.setAlignment(Image.ALIGN_CENTER);
            imagen16.setSpacingBefore(10f);
            float anchoMaximo16 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo16 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen16.scaleToFit(anchoMaximo16,altoMaximo16);
            document.add(imagen16);
            
            Paragraph parrafo106= new Paragraph ("- Dismenorrea primaria: Dolor sin una causa orgánica conocida.\n- Dismenorrea secundaria: Dolor causado por condiciones médicas subyacentes como endometriosis o fibromas.", fuenteGrande);
            parrafo106.setSpacingAfter(10f);       
            document.add(parrafo106);
            
            Paragraph parrafo107= new Paragraph ("3. Síndrome Premenstrual (SPM): Conjunto de síntomas físicos y emocionales que ocurren antes de la menstruación.", fuenteGrande);
            parrafo107.setSpacingAfter(10f);       
            document.add(parrafo107);
            
            Paragraph parrafo108= new Paragraph ("4. Endometriosis: Crecimiento del tejido endometrial fuera del útero, causando dolor y otros síntomas.", fuenteGrande);
            parrafo108.setSpacingAfter(10f);       
            document.add(parrafo108);
           
            String rutaImagen17 = "imagenes/imagen17.jpg";
            Image imagen17 = Image.getInstance(rutaImagen17);
            imagen17.setAlignment(Image.ALIGN_CENTER);
            imagen17.setSpacingBefore(10f);
            float anchoMaximo17 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo17 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen17.scaleToFit(anchoMaximo17,altoMaximo17);
            document.add(imagen17);
            
            Paragraph parrafo109 = new Paragraph ("5. Síndrome de Ovario Poliquístico (SOP): Trastorno hormonal caracterizado por ovarios agrandados con múltiples quistes, irregularidades menstruales y otros síntomas.", fuenteGrande);
            parrafo109.setSpacingAfter(10f);       
            document.add(parrafo109);
                   
            String rutaImagen18 = "imagenes/imagen18.jpg";
            Image imagen18 = Image.getInstance(rutaImagen18);
            imagen18.setAlignment(Image.ALIGN_CENTER);
            imagen18.setSpacingBefore(10f);
            float anchoMaximo18 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo18 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen18.scaleToFit(anchoMaximo18,altoMaximo18);
            document.add(imagen18);
            
            Paragraph parrafo110= new Paragraph ("6.Disfunción Menstrual: Alteraciones en el ciclo menstrual que no encajan en definiciones específicas.", fuenteGrande);
            parrafo110.setSpacingAfter(10f);       
            document.add(parrafo110);
            
            Paragraph parrafo111= new Paragraph ("7. Oligomenorrea: Ciclos menstruales infrecuentes, generalmente más de 35 días entre períodos.", fuenteGrande); 
            parrafo111.setSpacingAfter(10f);       
            document.add(parrafo111);
            
            Paragraph parrafo112= new Paragraph ("Estos trastornos pueden tener diversas causas, desde problemas hormonales hasta condiciones médicas subyacentes, y su diagnóstico y tratamiento son fundamentales para mantener la salud reproductiva. La relación con el hipotálamo es clave, ya que cualquier alteración en su función puede alterar el ciclo menstrual normal.", fuenteGrande);
            parrafo112.setSpacingAfter(10f);       
            document.add(parrafo112);
            
            Paragraph parrafo113 = new Paragraph ("Métodos Anticonceptivos", fuenteNegrita4);
            parrafo113.setSpacingAfter(10f);       
            document.add(parrafo113);
            
            Paragraph parrafo114= new Paragraph ("Los métodos anticonceptivos se definen como las estrategias para impedir o reducir de forma significativa las probabilidades de que se produzca la fecundación y, con ello, el embarazo, al mantener relaciones sexuales con penetración vaginal. Por lo tanto, si tuviste sexo sin protección y luego no te bajó la menstruación, hazte una prueba de embarazo. Sin embargo, el hecho de que no te baje el periodo no quiere decir que estás en embarazo. En realidad, la única manera de saberlo con certeza es haciéndote una prueba.", fuenteGrande); 
            parrafo114.setSpacingAfter(10f);       
            document.add(parrafo114);
           
            String rutaImagen19 = "imagenes/imagen19.jpg";
            Image imagen19 = Image.getInstance(rutaImagen19);
            imagen19.setAlignment(Image.ALIGN_CENTER);
            imagen19.setSpacingBefore(10f);
            float anchoMaximo19 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo19 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen19.scaleToFit(anchoMaximo19,altoMaximo19);
            document.add(imagen19);
            
            Paragraph parrafo115 = new Paragraph ("¿Cómo se Clasifican los Métodos Anticonceptivos?", fuenteNegrita4);
            parrafo115.setSpacingAfter(10f);       
            document.add(parrafo115);
            
            Paragraph parrafo116= new Paragraph ("1. Masculinos o femeninos: en función de si lo usa el hombre o la mujer.", fuenteGrande);
            parrafo116.setSpacingAfter(10f);       
            document.add(parrafo116);
            
            Paragraph parrafo117= new Paragraph ("2. Orales o no orales: hace referencia a si los anticonceptivos se toman en forma de pastillas o si se colocan en otro lugar del cuerpo.", fuenteGrande);
            parrafo117.setSpacingAfter(10f);       
            document.add(parrafo117);
            
            Paragraph parrafo118= new Paragraph ("3. Hormonales o no hormonales: en base a si incluyen hormonas en su composición", fuenteGrande);
            parrafo118.setSpacingAfter(10f);       
            document.add(parrafo118);
            
            Paragraph parrafo119= new Paragraph ("4. Temporales o permanentes: en función de la duración de la anticoncepción", fuenteGrande);
            parrafo119.setSpacingAfter(10f);       
            document.add(parrafo119);
            
            Paragraph parrafo120= new Paragraph ("5. Reversibles o irreversibles: hace referencia a la esterilización total del hombre o la mujer.", fuenteGrande);
            parrafo120.setSpacingAfter(10f);       
            document.add(parrafo120);
           
            String rutaImagen20 = "imagenes/imagen20.jpg";
            Image imagen20 = Image.getInstance(rutaImagen20);
            imagen20.setAlignment(Image.ALIGN_CENTER);
            imagen20.setSpacingBefore(10f);
           
            float anchoMaximo20 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo20 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen20.scaleToFit(anchoMaximo20,altoMaximo20);
            document.add(imagen20);
           
            Paragraph parrafo121 = new Paragraph ("Salud sexual femenina", fuenteNegrita4);
            parrafo121.setSpacingAfter(10f);       
            document.add(parrafo121);
            
            Paragraph parrafo122= new Paragraph ("Algunas veces ocurre que los niveles hormonales y los ciclos menstruales de las mujeres están alterados, esto suele asociarse a ciertas patologías como, por ejemplo: el síndrome de ovario poliquístico que consiste en la acumulación excesiva de folículos y en la no liberación de óvulos, produciendo menstruación prolongada y dolorosa, ciclos irregulares y exceso de hormonas masculinas, entre otros. Por eso es importante acudir de manera regular al ginecólogo, ya que en caso de haber irregularidades se puede iniciar una terapia hormonal.", fuenteGrande);
            parrafo122.setSpacingAfter(10f);       
            document.add(parrafo122);
           
            String rutaImagen21 = "imagenes/imagen21.jpg";
            Image imagen21 = Image.getInstance(rutaImagen21);
            imagen21.setAlignment(Image.ALIGN_CENTER);
            imagen21.setSpacingBefore(10f);
           
            float anchoMaximo21 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo21 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen21.scaleToFit(anchoMaximo21,altoMaximo21);
            document.add(imagen21);
            
            Paragraph parrafo123= new Paragraph ("También es importante saber que si tienes una vida sexual activa y mantienes relaciones sexuales y no deseas quedar embarazada, puedes utilizar métodos anticonceptivos tanto hormonales (DIU, implantes y comprimidos orales), como de barrera (preservativo y diafragma), entre otros. Incluso, si la mujer ha determinado que no desea ser madre nunca, puede recurrir a la ligadura de trompas.", fuenteGrande);
            parrafo123.setSpacingAfter(10f);       
            document.add(parrafo123);
            
            Paragraph parrafo124= new Paragraph ("La comprensión del ciclo menstrual también es vital para aquellas que buscan concebir. Conocer los días fértiles puede aumentar las posibilidades de embarazo. Además, hay tratamientos disponibles para quienes enfrentan dificultades para concebir.", fuenteGrande);
            parrafo124.setSpacingAfter(10f);       
            document.add(parrafo124);
          
            String rutaImagen22 = "imagenes/imagen22.jpg";
            Image imagen22 = Image.getInstance(rutaImagen22);
            imagen22.setAlignment(Image.ALIGN_CENTER);
            imagen22.setSpacingBefore(10f);
            float anchoMaximo22 = PageSize.A4.getWidth()-document.leftMargin()-document.rightMargin();
            float altoMaximo22 = PageSize.A4.getHeight()-document.topMargin()-document.bottomMargin();
            imagen22.scaleToFit(anchoMaximo22,altoMaximo22);
            document.add(imagen22);
           
            document.close();
            
            JOptionPane.showMessageDialog(null, "Guía ginecóloga generada correctamente.");
  
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al crear el PDF: " + e.getMessage());
        }
    }
}
