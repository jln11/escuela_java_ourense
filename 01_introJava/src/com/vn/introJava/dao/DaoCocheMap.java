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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pc
 */
public class DaoCocheMap implements IDaoCoche {

    private Map<Integer, Coche> MapaCoches;
    private Map<String, Coche> MapaCochesS;
    private int cont;

    public DaoCocheMap() {
        MapaCoches = new HashMap<Integer, Coche>();
        MapaCochesS = new HashMap<String, Coche>();
        cont = 0;
    }

    @Override
    public Coche crear(String marca) throws Exception {
        return crear(FabricaCoches.crear(marca));
    }

    @Override
    public Coche crear(Coche CocheNuevo) throws Exception {
        MapaCochesS.put(CocheNuevo.getMarca(), CocheNuevo);
        MapaCoches.put(cont, CocheNuevo);//MapaCochesS.get(CocheNuevo.getMarca()));
        cont++;
        return CocheNuevo;
    }

    @Override
    public Coche obtenerPorIndice(int index) {
        return MapaCoches.get(index);
    }

    @Override
    public Coche obtenerPorMarca(String marca) {
        return MapaCochesS.get(marca);

    }

    @Override
    public Coche modificar(int index, Coche CocheMod) throws Exception {
      //  Coche cocheExistente = obtenerPorIndice(index);
       Coche c = obtenerPorIndice(index);
       
        MapaCochesS.remove(obtenerPorIndice(index).getMarca());
        MapaCochesS.put(CocheMod.getMarca(), c);
        
       
        c.setMarca(CocheMod.getMarca());
        c.setTipo(CocheMod.getTipo());
        c.arrancar(CocheMod.isArrancado() ? 4 : 1);
        return c;

        // MapaCoches.replace(index, CocheMod);
        // MapaCochesS.replace(obtenerPorIndice(index).getMarca(), CocheMod);
    }

    @Override
    public void eliminar(int index) {
        //eliminamos por marca String
        Coche c = MapaCoches.get(index);
        MapaCochesS.remove(c.getMarca());
        //Eliminamos por indice integer
        MapaCoches.remove(index);

    }

    @Override
    public void eliminar(Coche objConDatosNuevos) {
        String keyMarca = objConDatosNuevos.getMarca();
        MapaCochesS.remove(keyMarca);
        int keyIndex = -1;
        if (MapaCoches.containsValue(objConDatosNuevos)) {
                for (Map.Entry<Integer,Coche> parIndexYcoche : MapaCoches.entrySet()) {
                    if (parIndexYcoche.getValue().equals(objConDatosNuevos)) {
                        keyIndex = parIndexYcoche.getKey();
                    }
                    
            }
        }
   MapaCoches.remove(keyIndex);
        
    }

}
