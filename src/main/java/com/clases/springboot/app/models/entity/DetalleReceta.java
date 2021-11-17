package com.clases.springboot.app.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_detalleReceta")

public class DetalleReceta {

	@Id
	@Column(name="ID_DETALLE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetalle;
	
	@Column(name="DETA_PREPARACION")
	private String preparacion;

	
	@OneToOne(mappedBy = "detalleAtributo",fetch = FetchType.LAZY)
	private Receta recetaAtributo;
	

	//GETTER Y SETTER
	
	public Long getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}

	public String getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}

	public Receta getRecetaAtributo() {
		return recetaAtributo;
	}

	public void setRecetaAtributo(Receta recetaAtributo) {
		this.recetaAtributo = recetaAtributo;
	}
	

	
	
	
}
