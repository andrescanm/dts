package com.dts.acm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.acm.dao.VehiculoDAOInterface;
import com.dts.acm.entity.Vehiculo;

@Service
public class VehiculoServiceImplementation implements VehiculoServiceInterface {

	@Autowired
    private VehiculoDAOInterface vehiculoDAO;
	
	@Override
	public List<Vehiculo> findAll() {
		return vehiculoDAO.findAll();
	}

	@Override
	public Vehiculo findById(int id) {
		return vehiculoDAO.findById(id);
	}

	@Override
	public void save(Vehiculo vehiculo) {
		vehiculoDAO.save(vehiculo);
	}

	@Override
	public void deleteById(int id) {
		vehiculoDAO.deleteById(id);
	}

}
