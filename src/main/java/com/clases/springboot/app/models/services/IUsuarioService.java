package com.clases.springboot.app.models.services;

import java.util.List;

import com.clases.springboot.app.models.entity.Usuario;



public interface IUsuarioService {

	public List<Usuario> findAll();

	public void save(Usuario usuario);
	public Usuario findById(Long id);
	public void deleteById(Long id);

}
