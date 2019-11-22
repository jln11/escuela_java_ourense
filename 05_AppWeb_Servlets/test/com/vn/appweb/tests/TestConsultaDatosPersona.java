/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appweb.tests;

import com.vn.appweb.modelo.ConsultaSQL;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestConsultaDatosPersona {

    public TestConsultaDatosPersona() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSelect() {
        ConsultaSQL conSQL = new ConsultaSQL();
        assertEquals(0, conSQL.leerTabla("Nomb****eba").size());
        assertEquals("NombrePrueba", conSQL.leerTabla("NombrePrueba").get(0).getNombre());
        assertEquals("NombrePrueba", conSQL.leerTabla("m").get(0).getNombre());
      //  assertEquals(0, conSQL.leerTabla("N").size());

    }
}
