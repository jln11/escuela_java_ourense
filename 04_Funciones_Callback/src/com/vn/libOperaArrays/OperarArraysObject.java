/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.libOperaArrays;

/**
 *
 * @author pc
 */
public class OperarArraysObject {

     @FunctionalInterface
    public interface FunCallBackOperarArrays {

        Object opera(Object x, Object y);
    }

    public static Object[] OperarArrayObjects(Object[] arrayX, Object[] arrayY,
             OperarArraysObject.FunCallBackOperarArrays operaCllbk) {
        Object[] ArrayResult = null;
        if (arrayX.length == arrayY.length) {
            ArrayResult = new Object[arrayX.length];
            for (int i = 0; i < arrayX.length; i++) {
                ArrayResult[i] = operaCllbk.opera(arrayX[i], arrayY[i]);
            }
        }
        return ArrayResult;
    }

}
