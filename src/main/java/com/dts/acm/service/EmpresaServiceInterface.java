package com.dts.acm.service;

import java.util.List;

import com.dts.acm.entity.Empresa;

public interface EmpresaServiceInterface {
	
	public List<Empresa> findAll();

	public Empresa findById(int id);

	public void save(Empresa empresa);

	public void deleteById(int id);
}
