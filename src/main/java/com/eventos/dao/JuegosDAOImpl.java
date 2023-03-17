package com.eventos.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eventos.entities.Juegos;

@Repository
public class JuegosDAOImpl implements JuegosDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Juegos> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Juegos> juegos = session.createQuery("from Juegos", Juegos.class).getResultList();
		return juegos;
	}

	@Override
	@Transactional
	public Juegos findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Juegos.class, id);
	}

	@Override
	@Transactional
	public void add(Juegos juegos) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(juegos);

	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Juegos juego = session.get(Juegos.class, id);
		session.delete(juego);

	}

	@Override
	@Transactional
	public List<Juegos> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Juegos> query = session.createQuery(
				"SELECT JU"
				+" FROM Juegos JU "
				+" WHERE JU.nombre LIKE : keyBusqueda "
				+" OR JU.descripcion LIKE : keyBusqueda "
				, Juegos.class);
		
		query.setParameter("keyBusqueda", "%"+busqueda+"%");
		
		return query.getResultList();
	}

}
