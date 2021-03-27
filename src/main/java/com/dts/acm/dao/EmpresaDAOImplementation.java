package com.dts.acm.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dts.acm.entity.Empresa;

@Repository
public class EmpresaDAOImplementation implements EmpresaDAOInterface {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Empresa> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Empresa> theQuery = currentSession.createQuery("from Empresa", Empresa.class);
		List<Empresa> empresas = theQuery.getResultList();
		return empresas;
	}

	@Override
	public Empresa findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Empresa empresa = currentSession.get(Empresa.class, id);
		return empresa;
	}

	@Override
	public void save(Empresa empresa) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(empresa);
	}

	@Override
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Empresa> theQuery = currentSession.createQuery("delete from Empresa where idEmpresa=:id", Empresa.class);
		theQuery.setParameter("idEmpresa", id);
		theQuery.executeUpdate();
	}

}
