package com.clases.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="tb_usuario")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6238443473161492441L;

	@Id
	@Column(name="USU_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	//@NotEmpty(message = "user.tags.empty")
	//@Size(min=8,max=25,message = "El campo debe tener como minimo 8 caracteres")
	@Column(name="USU_CONTRASENA")
	private String contrasena;

	@OneToOne(mappedBy="usuarioAtributo",fetch = FetchType.EAGER)
	private Nutricionista nutricionistaAtributo;
	
	//GETTER'S - SETTER'S:
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	//GETTER Y SETTER DE RELACION
	
	public Nutricionista getNutricionistaAtributo() {
		return nutricionistaAtributo;
	}

	public void setNutricionistaAtributo(Nutricionista nutricionistaAtributo) {
		this.nutricionistaAtributo = nutricionistaAtributo;
	}
}
