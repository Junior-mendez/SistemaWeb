package com.clases.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.clases.springboot.app.models.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {

}
