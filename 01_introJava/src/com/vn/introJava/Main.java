package com.vn.introJava;

import static com.vn.introJava.funcionesbasicas.OrdenamientoArray.*;
import com.vn.introJava.poo.vehiculos.Coche;
import com.vn.introJava.poo.vehiculos.FabricaCoches;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal de proyecto Ejemplos java
 *
 * @author pc
 */
public class Main {

    /**
     * Funcion que se ejecuta al arrancar el programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
