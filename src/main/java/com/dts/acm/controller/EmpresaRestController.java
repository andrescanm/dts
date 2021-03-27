package com.dts.acm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dts.acm.entity.Empresa;
import com.dts.acm.service.EmpresaServiceImplementation;

@RestController
@RequestMapping("/dts")
public class EmpresaRestController {

	@Autowired
	private EmpresaServiceImplementation empresaService;

	@GetMapping("/listar_empresas")
	public List<Empresa> findAll() {
		List<Empresa> empresas = empresaService.findAll();
		if (empresas == null) {
			throw new RuntimeException("No se encontró ninguna empresa registrada.");
		}
		return empresas;
	}

	@GetMapping("/listar_empresas/{empresaId}")
	public Empresa getUser(@PathVariable int empresaId) {
		Empresa empresa = empresaService.findById(empresaId);

		if (empresa == null) {
			throw new RuntimeException("No se encontró la empresa -" + empresaId);
		}
		return empresa;
	}

	@PostMapping("/guardar_empresa")
	public Empresa addUser(@RequestBody Empresa empresa) {
		empresaService.save(empresa);
		return empresa;
	}

	@PutMapping("/actualizar_empresa")
	public Empresa updateUser(@RequestBody Empresa empresa) {
		empresaService.save(empresa);
		return empresa;
	}

	@DeleteMapping("eliminar_empresa/{empresaId}")
	public String deteteUser(@PathVariable int empresaId) {
		Empresa empresa = empresaService.findById(empresaId);
		if (empresa == null) {
			throw new RuntimeException("No se encontró la empresa -" + empresaId);
		}
		empresaService.deleteById(empresaId);
		return "Empresa eliminada - " + empresaId;
	}
}
