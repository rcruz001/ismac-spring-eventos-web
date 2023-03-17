package com.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventos.dao.ColoresDAO;
import com.eventos.entities.Colores;

@Service
public class ColoresServiceImpl implements ColoresService {

	@Autowired
	private ColoresDAO coloresDAO;
	
	@Override
	public List<Colores> findAll() {
		// TODO Auto-generated method stub
		return coloresDAO.findAll();
	}

	@Override
	public Colores findOne(int id) {
		// TODO Auto-generated method stub
		return coloresDAO.findOne(id);
	}

	@Override
	public void add(Colores colores) {
		// TODO Auto-generated method stub
		coloresDAO.add(colores);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		coloresDAO.del(id);
	}

	@Override
	public List<Colores> findAll(String busqueda) {
		// TODO Auto-generated method stub
		
		return coloresDAO.findAll(busqueda);
	}

	@Override
	public void add(String nombre, String descripcion) {
		// TODO Auto-generated method stub
		Colores colores = new Colores(nombre, descripcion);
		coloresDAO.add(colores);
	}

	@Override
	public void up(int id, String nombre, String descripcion) {
		// TODO Auto-generated method stub
		Colores colores = new Colores(id, nombre, descripcion);
		coloresDAO.add(colores);
	}

}
