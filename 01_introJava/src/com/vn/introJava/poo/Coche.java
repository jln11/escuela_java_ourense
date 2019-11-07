/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.poo;

/**
 *
 * @author pc
 */
public class Coche extends Vehiculo {

    /*  public Coche(){
    
    //constructor por defecto
    
    }*/
    //En el momento que creamos un constructor, el de por defecto
    //deja de ser implementado por java
    private String marca;
    private int numRuedas = 4;
    protected boolean arrancado;

    public Coche() {

        numRuedas = 4;
        marca = "Sin marca ";
        this.arrancado = false;
        tipo= TipoVehiculo.TURISMO;
    }

    public Coche(String marca) {
        this.marca = marca;
        this.arrancado = false;
            tipo= TipoVehiculo.TURISMO;
    }

    public void arrancar() {
        System.out.println(this.marca + "ha arrancado");
        arrancado = true;
    }

    //Sobrecarga de metodo arrancar()
    /**
     * Si la posicion de la llave es 4, el coche arranca No arranca en cualquier
     * otro caso
     *
     * @param posicionLlave puede ser un nº del 1 al 4
     * @return Si se ha arrancado devuelve true
     */
    public boolean arrancar(int posicionLlave) {
        // 4 posiciones, la 4º es la que arranca
        if (posicionLlave < 1 || posicionLlave > 4) {
            throw new IllegalArgumentException("La llave ha de valer de 1 a 4");
        }
        arrancado = posicionLlave == 4 /*? true : false*/;
        System.out.println(this.marca + (arrancado ? "ha arrancado." : "fallo al arrancar"));
        return arrancado;
    }

    public boolean arrancar(String orden) {
        arrancado = "arrancar".equals(orden);
        return arrancado;
    }

    /**
     * Simplemente muestra la marca y si esta arrancado
     */
  /*  @Override
    public void mostrarEstado() {
     //   System.out.println(tipo + " - " + getMarca()
       //         + (arrancado ? " arrancado." : " apagado."));
    System.out.println(toString());
    }*/

    public String getMarca() {
        return /*this.*/ marca;
    }

    public void setMarca(String nuevaMarca)
            //Avisamos a quien invoca este metodo
            //que podriamos lanzar la siguiente excepcion
            throws Exception {
        //Cuando existe una variable local con el mismo nombre, obliga a usar this para acceder a la propiedad
//        o a la variable miembro con el mismo nombre
        if (marca != null && !"".equals(marca)) {
            this.marca = nuevaMarca;
        } else {
            throw new IllegalArgumentException("Debes asignar una marca");
        }
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    @Override
    public void avanzar() {
        System.out.println("Ruedo un poco");}

   
    
       @Override
    public  String toString(){
        String texto = "" + tipo + " - " + getMarca() + (arrancado ? " arrancado." : " apagado.");
        return texto;
    }

}
