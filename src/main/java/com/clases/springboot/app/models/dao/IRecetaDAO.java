package com.clases.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.clases.springboot.app.models.entity.Receta;


public interface IRecetaDAO extends CrudRepository<Receta, Long> {

}
