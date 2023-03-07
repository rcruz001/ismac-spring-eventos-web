package com.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventos.dao.JuegosDAO;
import com.eventos.entities.Juegos;

@Service
public class JuegosServiceImpl implements JuegosService {

	@Autowired
	private JuegosDAO juegosDAO;
	
	
	@Override
	public List<Juegos> findAll() {
		// TODO Auto-generated method stub
		return juegosDAO.findAll();
	}

	@Override
	public Juegos findOne(int id) {
		// TODO Auto-generated method stub
		return juegosDAO.findOne(id);
	}

	@Override
	public void add(Juegos juegos) {
		// TODO Auto-generated method stub
		juegosDAO.add(juegos);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		juegosDAO.del(id);

	}

	@Override
	public List<Juegos> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return juegosDAO.findAll(busqueda);
	}

	@Override
	public void add(String nombre, String descripcion) {
		// TODO Auto-generated method stub
		Juegos juego = new Juegos(nombre, descripcion);
		juegosDAO.add(juego);

	}

	@Override
	public void up(int id, String nombre, String descripcion) {
		// TODO Auto-generated method stub
		
		Juegos juego = new Juegos(id, nombre, descripcion);
		juegosDAO.add(juego);

	}

}
