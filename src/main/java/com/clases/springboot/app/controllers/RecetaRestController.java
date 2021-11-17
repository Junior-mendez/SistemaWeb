package com.clases.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clases.springboot.app.models.entity.Receta;
import com.clases.springboot.app.models.services.IRecetaService;

@RestController
@RequestMapping("/api")
public class RecetaRestController {

	@Autowired
	private IRecetaService recetaService;
	
	@GetMapping("/recetas")
	private List<Receta>index(){
		return recetaService.findAll();
	}
}
