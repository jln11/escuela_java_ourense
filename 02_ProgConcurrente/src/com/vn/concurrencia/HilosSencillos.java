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
public class HilosSencillos {

    static int contcompartido = 0;
    HiloA hiloA1,hiloA2;
    HiloB hiloB1,hiloB2;
  
     

    public HilosSencillos() {
        this.hiloA1 = new HiloA();
        this.hiloA2 = new HiloA();
        this.hiloB1 = new HiloB();
        this.hiloB2 = new HiloB();
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
        Thread threadHiloA1 = new Thread(hiloA1);
        Thread threadHiloA2 = new Thread(hiloA2);
        Thread threadHiloB1 = new Thread(hiloB1);
        Thread threadHiloB2 = new Thread(hiloB2);
        threadHiloA1.start();
        threadHiloA2.start();
        threadHiloB1.start();
        threadHiloB2.start();
        while(threadHiloA1.isAlive() || threadHiloB1.isAlive() || threadHiloA2.isAlive() || threadHiloB2.isAlive());
        System.out.println("\n end*****START******\n");

    }
    
    public void ejectuarHilosRunABenSerie(){
    
        System.out.println("\n*****RUN******\n");
        //Sin hilos, ejecutamos uno detras de otro
        hiloA1.run();
        hiloA2.run();
        hiloB1.run();
        hiloB2.run();
       System.out.println("\n end*****RUN******\n");
    }
}
