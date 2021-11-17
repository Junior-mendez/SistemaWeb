package com.clases.springboot.app.models.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="tb_receta")
public class Receta{
	@Id
	@Column(name="ID_REC")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReceta;
	
	@Column(name="REC_NOMBRE")
	private String nombre;

	@Column(name="REC_IMAGEN")
	private String imagen;	
	
	@Column(name="REC_VALORNUTRI")
	private String valorNutri;

	
	//RELACION 1:1
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="REC_DET_ID")
	private DetalleReceta detalleAtributo;
	
	//RELACION MUCHOS A UNO
	@ManyToOne
	@JoinColumn(name="NUTRICIONISTA_ID")
	private Nutricionista nutricionista;
	
	
	//GETTER Y SETTER
	
	public Long getIdReceta() {
		return idReceta;
	}

	public void setIdReceta(Long idReceta) {
		this.idReceta = idReceta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getValorNutri() {
		return valorNutri;
	}

	public void setValorNutri(String valorNutri) {
		this.valorNutri = valorNutri;
	}

	public DetalleReceta getDetalleAtributo() {
		return detalleAtributo;
	}

	public void setDetalleAtributo(DetalleReceta detalleAtributo) {
		this.detalleAtributo = detalleAtributo;
	}

	public Nutricionista getNutricionista() {
		return nutricionista;
	}

	public void setNutricionista(Nutricionista nutricionista) {
		this.nutricionista = nutricionista;
	}

	


	
}
