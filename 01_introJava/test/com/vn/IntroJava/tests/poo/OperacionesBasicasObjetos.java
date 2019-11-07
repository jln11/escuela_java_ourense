/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests.poo;

import com.vn.introJava.poo.Coche;
import com.vn.introJava.poo.CocheRally;
import com.vn.introJava.poo.FabricaCoches;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class OperacionesBasicasObjetos {

    @Test
    public void creandoObjetos() {
        Coche miCoche = null;
        miCoche = new Coche();
        System.out.println("Texto de coche: " + miCoche.toString());

        Coche miCocheFindes = new Coche();
        assertNotNull(miCocheFindes);
        assertNotEquals(miCoche, miCocheFindes);

        try {
            miCoche.setMarca("SEAT");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            miCocheFindes.setMarca("Hummer");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("miCoche.marca = " + miCoche.getMarca());
        System.out.println("miCocheFindes.marca = " + miCocheFindes.getMarca());

        miCocheFindes = miCoche;
        assertEquals(miCoche, miCocheFindes);
        try {
            miCoche.setMarca("Hummer Limusina");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasObjetos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("miCoche.marca = " + miCoche.getMarca());
        System.out.println("miCocheFindes.marca = " + miCocheFindes.getMarca());

        //Intro polimorfismo
        Object refAmiCoche = miCoche;
        //No podemos por que no tiene la forma de coche
        //System.out.println("miCoche.marca = " + refAmiCoche.getMarca());
        //Si podemos...
        assertTrue(refAmiCoche.equals(miCoche));
        //  assertEquals(refAmiCoche, (miCoche.equals(miCoche)));

//         Coche Cochechatarra=(Coche) new Object();
//         Cochechatarra.setMarca("CACA");
//        System.out.println("Cochechatarra " + Cochechatarra.getMarca());
        //Le decimos al recolector de basura que queremos borrar todos los objetos
        miCoche = null;
        miCocheFindes = null;
        System.gc();

    }

    @Test
    public void testSobrecarga() {

        Coche miCoche = null;
        miCoche = new Coche();
        /* miCoche.arrancar();
       assertTrue(miCoche.isArrancado());
       
      /* miCoche.arrancar(1);
       assertFalse(miCoche.isArrancado());
       miCoche.arrancar(4);
       assertTrue(miCoche.isArrancado());*/

        for (int i = 1; i < 4; i++) {
            miCoche.arrancar(i);
            if (i == 4) {
                assertTrue(miCoche.arrancar(i));
            } else {
                assertFalse(miCoche.arrancar(i));
            }
        }

    }

    @Test(expected = IllegalArgumentException.class)
    public void gestionExcepeciones() throws Exception {
        Coche c = FabricaCoches.crear("");
    }

    /* @Test (expected = IllegalArgumentException.class)
  public void gestionExcepecionesMAL() throws Exception {
     Coche c =  FabricaCoches.crear("Una marca");
  }*/
    @Test
    public void gestionExcepeciones2() throws Exception {
        try {
            Coche c = FabricaCoches.crear("");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasObjetos.class.getName()).log(Level.SEVERE, null, ex);
            assertTrue(ex instanceof IllegalArgumentException);
        }
    }

    @Test
    public void usandoConstructoresSobrecargados() {
        Coche c = new Coche("Ferrari");

        assertEquals(c.getMarca(), "Ferrari");

    }

  
        
        
    
    
    

}
