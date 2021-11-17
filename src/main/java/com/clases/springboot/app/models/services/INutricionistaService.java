package com.clases.springboot.app.models.services;

import java.util.List;

import com.clases.springboot.app.models.entity.Nutricionista;

public interface INutricionistaService {
	public List<Nutricionista> findAll();
	public Nutricionista save(Nutricionista nutricionista);
	public Nutricionista findById(Long id);
	public void deleteById(Long id);
}
