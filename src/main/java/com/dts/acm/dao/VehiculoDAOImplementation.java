package com.dts.acm.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dts.acm.entity.Vehiculo;

@Repository
public class VehiculoDAOImplementation implements VehiculoDAOInterface {

	@Autowired
    private EntityManager entityManager;
	
	@Override
	public List<Vehiculo> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
        Query<Vehiculo> theQuery = currentSession.createQuery("from Vehiculo", Vehiculo.class);
        List<Vehiculo> vehiculos = theQuery.getResultList();
        return vehiculos;
	}

	@Override
	public Vehiculo findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Vehiculo vehiculo = currentSession.get(Vehiculo.class, id);
        return vehiculo;
	}

	@Override
	public void save(Vehiculo vehiculo) {
		Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(vehiculo);
	}

	@Override
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
        Query<Vehiculo> theQuery = currentSession.createQuery("delete from Vehiculo where idVehiculo=:id", Vehiculo.class);
        theQuery.setParameter("idUser", id);
        theQuery.executeUpdate();
	}

}
