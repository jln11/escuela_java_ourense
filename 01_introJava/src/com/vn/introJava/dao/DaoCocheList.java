/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.dao;

import com.vn.introJava.poo.interfaces.IDaoCoche;
import com.vn.introJava.poo.vehiculos.Coche;
import com.vn.introJava.poo.vehiculos.FabricaCoches;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class DaoCocheList implements IDaoCoche {
    
   private List<Coche> listaCoches;
   
   public DaoCocheList(){
    listaCoches = new ArrayList<>();
}
   @Override
   public Coche crear(String marca)throws Exception{
       Coche c = FabricaCoches.crear(marca);
       listaCoches.add(c);
               return c;
     
   }
     @Override
    public Coche crear(Coche CocheNuevo) throws Exception {
      listaCoches.add(CocheNuevo);
      return CocheNuevo;
    }
   
   
   @Override
   public Coche obtenerPorIndice (int index){
       if (index < listaCoches.size()) {
              return listaCoches.get(index);
       }else
           return null;

   }
    @Override
  public Coche obtenerPorMarca(String marca){
       for (Coche coche : listaCoches) {
           if (coche.getMarca().equals(marca)) {
               return coche;
           }
       }
   return null;
   }

  
  @Override
  public Coche modificar (int index, Coche CocheMod)throws Exception{
      // Sustituir
     // listaCoches.set(index, CocheMod);
     Coche c = this.listaCoches.get(index);
     c.setMarca(CocheMod.getMarca());
     c.setTipo(CocheMod.getTipo());
     c.arrancar(CocheMod.isArrancado() ? 4 : 1);
     
     return c;
  }
   @Override
   public void eliminar(int index) throws Exception{
   listaCoches.remove(index);
   
   }

    @Override
    public void eliminar(Coche objConDatosNuevos)throws Exception {
  listaCoches.remove(objConDatosNuevos);
    }
   
  
  
  
}
