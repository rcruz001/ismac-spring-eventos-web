package com.eventos.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eventos.entities.Eventos;

@Repository
public class EventosDAOImpl implements EventosDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Eventos> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Eventos> eventos = session.createQuery("from Eventos", Eventos.class).getResultList();
		return eventos;
	}

	@Override
	@Transactional
	public Eventos findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Eventos.class, id);
	}

	@Override
	@Transactional
	public void add(Eventos eventos) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(eventos);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Eventos evento = session.get(Eventos.class, id);
		session.delete(evento);
	}

	@Override
	@Transactional
	public List<Eventos> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Eventos> query = session.createQuery(
				"SELECT EV"
				+ " FROM Eventos EV"
				+ " WHERE EV.nombre LIKE : keyBusqueda"
				+ " OR EV.fecha LIKE : keyBusqueda"
				+ " OR EV.asunto LIKE : keyBusqueda"
				+ " OR EV.lugar LIKE : keyBusqueda"
				+ " OR EV.imagen LIKE : keyBusqueda"
				+ " OR EV.imagenNombre LIKE : keyBusqueda"
				, Eventos.class);
		
		query.setParameter("keyBusqueda", "%"+busqueda+"%");
		return query.getResultList();
	}

}
