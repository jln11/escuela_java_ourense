/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests;

import com.vn.introJava.funcionesbasicas.OrdenamientoArray;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestOrdenamientoInsercion {

    public TestOrdenamientoInsercion() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    // TODO add test methods here.

   private void probarOrdenamientoSistemaHumano(int[] array, int[] arrayOrdenadoOk) {
        int[] arrayOrdPorFuncion;
        arrayOrdPorFuncion = OrdenamientoArray.insercionDirecta(array);
        assertArrayEquals(arrayOrdPorFuncion, arrayOrdPorFuncion);

    }

    @Test
    public void probarOrdenamSistHum_array4() {

        int[] array = {4, 2, 3, 1};
        int[] arrayOrdenadoOk = {1, 2, 3, 4};
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);

    }

    @Test
    public void probarOrdenamSistHum_array5() {

        int[] array = {5, 4, 6,9, 2};
        int[] arrayOrdenadoOk = { 2,  4, 5 ,6, 9};
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
@Test
    public void probarOrdenamSistHum_arraymuchosvalores() {

        int[] array = {5, 4, 3, 2, 1, 7, 6, 8};
        int[] arrayOrdenadoOk = {1, 2, 3, 4, 5, 6, 7, 8};
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
    @Test
    public void probarOrdenamSistHum_repetidos() {

        int[] array = {5, 4, 3, 2, 1,1};
        int[] arrayOrdenadoOk = {1,1, 2, 3, 4, 5, };
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
    @Test
     public void probarOrdenamSistHum_maximovalor() {

        int[] array = {5, 4, 3, 2, Integer.MAX_VALUE ,1};
        int[] arrayOrdenadoOk = {1, 2, 3, 4, 5,Integer.MAX_VALUE };
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
     @Test
      public void probarOrdenamSistHum_minimovalor() {

        int[] array = {5, 4, 3, 2, Integer.MIN_VALUE ,1};
        int[] arrayOrdenadoOk = {Integer.MAX_VALUE,1, 2, 3, 4, 5 };
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
      @Test
     public void probarOrdenamSistHum_arrayinvertido() {

        int[] array = {5, 4, 3, 2, 1};
        int[] arrayOrdenadoOk = {Integer.MAX_VALUE,1, 2, 3, 4, 5 };
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
     @Test
     public void probarOrdenamSistHum_connegativos() {

        int[] array = {5, 4, 3, 2,-1};
        int[] arrayOrdenadoOk = {-1, 2, 3, 4, 5 };
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
     @Test
      public void probarOrdenamSistHum_1elemento() {

        int[] array = {5};
        int[] arrayOrdenadoOk = {5 };
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
    
     @Test
      public void probarOrdenamSistHum_ordenado() {

        int[] array = {1,2,3,4};
        int[] arrayOrdenadoOk = {1,2,3,4 };
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
     @Test
      public void probarOrdenamSistHum_vacio() {

        int[] array = {};
        int[] arrayOrdenadoOk = {};
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
     @Test
       public void probarOrdenamSistHum_null() {

        int[] array = null;
        int[] arrayOrdenadoOk = null;
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }
}
