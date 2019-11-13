/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.poo.interfaces;

import com.vn.introJava.dao.Usuario;

/**
 *
 * @author pc
 */
public interface IDaoUsuario extends IGenericDao<Usuario> {
    
    //Se pueden sobreescribir,pero no es necesario
    /*

      @Override
    public void crear(Usuario nuevoUsuario);

    @Override
    public Usuario obtenerPorIndice(int index);
*/

    public Usuario obtenerPorNombre(String nombre);
    
    public Usuario obtenerPorEdad(int edad);

}
