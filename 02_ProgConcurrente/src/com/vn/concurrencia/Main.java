/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* HilosSencillos hs = new HilosSencillos();
        long timeIni = System.currentTimeMillis();
         hs.ejectuarHilosRunABenSerie();
         String m1 = mostrarTiempo(timeIni, "Run en serie ha tardado: ");
         
         timeIni = System.currentTimeMillis();
        hs.ejecutarHilosStartABenParalelo();
        mostrarTiempo(timeIni, "Start en paralelo ha tardado: ");
        System.out.println(m1);*/

        //Ejecutar arrays
//         HilosSencillosArray hsa = new HilosSencillosArray();
//        long timeIni = System.currentTimeMillis();
//         hsa.ejectuarHilosRunABenSerie();
//         String m1 = mostrarTiempo(timeIni, "Run en serie con arrays ha tardado: ");
//         
//         timeIni = System.currentTimeMillis();
//        hsa.ejecutarHilosStartABenParalelo();
//        mostrarTiempo(timeIni, "Start en paralelo con arrays ha tardado: ");
//        System.out.println(m1);
        //Ejecutar con sets
     /*   HilosSencillosSet hss = new HilosSencillosSet();
        long timeIni = System.currentTimeMillis();
        try {
            hss.ejectuarHilosRunABenSerie(20);
        } catch (Exception ex) {
        }
        String m1 = mostrarTiempo(timeIni, "Run en serie con arrays ha tardado: ");

        timeIni = System.currentTimeMillis();
        try {
            hss.ejecutarHilosStartABenParalelo(20);
        } catch (Exception ex) {
        }
        mostrarTiempo(timeIni, "Start en paralelo con arrays ha tardado: ");
        System.out.println(m1);*/

    }

    static String mostrarTiempo(long timeInicial, String mensaje) {
        double tiempoTotal = (double) (System.currentTimeMillis() - timeInicial) / 1000.0;
        String mensajeRet = mensaje + tiempoTotal;
        System.out.println(mensajeRet);
        return mensajeRet;

    }

}
