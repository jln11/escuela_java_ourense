/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.dao;

import com.vn.introJava.poo.interfaces.IDaoUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class DaoUsuarioList implements IDaoUsuario {

    private List<Usuario> listaUsuarios;

    public DaoUsuarioList() {

        listaUsuarios = new ArrayList<>();

    }

     @Override
    public Usuario crear(Usuario nuevoUsuario) throws Exception {
        listaUsuarios.add(nuevoUsuario);
        return nuevoUsuario;
    }
    

    public Usuario crear(String nombre, int edad) throws Exception {
        return crear(new Usuario(nombre, edad));
    }

    @Override
    public Usuario obtenerPorIndice(int index) {
        return listaUsuarios.get(index);

    }

    @Override
    public Usuario obtenerPorNombre(String nombre) {
        for (Usuario user : listaUsuarios) {
            if (user.getNombre().equals(nombre)) {
                return user;
            }
        }
        return null;

    }

    @Override
    public Usuario obtenerPorEdad(int edad) {
        for (Usuario user : listaUsuarios) {
            if (user.getEdad() == edad) {
                return user;
            }
        }
        return null;
    }
     @Override
  public Usuario modificar (int index, Usuario usuarioConDatos)throws Exception{
      Usuario usuarioAmodificar = listaUsuarios.get(index);
      usuarioAmodificar.setEdad(usuarioConDatos.getEdad());
      usuarioAmodificar.setNombre(usuarioConDatos.getNombre());
      listaUsuarios.set(index, usuarioConDatos);
  return usuarioAmodificar;
  }
  @Override
  public void eliminar (int index)throws Exception{
  listaUsuarios.remove(index);
  //eliminar(obtenerporIndice(index));
  
  }

    @Override
    public void eliminar(Usuario objConDatosNuevos)throws Exception {
    listaUsuarios.remove(objConDatosNuevos);
    }
  
}
