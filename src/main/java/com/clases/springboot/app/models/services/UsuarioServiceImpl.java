package com.clases.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clases.springboot.app.models.dao.IUsuarioDAO;
import com.clases.springboot.app.models.entity.Usuario;


@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Transactional
	@Override
	public void save(Usuario usuario) {
		usuarioDao.save(usuario);
	}

	@Transactional(readOnly = true)
	@Override
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void deleteById(Long id) {
		usuarioDao.deleteById(id);
	}
	
}
