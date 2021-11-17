package com.clases.springboot.app.models.services;

import java.util.List;

import com.clases.springboot.app.models.entity.Receta;

public interface IRecetaService {
	public List<Receta> findAll();
	public void save(Receta receta);
	public Receta findById(Long id);
	public void deleteById(Long id);
}
