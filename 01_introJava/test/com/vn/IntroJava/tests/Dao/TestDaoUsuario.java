/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests.Dao;

import com.vn.introJava.dao.DaoUsuarioList;
import com.vn.introJava.dao.Usuario;
import com.vn.introJava.poo.interfaces.IDaoUsuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class TestDaoUsuario {

    public TestDaoUsuario() {
    }

    @Test
    public void testUsuarioDaoList() throws Exception {
        IDaoUsuario daoUsuario = new DaoUsuarioList();

    }

    @Test
    public void testUsuarioDao() throws Exception {
        IDaoUsuario daoUsuario = new DaoUsuarioList();
        daoUsuario.crear(new Usuario("X", 28));
        daoUsuario.crear(new Usuario("Y", 78));
        daoUsuario.crear(new Usuario("Z", 10));
        daoUsuario.crear(new Usuario("A", 49));
        assertEquals("Y", daoUsuario.obtenerPorIndice(1).getNombre());
        assertEquals(10, daoUsuario.obtenerPorNombre("Z").getEdad());
        assertEquals(daoUsuario.obtenerPorEdad(10).getEdad(), 10);
        
        daoUsuario.modificar(1, new Usuario("Y modificado" ,88));
        assertEquals("Y modificado",daoUsuario.obtenerPorIndice(1).getNombre());
        assertEquals(88, daoUsuario.obtenerPorIndice(1).getEdad());
        
        daoUsuario.eliminar(daoUsuario.obtenerPorIndice(0));
        daoUsuario.eliminar(1); //El 1 ahora es Z
        //El 1 ahora es A
        assertEquals("A", daoUsuario.obtenerPorIndice(1).getNombre());

    }
}
