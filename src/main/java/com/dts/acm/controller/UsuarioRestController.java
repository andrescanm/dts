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

import com.dts.acm.entity.Usuario;
import com.dts.acm.service.UsuarioServiceImplementation;

@RestController
@RequestMapping("/dts")
public class UsuarioRestController {

	@Autowired
	private UsuarioServiceImplementation usuarioService;

	@GetMapping("/listar_usuarios")
	public List<Usuario> findAll() {
		List<Usuario> usuarios = usuarioService.findAll();
		if (usuarios == null) {
			throw new RuntimeException("No se encontró ningún usuario registrado.");
		}
		return usuarios;
	}

	@GetMapping("/listar_usuarios/{usuarioId}")
	public Usuario getUser(@PathVariable int usuarioId) {
		Usuario usuario = usuarioService.findById(usuarioId);

		if (usuario == null) {
			throw new RuntimeException("No se encontró el usuario -" + usuarioId);
		}
		return usuario;
	}

	@PostMapping("/guardar_usuario")
	public Usuario addUser(@RequestBody Usuario usuario) {
		usuarioService.save(usuario);
		return usuario;
	}

	@PutMapping("/actualizar_usuario")
	public Usuario updateUser(@RequestBody Usuario usuario) {
		usuarioService.save(usuario);
		return usuario;
	}

	@DeleteMapping("eliminar_usuario/{usuarioId}")
	public String deteteUser(@PathVariable int usuarioId) {
		Usuario usuario = usuarioService.findById(usuarioId);
		if (usuario == null) {
			throw new RuntimeException("No se encontró el usuario -" + usuarioId);
		}
		usuarioService.deleteById(usuarioId);
		return "Usuario eliminado - " + usuarioId;
	}
}
