/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava;

/**
 *
 * @author pc
 */
public class EstructurasControl {
    
     public static void EjecutarBucles() {
        char arrayChar[] = {'a', 'b', '8', '*'};
        int index = 0;
        while (index < arrayChar.length) {
            System.out.println("Index = " + index + ", char = " + arrayChar[index]);
            index++; // index + = 1; index = index +1;
        }

        for (index = 0; index < arrayChar.length; index++) {
            System.out.println("Index = " + index + ", char = " + arrayChar[index]);
        }

        index = 0;

        do {
            System.out.println("Index = " + index + ", char = " + arrayChar[index]);
            index++;
        } while (index < arrayChar.length);

        for (char caracter : arrayChar) {
            System.out.println("char = " + caracter);
        }

    }

    public static void EjecutarCondiciones() {
        if ("palabra".length() > 5) { //condicional simple
            System.out.println("Palabra larga");
        }

        if ("Texto".length() > 5) {
            System.out.println("Por aqui no entra");
        } else {
            System.out.println("Palabra corta");
        }

        if ("en un lugar de la mancha".contains("LUGAR")) {
            System.out.println("Por aqui no entra");
        } else if ("en un lugar de la mancha".contains("MANCHA")) {
            System.out.println("por aqui tampoco");
        } else if ("en un lugar de la mancha".contains("OTRO")) {
            System.out.println("Nada");
        } else {
            System.out.println("No tiene porque estan en mayusculas");
        }
        //switch
        int numeroPeq = 0;
        switch (numeroPeq) {
            case 0:
                System.out.println("Num peq vale cero.");
                break;
            case 1:
                System.out.println("Num peq vale uno");
                break;
            case 2:
                System.out.println("Num peq vale dos");
                break;
            case 3:
            case 4:
                System.out.println("Num peq vale tres o cuatro");
                break;
            default:
                System.out.println("Es otro valor");
        }
    }

    
}
