package com.dts.acm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.acm.dao.UsuarioDAOInterface;
import com.dts.acm.entity.Usuario;

@Service
public class UsuarioServiceImplementation implements UsuarioServiceInterface{

	@Autowired
    private UsuarioDAOInterface usuarioDAO;
	
	@Override
	public List<Usuario> findAll() {
		List<Usuario> usuariosList= usuarioDAO.findAll();
        return usuariosList;
	}

	@Override
	public Usuario findById(int id) {
		Usuario usuario = usuarioDAO.findById(id);
		return usuario;
	}

	@Override
	public void save(Usuario usuario) {
		usuarioDAO.save(usuario);
	}

	@Override
	public void deleteById(int id) {
		usuarioDAO.deleteById(id);
	}

}
