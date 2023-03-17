package com.eventos.dao;

import java.util.List;

import com.eventos.entities.Colores;

public interface ColoresDAO {

		//CRUD BASICO: (CREATE, READ, UPDATE, DELETE)
	
		public List<Colores> findAll(); 
			
		public Colores findOne(int id);
			
		public void add(Colores colores);
			
		//public void up(Colores colores);
			
		public void del(int id);

			
		//CONSULTAS PERSONALIZADAS
			
		public List<Colores> findAll(String busqueda);
	
}
