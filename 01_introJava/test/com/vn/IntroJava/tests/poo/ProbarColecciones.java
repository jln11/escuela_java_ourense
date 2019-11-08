/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests.poo;

import com.vn.introJava.poo.vehiculos.Coche;
import com.vn.introJava.poo.vehiculos.CocheRally;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ProbarColecciones {
    
    public ProbarColecciones() {
    }

    @Test
    public void testArrayListNoGenerica() {
    ArrayList lista = new ArrayList ();
    //Con el arraylist podemos mezclar churras con merinas
    // Procurar no usar nunca
    lista.add(new Object());
    lista.add(new Coche("Coche"));
    lista.add("Texto cualquiera");
    lista.add(100);
    
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("elem [" + i + "] = " + lista.get(i).toString());
        }
    }
    
     @Test
    public void testArrayListGenericaOK() {
          ArrayList<CocheRally> misCoches = new ArrayList<CocheRally>();
          misCoches.add(new CocheRally("Subaru Lunes"));
          misCoches.add(new CocheRally("Toyota Martes"));
          misCoches.add(new CocheRally("Hammer fin de"));
    misCoches.get(2).arrancar("encender");
    misCoches.get(2).mostrarEstado();
    
         for (CocheRally misCoche : misCoches) {
             misCoche.avanzar();
         }
    
    
    }
      @Test
    public void probarHashSet() {
       HashSet<CocheRally> coch = new HashSet<CocheRally>();
          coch.add(new CocheRally("Subaru Lunes"));
          coch.add(new CocheRally("Toyota Martes"));
          coch.add(new CocheRally("Hammer fin de"));
          
          for (CocheRally coche : coch) {
              System.out.println(coche);
          }
    }
          
            @Test
    public void probarMapSet() {
        HashMap<Integer,CocheRally> co = new HashMap<Integer,CocheRally>();
    }
    }
    
    
    

