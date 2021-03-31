package com.dts.acm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dts.acm.entity.Vehiculo;
import com.dts.acm.service.VehiculoServiceImplementation;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/dts")
public class VehiculoRestController {

	@Autowired
	private VehiculoServiceImplementation vehiculoService;

	@GetMapping("/listar_vehiculos")
	public List<Vehiculo> findAll() {
		List<Vehiculo> vehiculos = vehiculoService.findAll();
		if (vehiculos == null) {
			throw new RuntimeException("No se encontró ningún vehiculo registrado.");
		}
		return vehiculos;
	}

	@GetMapping("/listar_vehiculos/{vehiculoId}")
	public Vehiculo getObject(@PathVariable int vehiculoId) {
		Vehiculo vehiculo = vehiculoService.findById(vehiculoId);

		if (vehiculo == null) {
			throw new RuntimeException("No se encontró el vehiculo -" + vehiculoId);
		}
		return vehiculo;
	}

	@PostMapping("/guardar_vehiculo")
	public Vehiculo addObject(@RequestBody Vehiculo vehiculo) {
		vehiculoService.save(vehiculo);
		return vehiculo;
	}

	@PutMapping("/actualizar_vehiculo")
	public Vehiculo updateObject(@RequestBody Vehiculo vehiculo) {
		vehiculoService.save(vehiculo);
		return vehiculo;
	}

	@DeleteMapping("eliminar_vehiculo/{vehiculoId}")
	public String deteteObject(@PathVariable int vehiculoId) {
		Vehiculo vehiculo = vehiculoService.findById(vehiculoId);
		if (vehiculo == null) {
			throw new RuntimeException("No se encontró el vehiculo -" + vehiculoId);
		}
		vehiculoService.deleteById(vehiculoId);
		return "Vehiculo eliminado - " + vehiculoId;
	}
}
