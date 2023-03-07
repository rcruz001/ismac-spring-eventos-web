package com.eventos.dao;

import java.util.List;

import com.eventos.entities.Eventos;

public interface EventosDAO {
	
		//CRUD BASICO: (CREATE, READ, UPDATE, DELETE)
	
		public List<Eventos> findAll(); 
				
		public Eventos findOne(int id);
				
		public void add(Eventos eventos);
				
		//public void up(Eventos eventos);
				
		public void del(int id);

				
		//CONSULTAS PERSONALIZADAS
				
		public List<Eventos> findAll(String busqueda);
		

}
