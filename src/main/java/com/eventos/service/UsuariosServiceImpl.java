package com.eventos.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eventos.dao.UsuariosDAO;
import com.eventos.entities.Usuarios;

@Service
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	private UsuariosDAO usuariosDAO;
	
	@Override
	public List<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return usuariosDAO.findAll();
	}

	@Override
	public Usuarios findOne(int id) {
		// TODO Auto-generated method stub
		return usuariosDAO.findOne(id);
	}

	@Override
	public void add(Usuarios usuario) {
		// TODO Auto-generated method stub
		usuariosDAO.add(usuario);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		usuariosDAO.del(id);
	}

	@Override
	public List<Usuarios> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return usuariosDAO.findAll(busqueda);
	}

	@Override
	public void add(String cedula, String nombre1, String nombre2, String apellido1, String apellido2,
			Date fechaNacimiento, int edad, String sexo, String direccion, String telefono, String correo,
			String tipo) {
		// TODO Auto-generated method stub
		Usuarios usuario = new Usuarios(cedula, nombre1, nombre2, apellido1, apellido2, fechaNacimiento, edad, sexo, direccion, telefono, correo, tipo);
		usuariosDAO.add(usuario);
	}

	@Override
	public void up(int id, String cedula, String nombre1, String nombre2, String apellido1, String apellido2,
			Date fechaNacimiento, int edad, String sexo, String direccion, String telefono, String correo,
			String tipo) {
		// TODO Auto-generated method stub
		Usuarios usuario = new Usuarios(id, cedula, nombre1, nombre2, apellido1, apellido2, fechaNacimiento, edad, sexo, direccion, telefono, correo, tipo);
		usuariosDAO.add(usuario);
	}

}
