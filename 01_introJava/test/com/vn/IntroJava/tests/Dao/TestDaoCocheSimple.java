/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests.Dao;

import com.vn.introJava.dao.DaoCocheList;
import com.vn.introJava.dao.DaoCocheMap;
import com.vn.introJava.poo.interfaces.IDaoCoche;
import com.vn.introJava.poo.vehiculos.Coche;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestDaoCocheSimple {

    public TestDaoCocheSimple() {
    }

    @Test
    public void testDaoCocheList() throws Exception {
        testInterfaceDaocoche(new DaoCocheList());
    }

    @Test
    public void testDaoCocheMap() throws Exception {
        testInterfaceDaocoche(new DaoCocheMap());

    }

   
   public void testInterfaceDaocoche (IDaoCoche daoCoche) throws Exception {
        daoCoche.crear("Coche a");
        daoCoche.crear("Coche b");
       Coche cc =  daoCoche.crear("Coche c");

        
        assertEquals(daoCoche.obtenerPorIndice(1).getMarca(), "Coche b");
        assertEquals(daoCoche.obtenerPorMarca("Coche a").getMarca(), "Coche a");

        Coche modificado = new Coche("Coche b reprogramado");
        daoCoche.modificar(1, modificado);
        assertEquals("Coche b reprogramado", daoCoche.obtenerPorIndice(1).getMarca());
        
        modificado=new Coche("Coche c");
        modificado.arrancar();
        cc.arrancar();
        daoCoche.modificar(2, modificado);
        assertEquals(modificado.isArrancado(),cc.isArrancado());
        
        daoCoche.eliminar(1); //Eliminamos el coche B
        daoCoche.eliminar(daoCoche.obtenerPorMarca("Coche a"));//Eliminamos el A
   
        assertNull(daoCoche.obtenerPorIndice(1));
        assertNull(daoCoche.obtenerPorMarca("Coche a"));
        
        if (daoCoche instanceof DaoCocheList)
        assertEquals("Coche c", daoCoche.obtenerPorIndice(0).getMarca()); //en los list el indice baja 
        else   assertEquals("Coche c", daoCoche.obtenerPorIndice(2).getMarca()); //Al ser el mapa el indice no cambia
        
        
    }

}
