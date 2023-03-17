package com.eventos.service;

import java.util.Date;
import java.util.List;

import com.eventos.entities.Eventos;

public interface EventosService {
	
	//CRUD BASICO: (CREATE, READ, UPDATE, DELETE)
	
	public List<Eventos> findAll(); 
	
	public Eventos findOne(int id);
	
	//public void add(Eventos eventos);
	
	//public void up(Eventos eventos);

	public void add(String nombre, Date fecha, String asunto, String lugar, byte imagen, String imagen_nombre);
	
	public void up(int id, String nombre, Date fecha, String asunto, String lugar, byte imagen, String imagen_nombre);
	
	public void del(int id);

	
	//CONSULTAS PERSONALIZADAS
	
	public List<Eventos> findAll(String busqueda);
	
	

}
