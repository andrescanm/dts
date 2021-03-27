package com.dts.acm.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dts.acm.entity.Usuario;

@Repository
public class UsuarioDAOImplementation implements UsuarioDAOInterface{
	
	@Autowired
    private EntityManager entityManager;

	@Override
	public List<Usuario> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
        Query<Usuario> theQuery = currentSession.createQuery("from Usuario", Usuario.class);
        List<Usuario> usuarios = theQuery.getResultList();
        return usuarios;
	}

	@Override
	public Usuario findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
        Usuario usuario = currentSession.get(Usuario.class, id);
        return usuario;
	}

	@Override
	public void save(Usuario usuario) {
		Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(usuario);
	}

	@Override
	public void deleteById(int id) {
		System.out.println("Implements deleteById method...");
		Session currentSession = entityManager.unwrap(Session.class);
        Query<Usuario> theQuery = currentSession.createQuery("delete from Usuario where idUsuario=:id", Usuario.class);
        theQuery.setParameter("idUser", id);
        theQuery.executeUpdate();
	}

}
