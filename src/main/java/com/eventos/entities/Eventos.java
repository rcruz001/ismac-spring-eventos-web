package com.eventos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Eventos")
public class Eventos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="asunto")
	private String asunto;
	@Column(name="lugar")
	private String lugar;
	@Column(name="imagen")
	private byte imagen;
	@Column(name="imagen_nombre")
	private String imagenNombre;
	 

	

	public Eventos(String nombre, Date fecha, String asunto, String lugar, byte imagen, String imagenNombre) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.asunto = asunto;
		this.lugar = lugar;
		this.imagen = imagen;
		this.imagenNombre = imagenNombre;
	}

	
	
	public Eventos(int id, String nombre, Date fecha, String asunto, String lugar, byte imagen, String imagenNombre) {
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.asunto = asunto;
		this.lugar = lugar;
		this.imagen = imagen;
		this.imagenNombre = imagenNombre;
	}



	public Eventos() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public byte getImagen() {
		return imagen;
	}

	public void setImagen(byte imagen) {
		this.imagen = imagen;
	}

	public String getImagenNombre() {
		return imagenNombre;
	}

	public void setImagenNombre(String imagenNombre) {
		this.imagenNombre = imagenNombre;
	}

	@Override
	public String toString() {
		return "Eventos [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", asunto=" + asunto + ", lugar="
				+ lugar + ", imagen=" + imagen + ", imagenNombre=" + imagenNombre + "]";
	}
	
}
