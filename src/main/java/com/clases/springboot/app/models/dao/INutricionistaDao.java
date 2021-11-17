package com.clases.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.clases.springboot.app.models.entity.Nutricionista;

public interface INutricionistaDao extends CrudRepository<Nutricionista, Long> {

}
