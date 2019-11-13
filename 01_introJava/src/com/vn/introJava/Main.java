package com.vn.introJava;

import com.vn.introJava.excepciones.UsoNormalExcepciones;
import static com.vn.introJava.funcionesbasicas.OrdenamientoArray.*;
import com.vn.introJava.poo.vehiculos.Coche;
import com.vn.introJava.poo.vehiculos.FabricaCoches;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.dsig.TransformException;

/**
 * Clase principal de proyecto Ejemplos java
 *
 * @author pc
 */
public class Main {

    public static void main(String[] args) {
        
        
        /*error no capturado, se detiene el programa
        while(args.length > -1)
        ((Object) null).equals(args);*/
        try {
            //Primer codigo con error
            Coche c = FabricaCoches.crear("Seat en main");
            c.mostrarEstado();
           // c = FabricaCoches.crear(null); // IllegalArgumentException
            c = FabricaCoches.crear("Un coche");
            c.mostrarEstado();

            //Segundo codigo con error
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
           // unObj.metodoPeligroso();// RunTimeException
           
           throw new TransformException("Optimus Prime se ha quedado sin bateria");

            //Tercer codigo con error//NULLPointerException
         //   Object objNulo = null;
           // System.out.println("Fallara: " + objNulo.toString());

        }//se pueden anidar los catch
           catch (IllegalArgumentException ex) {
            //Captura cualquier IllegalArgumentException
            System.out.println("Argumento invalido. Decirle al usuario lo qué: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         catch (RuntimeException ex) {
            //Captura cualquier run time excepcion 
            //o cualquiera de sus clases hijas
            System.out.println("Cualquier tipo de RunException");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (Exception ex) {
            //Captura cualquier excepcion cuyo tipo sea el indicado en el catch
            //o cualquiera de sus clases hijas
            System.out.println("Cualquier tipo de Exception");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {//Siempre se ejecuta
            //incluso antes que un return
         System.out.println("******** FIN DEL TRY-CATCH******");
        }
        System.out.println("******** FIN DEL PROGRAMA******");
    }

    /**
     * Funcion que se ejecuta al arrancar el programa
     *
     * @param args the command line arguments
     */
    public static void mainTryCatchPorSeparado(String[] args) {
        try {
            //        DatosBasicos.MostrarTiposDatos();
//        EstructurasControl.EjecutarBucles();
//        EstructurasControl.EjecutarCondiciones();
//        DatosBasicos.ProbarOperadores();
//  OrdenArray();
// OrdenArray2Arrays();
//  mostrarArrayGrande();
            Coche c = FabricaCoches.crear("Seat en main");
            c.mostrarEstado();
            c = FabricaCoches.crear(null);
            c.mostrarEstado();
        } catch (Exception ex) {
            System.err.println(">> LOG");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligroso();

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepcion " + ex.getMessage());
            System.out.println("Excepcion " + ex.toString());
            System.out.println("\nPila de llamadas " + Arrays.toString(ex.getStackTrace()));
        }
        try {
            Object objNulo = null;
            System.out.println("Fallara: " + objNulo.toString());

        } catch (NullPointerException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }



}
