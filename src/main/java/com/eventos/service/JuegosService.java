package com.eventos.service;

import java.util.List;

import com.eventos.entities.Juegos;

public interface JuegosService {
	
			//CRUD BASICO: (CREATE, READ, UPDATE, DELETE)
	
			public List<Juegos> findAll(); 
			
			public Juegos findOne(int id);
			
			public void add(Juegos juegos);
			
			//public void up(Juegos juegos);
			
			public void del(int id);

			
			//CONSULTAS PERSONALIZADAS
			
			public List<Juegos> findAll(String busqueda);
			
			public void add(String nombre, String descripcion);
			
			public void up(int id, String nombre, String descripcion);

}
