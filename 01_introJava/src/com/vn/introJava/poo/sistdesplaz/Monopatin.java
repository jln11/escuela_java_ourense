/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.poo.sistdesplaz;

import com.vn.introJava.poo.interfaces.Desplazable;

/**
 *
 * @author pc
 */
public class Monopatin implements Desplazable {

    @Override
    public void mover(float metros) {
         if (metros > 10) {
            correr(metros);
        }
        else rodar(metros);
    }
    
     public void rodar (float m) {
    System.out.println("El monopatin rueda a " + m + "!");
     }
    
    public void correr (float m) {
    System.out.println("El monopatin corre a " + m + "!");
    
    }
    }
    

