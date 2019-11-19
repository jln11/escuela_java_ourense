/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.libOperaArrays;

import java.util.function.Consumer;

/**
 *
 * @author pc
 */
public class OperarArrays {
    
    //Equivalente a decir que estructura tendran las funciones callback
  @FunctionalInterface
    public interface FunCallBackOperarArrays{
      //Solo podemos declarar (que luego implementar) un metodo
    double operar (double x, double y);
    }
    public static double[] operarArraysDoubles(double[] arrayX, double [] arrayY,
            FunCallBackOperarArrays operaCllbk ){
        double[] arrayResult= null;
    if (arrayX.length == arrayY.length){
     arrayResult = new double[arrayX.length];
        for (int i = 0; i < arrayX.length; i++) {
            arrayResult[i]= operaCllbk.operar(arrayX[i], arrayY[i]);
        }
    }
    return arrayResult;
    }
    
    
}
