/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests.poo;

import com.vn.introJava.poo.interfaces.Desplazable;
import com.vn.introJava.poo.interfaces.Electrico;
import com.vn.introJava.poo.sistdesplaz.Avion;
import com.vn.introJava.poo.sistdesplaz.Monopatin;
import com.vn.introJava.poo.sistdesplaz.MonopatinElectrico;
import com.vn.introJava.poo.sistdesplaz.BicicletaElectrica;
import com.vn.introJava.poo.vehiculos.Coche;
import com.vn.introJava.poo.vehiculos.CocheRally;
import com.vn.introJava.poo.vehiculos.Vehiculo;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ProbarInterfaces {
    
    public ProbarInterfaces() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

 
       @Test
     public void creandoDesplazables() {
           Avion miAvionDeLosLunes = new Avion();
           miAvionDeLosLunes.mover(50.1f);
           miAvionDeLosLunes.rodar(4f);
           
           Desplazable dl = new Avion();
           dl.mover(0);
           Avion avionD1 = (Avion )dl;
           avionD1.volar(20);
           
           
           Monopatin patinete = new Monopatin();
           patinete.rodar(2f);
           patinete.correr(8000f);
           
           
           Desplazable pat = new Monopatin();
           pat.mover(0);
           Monopatin monopat1= (Monopatin)pat;
           monopat1.correr(2222f);
          
     }
     
     
     @Test
     public void moviendoVehiculosDesplazables(){
     CocheRally cocheRally = new CocheRally ("Coche Rally Propio 3D");
     //Facetas polimorfismo
     Coche cocheR = cocheRally;
     Vehiculo vehiculoR = cocheRally;
     Desplazable desplazR = cocheRally;
     cocheR.arrancar();
     vehiculoR.mostrarEstado();
     desplazR.mover(10F);
     assertTrue(desplazR instanceof CocheRally);
         if (desplazR instanceof CocheRally) {
             ((CocheRally) desplazR).setRozamiento(10f);
             assertEquals(((CocheRally) desplazR).getRozamiento(),10f,0.001f);
         }
     }
     
     @Test
    void arrayInterfaces(){
     Electrico [] cosasElectricas = new Electrico[]{
     new MonopatinElectrico(),
         new BicicletaElectrica()
     };
     cosasElectricas[0].cargarBateria(10f);
     cosasElectricas[1].cargarBateria(20f);
         if (cosasElectricas.length !=2) {
             fail("No tienes 2 elementos");
         }
     }
     
}
