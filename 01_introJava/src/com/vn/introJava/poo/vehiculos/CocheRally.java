/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.poo.vehiculos;

import com.vn.introJava.poo.interfaces.Desplazable;

/**
 * Clase Coche Rally para controlar otras caracteristicas especificas de los
 * rallies
 *
 * @author pc
 */
public class CocheRally extends Coche {

    private float rozamiento;

    public CocheRally() {
        super();
        rozamiento = 5f;
        tipo = TipoVehiculo.RALLY;
    }

    /**
     * Constructor con parametros Al implementar un constructor, el de por
     * defecto deja de ser implementado por Java
     *
     * @param marca
     */
    public CocheRally(String marca) {
        super(marca);
        rozamiento = 5f;
        tipo = TipoVehiculo.RALLY;
    }

    public CocheRally(float rozamiento, String marca) {
        super(marca);
        this.rozamiento = rozamiento;
        tipo = TipoVehiculo.RALLY;
    }

    /**
     * Obtener valor rozamiento
     *
     * @return the value of rozamiento
     */
    public float getRozamiento() {
        return rozamiento;
    }

    /**
     * Establecer valor de rozamiento
     *
     * @param rozamiento new value of rozamiento
     */
    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }

    /*  public boolean arrancar(String orden,int posLlave){
    if(super.arrancar(orden) && super.arrancar(posLlave))
       return super.arrancar();
    else
        return.super.arrancar("No arranca");
    }*/
    @Override
    public boolean arrancar(String orden) {
        if (super.arrancar(orden)) {
            return super.arrancado;
        } else if ("arrancar".equalsIgnoreCase(orden)) {
            arrancado = true;
        } else {
            arrancado = "encender".equals(orden.toLowerCase());
        }
        // return super.arrancar(orden); //To change body of generated methods, choose Tools | Templates.
        return arrancado;
    }
    //Ejercicio : Sobreescribir el metodo mostrarEstado para que tambien muestre el rozamiento

    public void mostrarEstadoAntiguo() {
        super.mostrarEstado();
        System.out.println("    -Rozamiento: " + getRozamiento());

    }

    //2do,el mteodo anterior ya no vale,renombrar a mostrarEstadoAntiguo()
    //que indique que es "Coche de Rally : <marca>, rozamiento,arrancar"
   /* @Override
    public void mostrarEstado() {
     //   System.out.println(tipo + " - " + getMarca() + ", rozamiento = " + rozamiento
       //         + (isArrancado() ? " arrancado." : " apagado."));
          System.out.println(toString());
    }*/

     @Override
    public  String toString(){
        String texto = "" + tipo +  " - " + getMarca() + ", rozamiento = " + rozamiento
              + (isArrancado() ? " arrancado." : " apagado.");
        return texto;
    }
   
    
}
