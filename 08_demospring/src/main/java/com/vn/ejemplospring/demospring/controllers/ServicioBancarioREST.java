package com.vn.ejemplospring.demospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.ejemplospring.demospring.modelo.CuentaBanc;
import com.vn.ejemplospring.demospring.modelo.CuentasDAOpanama;

//CORS
@CrossOrigin(origins = "*")
@RestController
public class ServicioBancarioREST {

	// Nosotros no instanciamos, lo hace Spring
	// Nosotros no gestionamos la dependencia, lo hace Spring
	// Tampoco asignamos el valir, lo hace Spring
	// Esto es la inyeccion de dependencias
	@Autowired
	private CuentasDAOpanama repo;

	@RequestMapping(path = "/cuentas", method = RequestMethod.POST) // Nos permite capturar varios metodos HTTP
	// @PostMapping
	// Solo el metodo Post
	public CuentaBanc crearCuentaAingenuo(@RequestBody CuentaBanc cuenta) {
		System.out.println(">>>>CuentaBanc recibida!!!" + cuenta.toString());
		return repo.save(cuenta);

	}

	@RequestMapping(path = "/cuentas", method = RequestMethod.GET)
	public List<CuentaBanc> obtenerTodas() {
		System.out.println(">>> GET todas cuentas");
		return repo.findAll();

	}

	@DeleteMapping("/cuentas/{id}")
	public void eliminarCuenta(@PathVariable Integer id) {
		repo.deleteById(id);
		System.out.println(">>>> Delete " + id);

	}

	@PutMapping("/cuentas/{id}")
	public CuentaBanc modificarCuenta(@PathVariable Integer id, @RequestBody CuentaBanc cuentaModif) {
		if (cuentaModif.getId() == id) {

			
			System.out.println(">>>> Put/Modificar " + id);
			return repo.save(cuentaModif);
		} else {
			System.out.println(">>>Put/modificar " + id + "e" + cuentaModif.getId() + " no son iguales");
			return null;

		}

	}

}
