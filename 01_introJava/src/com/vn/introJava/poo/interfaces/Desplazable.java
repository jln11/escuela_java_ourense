/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.poo.interfaces;

/**
 * La forma en que se comunican las clases que la implementen es como una clase
 * abstracta con solo metodos abstractos
 *
 * @author pc
 */
public interface Desplazable {

    //No se deben usar variables miembro en interfaces
    //int propiedadNoApropiada= 4;
    //unicamente declaracion de metodos abstractos
    public void mover(float metros);

    //public void mover(int metros);
    
    //public void detener();

}
