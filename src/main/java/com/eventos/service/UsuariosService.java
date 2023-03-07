package com.eventos.service;

import java.sql.Date;
import java.util.List;

import com.eventos.entities.Usuarios;



public interface UsuariosService {

	public List<Usuarios> findAll(); 
	
	public Usuarios findOne(int id);
	
	public void add(Usuarios usuario);
	
	
	//public void up(Usuarios usuario);
	
	public void del(int id);
	
	// CONSULTAS PERSONALIZADAS
	
	public List<Usuarios> findAll(String busqueda);
	
	public void add(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNacimiento,  int edad, String sexo, String direccion, String telefono, String correo, String tipo);

	public void up(int id, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNacimiento,  int edad, String sexo, String direccion, String telefono, String correo, String tipo);
	
}
