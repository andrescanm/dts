package com.dts.acm.service;

import java.util.List;

import com.dts.acm.entity.Usuario;

public interface UsuarioServiceInterface {
	
	public List<Usuario> findAll();

	public Usuario findById(int id);

	public void save(Usuario usuario);

	public void deleteById(int id);
}
