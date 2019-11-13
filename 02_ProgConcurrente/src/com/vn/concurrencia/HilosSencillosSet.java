/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

import static com.vn.concurrencia.HilosSencillos.contcompartido;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pc
 */
public class HilosSencillosSet {

    public  Set<Thread> HilosSet;
    
    
    class HiloA implements Runnable {

        @Override
        public void run() {
            for (long i = 0; i < 50000000; i++) {
                if (i % 1000000 == 0) {
                    System.out.println("Instruccion A " + i + " - contador = " + contcompartido);
                }

            }
        }
    }

    class HiloB implements Runnable {

        @Override
        public void run() {
            for (long j = 0; j < 80000000; j++) {  //el contador principal, j, en variable local
                if (j % 1000000 == 0) {
                    System.out.println("->Ins B: " + j + "c = " + contcompartido);
                }

            }
        }
    }

    public void ejecutarHilosStartABenParalelo(int num) throws Exception {

        System.out.println("\n*****START******\n");
       // Set<Thread> HilosSet = new HashSet();
        for (int i = 0; i < num; i++) {
            HiloA h = new HiloA();
            Thread th = new Thread(h);
            th.start();
            HilosSet.add(th);
        }
        boolean vivo;
        do {
            vivo=false;
            for (Thread thread : HilosSet) {
                if (thread.isAlive()) {
                    vivo=true;
                }
            }
        } while (vivo);
        
        System.out.println("\n end*****START******\n");

    }

    public void ejectuarHilosRunABenSerie(int num) throws Exception {

        System.out.println("\n*****RUN******\n");
        //Sin hilos, ejecutamos uno detras de otro
       // Set<Thread> HilosSet = new HashSet();
        for (int i = 0; i < num; i++) {
            HiloA h = new HiloA();
            Thread th = new Thread(h);
            th.run();
            HilosSet.add(th);
        }
         boolean vivo;
        do {
            vivo=false;
            for (Thread thread : HilosSet) {
                if (thread.isAlive()) {
                    vivo=true;
                }
            }
        } while (vivo);
        
        System.out.println("\n end*****RUN******\n");
        
    }

}
