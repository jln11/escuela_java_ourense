/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests.poo;

import com.vn.introJava.poo.vehiculos.Coche;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ProbarGenericos {

    public ProbarGenericos() {
    }

    @Test
    public void testearClaseAnidada() {
        // Las clases anidadas generan su propio fichero bytecodes
        ProbarClaseInterfazGenericayAnidadas.ClasePequePos c;
        c = new ProbarClaseInterfazGenericayAnidadas.ClasePequePos(1f, 2f);

    }

    @Test
    public void testearMetodosGenericos() {
        ArrayList<Integer> listIn = new ArrayList<Integer>();
        int tres = 3, cinco = 5;
//        insertarIntegerDuplicado(listIn, tres);
//        insertarIntegerDuplicado(listIn, cinco);
        insertarDuplicado(listIn, tres);
        insertarDuplicado(listIn, cinco);

        System.out.println("Tres sigue siendo " + tres);
        for (Integer integer : listIn) {
            System.out.println(" - " + integer);
        }
        // Inferir: infiere, deduce el tipo por su declaracion
        ArrayList<String> listStr = new ArrayList<>();
//        insertarIntegerDuplicado(listStr, "tres");
//        insertarIntegerDuplicado(listStr, "cinco");
        insertarDuplicado(listStr, "tres");
        insertarDuplicado(listStr, "cinco");
        for (String unString : listStr) {
            System.out.println("** " + unString);
        }

        ArrayList<Coche> listCoches = new ArrayList<>();
        insertarDuplicado(listCoches, new Coche("Panda"));
        insertarDuplicado(listCoches, new Coche("Caldereta"));
        insertarDuplicado(listCoches, new Coche("600"));
        for (Coche coche : listCoches) {
//             System.out.println(coche.toString());
            System.out.println(">> " + coche);
        }
        Integer ultInt = mostrarYdevolverUltimo(listIn);
        String ultStr = mostrarYdevolverUltimo(listStr);
        Coche ultCoche = mostrarYdevolverUltimo(listCoches);
        assertEquals((int) ultInt, 5);
        assertEquals(ultStr, "cinco");
        assertEquals(ultCoche.getMarca(), "600");
        System.out.println("Coche " + ultCoche.getMarca());
    }

    /* Metodos no genericos
     
     static void insertarIntegerDuplicado(ArrayList<Integer> listaInt, int i){
     listaInt.add(i);
     listaInt.add(i);
         System.out.println(i + " añadido dos veces");
     //esto no afecta fuera del metodo
     i = i+10;
     listaInt= null;
     }
     
       static void insertarIntegerDuplicado(ArrayList<String> listaString, String str){
     listaString.add(str);
     listaString.add(str);
         System.out.println(str + " añadido dos veces");
     //esto no afecta fuera del metodo
     str = str+ "10";
     listaString= null;
     }*/
    //Entre <y> ponemos el nombre del tipo generico.
    //esto convierte el metodo en un "metodo generico"
    static <tipo> void insertarDuplicado(ArrayList<tipo> listaGenerica, tipo objeto) {
        listaGenerica.add(objeto);
        listaGenerica.add(objeto);
        System.out.println(objeto + " añadido dos veces");
        if (objeto instanceof Integer) {
            Integer i = (Integer) objeto; //Conversion explicita
            i = i + 2;
        }
        listaGenerica = null;

    }

    static <Tipo> Tipo mostrarYdevolverUltimo(ArrayList<Tipo> listaGenerica) {
        for (Tipo tipo : listaGenerica) {
            System.out.println(" - " + tipo.toString());
        }
        if (listaGenerica.size() > 0) {
            return listaGenerica.get(listaGenerica.size() - 1);
        } else {
            return null;
        }

    }

}
