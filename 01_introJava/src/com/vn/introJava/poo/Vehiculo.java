/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.poo;





/**Clase abstracta que no puede ser instanciada por falta de sentido
 *
 * @author pc
 */
public abstract class Vehiculo {
    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }
 /**
  * Metodo declarado e implementado
  * @param tipo 
  */
    public void setTipo(TipoVehiculo tipo)//Declaracion
    {
        this.tipo = tipo; //Implementacion
    }
    
    
    public abstract void avanzar(); //declaracion
    
   public abstract void mostrarEstado();
    
}
