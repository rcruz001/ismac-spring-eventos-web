package com.eventos.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eventos.entities.Colores;


@Repository
public class ColoresDAOImpl implements ColoresDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Colores> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Colores> colores = session.createQuery("from Colores", Colores.class).getResultList();
		return colores;
	}

	@Override
	@Transactional
	public Colores findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Colores.class, id);
		
	}

	@Override
	@Transactional
	public void add(Colores colores) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(colores);

	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Colores color = session.get(Colores.class, id);
		session.delete(color);

	}

	@Override
	@Transactional
	public List<Colores> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Colores> query = session.createQuery(
				"SELECT CO "
				+ " FROM Colores CO"
				+ " WHERE CO.nombre LIKE : keyBusqueda"
				+ " OR CO.descripcion LIKE : keyBusqueda"
				, Colores.class);
		
		query.setParameter("keyBusqueda", "%"+busqueda+"%");
		return query.getResultList();
	}

}
