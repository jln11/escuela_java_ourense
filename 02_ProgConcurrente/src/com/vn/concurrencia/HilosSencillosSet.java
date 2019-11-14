/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

import static com.vn.concurrencia.HilosSencillos.contcompartido;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author pc
 */
public class HilosSencillosSet {

    private  Set<Runnable> HilosSet;
    private final long numHilos;
    

    public HilosSencillosSet(long numHilos) {
        this.numHilos = numHilos;
          HilosSet = new HashSet<>(); 
    }
    
    
    
    
    class HiloA implements Runnable {

        @Override
        public void run() {
            for (long i = 0; i < numHilos; i++) {
              
                HilosSet.add(this);
                    System.out.println("Instruccion A " + i + " - contador = " + contcompartido);
               

            }
        }
    }

    class HiloB implements Runnable {

        @Override
        public void run() {
            for (long j = 0; j < numHilos; j++) {  //el contador principal, j, en variable local
              
                HilosSet.add(this);
                    System.out.println("->Ins B: " + j + "c = " + contcompartido);
             

            }
        }
    }

    public void ejecutarHilosStartABenParalelo() throws Exception {

        System.out.println("\n*****START******\n");
           Set<Thread> setThreads = new HashSet<>();
           
        for (Runnable Hilo : HilosSet) {
            setThreads.add(new Thread(Hilo));
        }
     /*  boolean vivo;
        do {
            vivo=false;
            for (Runnable thread : HilosSet) {
                if (thread.isAlive()) {
                    vivo=true;
                }
            }
        } while (vivo);*/
        
        System.out.println("\n end*****START******\n");

    }

    public void ejectuarHilosRunABenSerie() throws Exception {

        System.out.println("\n*****RUN******\n");
    
         for (Runnable Hilo : HilosSet) {
            Hilo.run();
        }
     
        
        System.out.println("\n end*****RUN******\n");
        
    }

}
