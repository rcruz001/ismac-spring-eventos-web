package com.eventos.dao;

import java.util.List;
import com.eventos.entities.Usuarios;


public interface UsuariosDAO {
	
	public List<Usuarios> findAll();
	
	public Usuarios findOne(int id);
	
	public void add(Usuarios usuario);
	
	public void up(Usuarios usuario);
	
	public void del(int id);
	
	//PERSONALIZADO
	
	public List<Usuarios> findAll(String busqueda);



}
