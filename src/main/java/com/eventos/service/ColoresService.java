package com.eventos.service;

import java.util.List;

import com.eventos.entities.Colores;

public interface ColoresService {
	
	//CRUD BASICO: (CREATE, READ, UPDATE, DELETE)
	
	public List<Colores> findAll(); 
	
	public Colores findOne(int id);
	
	public void add(Colores colores);
	
	//public void up(Colores colores);
	
	public void del(int id);

	
	//CONSULTAS PERSONALIZADAS
	
	public List<Colores> findAll(String busqueda);
	
	public void add(String nombre, String descripcion);
	
	public void up(int id, String nombre, String descripcion);

}
