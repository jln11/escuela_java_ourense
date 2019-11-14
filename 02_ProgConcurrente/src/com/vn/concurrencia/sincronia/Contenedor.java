package com.vn.concurrencia.sincronia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * El sistema de bloqueo lo tiene que gestionar el recurso compartido.
 *
 * @author pc
 */
public class Contenedor {

    // Normalmente será un array, lista, bb.dd., 
    // mapa, fichero, DAO, servicio web, cualquier recurso compartido...
    int dato;
    // Semaforo: false no se puede usar el recurso
    //           true si se puede usar
    boolean hayDato = false;

    //synchronized prepara el metodo para el bloqueo
    public synchronized int get() {

        while (hayDato == false) { //Esperamos a que se produzca algun dato
            try {
                this.wait();  //le decimos al hilo que espere
                //hasta que el productor produzca el dato
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        hayDato = false;  //Marcamos para bloquear el recurso antes de devolverlo
        this.notifyAll(); //indicar al hilo que avise a los otros hilos
        //de que el recurso ha sido consumido
        return dato;     //Devolver el dato

    }

    public synchronized void put(int valor) {

        while (hayDato) {//Esperar a que alguien consuma el dato
            //Mientras no hay dato nadie lo ha consumido

            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dato = valor;  //Almacenar el dato
        hayDato = true;   //Marcamos para desbloquear/liberar el recurso
        this.notifyAll();
    }
}
