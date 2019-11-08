/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests.poo;

import org.junit.Test;

/**
 *
 * @author pc
 */
public class ProbarClaseInterfazGenericayAnidadas {

    static class ClasePequePos<T> { //static para usarlo en cualquier parte

        T x, y;

        public ClasePequePos(T x, T y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(x = " + x.toString() + ", y = " + y.toString() + ")";
        }

    }

    @Test
    public void probarClaseAnidada() {
        ClasePequePos unPunto2d = new ClasePequePos(3f, 5f); //aqui infiere el tipo
        System.out.println("Punto 2d: " + unPunto2d.toString());

    }

    @Test
    public void probarClaseGenerica() {
        ClasePequePos unPunto2d = new ClasePequePos(3f, 5f);
        System.out.println("Punto 2d: " + unPunto2d.toString());
        ClasePequePos<String> unPunto2Dstr = new ClasePequePos<>("tres", "cinco");
        System.out.println("Punto 2D str : " + unPunto2Dstr.toString());

    }


    
}
