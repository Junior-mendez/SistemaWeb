package com.clases.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.models.dao.IRecetaDAO;
import com.clases.springboot.app.models.entity.Receta;


@Service
public class RecetaServiceImpl implements IRecetaService {

	@Autowired
	private IRecetaDAO recetaDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Receta> findAll() {
		return (List<Receta>) recetaDao.findAll();
	}

	@Transactional
	@Override
	public void save(Receta receta) {
		recetaDao.save(receta);
	}

	@Transactional(readOnly =true)
	@Override
	public Receta findById(Long id) {
		return recetaDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		recetaDao.deleteById(id);
	}


}
