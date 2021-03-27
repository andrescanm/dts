package com.dts.acm.service;

import java.util.List;

import com.dts.acm.entity.Vehiculo;

public interface VehiculoServiceInterface {

	public List<Vehiculo> findAll();

	public Vehiculo findById(int id);

	public void save(Vehiculo vehiculo);

	public void deleteById(int id);

}
