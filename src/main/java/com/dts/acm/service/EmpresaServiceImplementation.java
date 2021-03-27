package com.dts.acm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dts.acm.dao.EmpresaDAOInterface;
import com.dts.acm.entity.Empresa;

@Service
public class EmpresaServiceImplementation implements EmpresaServiceInterface{

	@Autowired
    private EmpresaDAOInterface empresaDAO;
	
	@Override
	public List<Empresa> findAll() {
		List<Empresa> empresasList= empresaDAO.findAll();
        return empresasList;
	}

	@Override
	public Empresa findById(int id) {
		Empresa empresa = empresaDAO.findById(id);
		return empresa;
	}

	@Override
	public void save(Empresa empresa) {
		empresaDAO.save(empresa);
	}

	@Override
	public void deleteById(int id) {
		empresaDAO.deleteById(id);
	}

}
