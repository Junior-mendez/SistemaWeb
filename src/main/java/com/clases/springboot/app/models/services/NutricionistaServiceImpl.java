package com.clases.springboot.app.models.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.models.dao.INutricionistaDao;
import com.clases.springboot.app.models.entity.Nutricionista;
@Service
public class NutricionistaServiceImpl implements INutricionistaService {

	@Autowired
	private INutricionistaDao nutricionistaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Nutricionista> findAll() {
		// TODO Auto-generated method stub
		return (List<Nutricionista>) nutricionistaDao.findAll();
	}

	@Override
	@Transactional
	public Nutricionista save(Nutricionista nutricionista) {
		return nutricionistaDao.save(nutricionista);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Nutricionista findById(Long id) {
		return nutricionistaDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void deleteById(Long id) {
		nutricionistaDao.deleteById(id);
	}
}
