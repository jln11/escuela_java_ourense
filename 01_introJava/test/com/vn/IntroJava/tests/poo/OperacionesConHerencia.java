/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.tests.poo;

import com.vn.introJava.poo.Coche;
import com.vn.introJava.poo.CocheRally;
import com.vn.introJava.poo.TipoVehiculo;
import com.vn.introJava.poo.Tractor;
import com.vn.introJava.poo.Vehiculo;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class OperacionesConHerencia {

    static Coche turismo;
    static CocheRally Supra;

    public OperacionesConHerencia() {
    }

    @BeforeClass
    public static void setUpClass() {
        Supra = new CocheRally();
    }

    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSobreescrituraMetodos() throws Exception {

        Supra.setMarca("Toyota");
        Supra.setRozamiento(7f);
        assertTrue(Supra.getRozamiento() == 7f);
        //Usando TDD
        assertTrue(Supra.arrancar("arrancar"));
        assertTrue(Supra.arrancar("ARRANcar"));
        assertTrue(Supra.arrancar("Encender"));
        Supra.mostrarEstado();
    }

    public void testPolimorfismo() {
        Supra.setRozamiento(15f);
        turismo = Supra;
        //En java todos los metodos virtuales si un hijo tiene un metodo,se invoca al del hijo
        turismo.mostrarEstado();

    }

    @Test
    public void testEnumerado() {
        Supra.setTipo((TipoVehiculo.RALLY));
        //un enumerado es un int, limitado a lista de valores indicados
        System.out.println("Tipo : " + Supra.getTipo().toString());
        System.out.println("Valor Tipo : " + Supra.getTipo().ordinal());

        Tractor miTractorAmarillo = new Tractor();
        miTractorAmarillo.setTipo(TipoVehiculo.valueOf("TRACTOR"));
        System.out.println("Valor tipo : " + miTractorAmarillo.getTipo());

        //hay que usar el de abajo, porque guarda como un entero
        miTractorAmarillo.setTipo(TipoVehiculo.values()[2]);
        System.out.println("Valor tipo entero : " + miTractorAmarillo.getTipo());
    }

    @Test
    public void testClasesAbstractas() {
        // Vehiculo vehDesconocido = new Vehiculo(); // no se puede
        Vehiculo vehDesc = new Coche("Dacia");
        Vehiculo subaru = new CocheRally("Subaru");
        Vehiculo miTractor = new Tractor();
        vehDesc.avanzar();
        miTractor.avanzar();
        //Mediante un casting explicito podemos invocar a sus metodos
        assertEquals(((CocheRally) subaru) .getMarca(), "Subaru");
        Vehiculo[] misVehiculos = new Vehiculo[]{
        vehDesc,
            miTractor,
            new Coche ("Electrico"),
            subaru,
        };
        
        System.out.println("***LISTA DE VEHICULOS***");
        for (Vehiculo miVehiculo : misVehiculos) {
            System.out.println(" - " + miVehiculo.getTipo());
            miVehiculo.avanzar();
            miVehiculo.mostrarEstado();
        
        }
        System.out.println("***FIN DE LISTA***");
    }

}
