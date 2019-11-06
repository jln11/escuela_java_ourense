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
public class DatosBasicos {
       public static void MostrarTiposDatos() {
        System.out.println("Probando tipos de datos");
        byte unByte = 100; //4 bytes
        int unEntero = 10000000;
        long enteroLargo = 10000000000000L; //8 bytes
        float unDecimal = 3.3f; //4 bytes aprox 7 o 8 cifras
        double decimalDoblePrec = 1.2345678901234567890; //8 bytes, aprox 15 o 16 cifras
        boolean condicion = true; // false, 1 byte
        char unCaracter = 's'; //2byte por el formato unicode
        char unCharEntero = 97;
        String unTexto = "Que esto es un txt";

        System.out.println("Byte :" + unByte);
        System.out.println("Entero :" + unEntero);
        System.out.println("Entero largo :" + enteroLargo);
        System.out.println("Float :" + unDecimal);
        System.out.println("Double :" + decimalDoblePrec);
        System.out.println("Caracter :" + unCaracter);
        System.out.println("Caracter en char :" + unCharEntero);
        System.out.println("Caracter en nº :" + (int) unCharEntero);
        System.out.println("String" + unTexto);
        System.out.println("Concatenar " + unTexto.concat(" Añadido"));
        System.out.println("En mayusculas " + unTexto.toUpperCase());
    }

   
    public static void ProbarOperadores() {
        //operadores unarios:
        System.out.println("Negacion : " + !true);
        System.out.println("Negativo : " + -(10 + 5));
        System.out.println("Casting : " + (float) 3.434343434343); //conversiones explicitas
        int contador;
        contador = 10;
        System.out.println("Incremento " + contador++);
        System.out.println("Incremento " + ++contador);
        //operadores binarios:(dos operandos)
        System.out.println("Suma y mult y div " + (5 + 6F) * 5 / 2);//conversion implicita
        System.out.println("Resto division entera : " + 11 % 3);
        //operadores booleanos
        System.out.println("Es cierto?: " + (true && true)); //operador and
        System.out.println("Es cierto?: " + (true || true));
        // Igualdad y similares : 
        System.out.println("Es cierto?: " + (5 == 5 || 5 > 9)); //operador or
        System.out.println("Es cierto?: " + (5 != 5 && 5 <= 9)); //operador distinto
        //operadores bit a bit
        // 00010101  = 21
        // 00000111 = 7
        // 00000101 = 5 AND
        // 00010111 = 23 OR
        // 00010010 = 18 XOR Or exclusivo, como el or, pero 1&1 =0
        System.out.println("Op. binario 21 AND 7 = " + (21 & 7));
        System.out.println("Op. binario 21 OR 7 = " + (21 | 7));
        System.out.println("Op. binario 21 XOR 7 = " + (21 ^ 7));

    }
}
