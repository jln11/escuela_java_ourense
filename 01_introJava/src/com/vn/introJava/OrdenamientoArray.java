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
public class OrdenamientoArray {

    public static void OrdenArray() {
        int arrayNum[] = {1, 2, 3, 1, 0, 444444, 5, 434231231};

        for (int i = 0; i < (arrayNum.length); i++) {
            for (int j = i + 1; j < arrayNum.length; j++) {
                if (arrayNum[i] > arrayNum[j]) {
                    int compara = arrayNum[i];
                    arrayNum[i] = arrayNum[j];
                    arrayNum[j] = compara;

                }

            }
            System.out.println(arrayNum[i]);
        }

    }

    public static int[] OrdenArray2Arrays(int [] array) {
       // int[] array = {4, 2, 3, 1};
        if ( array == null || array.length <= 0 ) {
            return array;
        }
        int[] arrOrd = new int[array.length];

        int menor,posMenor ;
        int cont =  0;
        do {
            
            menor = array[cont];
            posMenor = cont;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < menor) {
                    menor = array[i];
                    posMenor=i;
                }
            }
            array[posMenor]= Integer.MAX_VALUE;
            arrOrd[cont] = menor;
            cont++;

            for (int i = 0; i < array.length; i++) {
                System.out.print(arrOrd[i] + ", ");
            }
            
        } while (cont <array.length );

        return arrOrd;
    }
     public static int[] burbuja(int arreglo[])
    {
        
        if (arreglo == null) {
            return arreglo;
        }
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for(int i = 0;i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]+"\n");
        }
        return arreglo;
    }
     
     public static int[] insercionDirecta(int A[]){
    int p, j;
    int aux;
         if (A==null) {
             return A;
         }
    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
              aux = A[p]; // el final, guardamos el elemento y
              j = p - 1; // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el
                                                                    // valor de aux sea menor que los
                             A[j + 1] = A[j];       // de la izquierda, se desplaza a
                             j--;                   // la derecha
              }
              A[j + 1] = aux; // colocamos aux en su sitio
    }return A;
}
     
     public static void mostrarArrayGrande(){
     int[]array=new int [1000];
         for (int i = 0; i < array.length; i++) {
             array[i] = (int)(Math.random()*999999999)+1;
              System.out.println(array[i]);
         }
        
     }
     
}
