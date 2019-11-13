/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.patrones;

import com.vn.introJava.poo.vehiculos.TipoVehiculo;
import com.vn.introJava.poo.vehiculos.Tractor;

/**
 *
 * @author pc
 */
public class TractorSingleton extends Tractor{
    
    private static TractorSingleton miTractorAmarillo;
    
    private TractorSingleton(){
    super();
    
    }
    
    public static TractorSingleton getInstancia()throws Exception{
        if (TractorSingleton.miTractorAmarillo==null) {
            TractorSingleton.miTractorAmarillo = new TractorSingleton();
            TractorSingleton.miTractorAmarillo.setTipo(TipoVehiculo.RALLY);
        }
    return TractorSingleton.miTractorAmarillo;
    }
    
}
