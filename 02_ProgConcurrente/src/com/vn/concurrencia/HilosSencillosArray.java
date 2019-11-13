/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

import static com.vn.concurrencia.HilosSencillos.contcompartido;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class HilosSencillosArray {
    

   // ArrayList<Thread> listaHilos= new ArrayList<>();
    public ArrayList<Runnable>  listahilos;
   //public int [] arrayhilos;

    public HilosSencillosArray() {
        this.listahilos = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            listahilos.add(new HiloA());
            listahilos.add(new HiloB());
        }
    }



 

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

    public void ejecutarHilosStartABenParalelo() {

        System.out.println("\n*****START******\n");
        for (int i = 0; i < listahilos.size(); i++) {
            Thread Hilo = new Thread(listahilos.get(i));
            Hilo.start();
            while(Hilo.isAlive());
        }
     
        System.out.println("\n end*****START******\n");

    }
    
    public void ejectuarHilosRunABenSerie(){
    
        System.out.println("\n*****RUN******\n");
        //Sin hilos, ejecutamos uno detras de otro
        for (int i = 0; i < listahilos.size(); i++) {
            listahilos.get(i).run();
        }
       System.out.println("\n end*****RUN******\n");
    }
    
    
}
