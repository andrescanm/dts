package com.dts.acm.dao;

import java.util.List;

import com.dts.acm.entity.Empresa;

public interface EmpresaDAOInterface {
	
	public List<Empresa> findAll();

	public Empresa findById(int id);

	public void save(Empresa empresa);

	public void deleteById(int id);
	
}
