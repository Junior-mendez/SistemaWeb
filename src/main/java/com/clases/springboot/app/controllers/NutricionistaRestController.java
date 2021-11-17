package com.clases.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clases.springboot.app.models.entity.Nutricionista;
import com.clases.springboot.app.models.services.INutricionistaService;

@RestController
@RequestMapping("/api")
public class NutricionistaRestController {

	@Autowired
	private INutricionistaService nutricionistaService;
	
	@GetMapping("/nutricionistas")
	private List<Nutricionista>index(){
		return nutricionistaService.findAll();
	}
	
	@GetMapping("/nutricionistas/{id}")
	public Nutricionista show(@PathVariable Long id) {
		return nutricionistaService.findById(id);
	}
	
	@PostMapping("/nutricionistas")
	@ResponseStatus(HttpStatus.CREATED)
	public Nutricionista create(@RequestBody Nutricionista nutricionista) {
		return nutricionistaService.save(nutricionista);
	}
	
	@PutMapping("/nutricionistas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Nutricionista update(@RequestBody Nutricionista nutricionista,@PathVariable Long id) {
		Nutricionista nutricionistaActual=nutricionistaService.findById(id);
		nutricionistaActual.setNombre(nutricionista.getNombre());
		nutricionistaActual.setApellido(nutricionista.getApellido());
		nutricionistaActual.setDni(nutricionista.getDni());
		nutricionistaActual.setTelefono(nutricionista.getTelefono());
		nutricionistaActual.setCorreo(nutricionista.getCorreo());
		
		return nutricionistaService.save(nutricionistaActual);
	}
	
	@DeleteMapping("/nutricionistas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		nutricionistaService.deleteById(id);
	}
	
}
