package com.clases.springboot.app.models.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="nutricionista")
public class Nutricionista implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1647474517933138131L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNutricionista;
	
	@NotEmpty
	//@Size(min = 3, max = 20, message = "el nombre debe tener mas de 3 letras y menos de 20.")
	@Column(name="NUT_NOMBRE")
	private String nombre;
	
	@NotEmpty
	@Column(name="NUT_APELLIDO")
	private String apellido;
	
	@NotEmpty
	@Size(max=8)
	@Column(name="NUT_DNI")
	private String dni;
	
	@NotEmpty
	@Column(name="NUT_TELEFONO")
	private String telefono;
	
	@NotEmpty
	@Email
	@Column(name="NUT_CORREO")
	private String correo;

	//RELACION 1:1
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="USU_NUT_ID")
	private Usuario usuarioAtributo;
		
	//RELACION UNO A MUCHOS
	@OneToMany(mappedBy = "nutricionista")
	List<Receta> receta;
		
		
	//GETTER Y SETTER
	
	public Long getIdNutricionista() {
		return idNutricionista;
	}

	public void setIdNutricionista(Long idNutricionista) {
		this.idNutricionista = idNutricionista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	//GETTER Y SETTER DE RELACION
		
	public Usuario getUsuarioAtributo() {
		return usuarioAtributo;
	}

	public void setUsuarioAtributo(Usuario usuarioAtributo) {
		this.usuarioAtributo = usuarioAtributo;
	}

	public List<Receta> getReceta() {
		return receta;
	}

	public void setReceta(List<Receta> receta) {
		this.receta = receta;
	}

	
}
