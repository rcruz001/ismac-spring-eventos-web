package com.eventos.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eventos.entities.Usuarios;

@Repository
public class UsuariosDAOImpl implements UsuariosDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Usuarios> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Usuarios> usuarios = session.createQuery("from Usuarios", Usuarios.class).getResultList();
		
		return usuarios;
	}

	@Override
	@Transactional
	public Usuarios findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Usuarios> query = session.createQuery("select us from Usuarios us where us.id = : keyId", Usuarios.class);
		query.setParameter("keyId", id);
		return query.getSingleResult();
	}

	@Override
	@Transactional
	public void add(Usuarios usuario) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(usuario);
	}

	@Override
	@Transactional
	public void up(Usuarios usuario) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("update Usuarios set cedula=:cedula, nombre1=:nombre1, nombre2=:nombre2, apellido1=:apellido1, apellido2=:apellido2, fechaNacimiento=:fechaNacimiento, edad=:edad, sexo=:sexo, direccion=:direccion, telefono=:telefono, correo=:correo, tipo=:tipo  where id=:id");
		query.setParameter("cedula", usuario.getCedula());
		query.setParameter("nombre1", usuario.getNombre1());
		query.setParameter("nombre2", usuario.getNombre2());
		query.setParameter("apellido1", usuario.getApellido1());
		query.setParameter("apellido2", usuario.getApellido2());
		query.setParameter("fechaNacimiento", usuario.getFechaNacimiento());
		query.setParameter("edad", usuario.getEdad());
		query.setParameter("sexo", usuario.getSexo());
		query.setParameter("direccion", usuario.getDireccion());
		query.setParameter("telefono", usuario.getTelefono());
		query.setParameter("correo", usuario.getCorreo());
		query.setParameter("tipo", usuario.getTipo());
		
		query.executeUpdate();
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Usuarios where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();


	}

	@Override
	@Transactional
	public List<Usuarios> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(
				"select US"
				+" from Usuarios US"
				+" where US.cedula LIKE : busqueda"
				+" or US.nombre1 LIKE : busqueda"
				+" or US.nombre2 LIKE : busqueda"
				+" or US.apellido1 LIKE : busqueda"	
				+" or US.apellido2 LIKE : busqueda"
				+" or US.fechaNacimiento LIKE : busqueda"
				+" or US.edad LIKE : busqueda"	
				+" or US.sexo LIKE : busqueda"	
				+" or US.direccion LIKE : busqueda"	
				+" or US.telefono LIKE : busqueda"
				+" or US.correo LIKE : busqueda"
				+" or US.tipo LIKE : busqueda"	
				, Usuarios.class);
		query.setParameter("busqueda", "%"+busqueda+"%");
		return query.getResultList();
	}

}
