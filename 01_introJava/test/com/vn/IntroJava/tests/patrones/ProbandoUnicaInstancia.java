/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests.patrones;

import com.vn.introJava.patrones.CocheEspecialUnico;
import com.vn.introJava.patrones.TractorSingleton;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ProbandoUnicaInstancia {

    public ProbandoUnicaInstancia() {
    }

    @Test
    public void intentarUnicaInstancia() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
    //    CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("Unico coche 1");
        miUnicoCoche.mostrarEstado();
    }
     @Test
    public void intentarUnicaInstanciaBis() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
       // CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("Unico coche 2");
        miUnicoCoche.mostrarEstado();
    }
       @Test
    public void intentarUnicaInstanciaTris() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
       // miUnicoCoche.setMarca("Unico coche 3");
        miUnicoCoche.mostrarEstado();
    }
     @Test
     public void intentarUnicaInstanciaTrisTras() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
       // miUnicoCoche.setMarca("Unico coche 3");
        miUnicoCoche.mostrarEstado();
    }
     
       @Test
     public void intentarUnicaInstanciaTractor() throws Exception {
        TractorSingleton.getInstancia().mostrarEstado();
           
    }
       @Test
     public void intentarUnicaInstanciaTractor2() throws Exception {
        TractorSingleton.getInstancia().mostrarEstado();
           
    }
         @Test
     public void intentarUnicaInstanciaTractor3() throws Exception {
        TractorSingleton.getInstancia().mostrarEstado();
           
    }
     
    
   
}
