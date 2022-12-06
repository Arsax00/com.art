package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Almacen;
import models.Ventas;

public class VentasController {

	
	
	public String createVentas(String date, Float precio, int cantidad) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ventas.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {
			Ventas usuario = new Ventas(date, precio, cantidad);

			session.beginTransaction();

			session.save(usuario);

			session.getTransaction().commit();

			session.close();

			return "Usuario creado";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al registrar la venta";
	}

	public String deleteVentas(int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ventas.class).buildSessionFactory();

		Session session = sessionFactory.openSession();
		try {

			session.beginTransaction();

			Ventas usuario = session.get(Ventas.class, id);

			session.delete(usuario);

			session.getTransaction().commit();

			session.close();
			return "Usuario borrado";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al borrar la venta";
	}

	public String getVentas(int id) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ventas.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {

			session.beginTransaction();

			Ventas usuario = session.get(Ventas.class, id);

			session.getTransaction().commit();

			session.close();
			return usuario.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al obtener la venta";

	}

	public List<String> getVentas() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ventas.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Ventas> criteria = builder.createQuery(Ventas.class);
		criteria.from(Almacen.class);
		List<Ventas> data = session.createQuery(criteria).getResultList();

		String salida = "";
		for (Ventas a : data) {

			salida += a.toString();
			salida += ":";
		} 
		String[] salidaBuena;
		salidaBuena = salida.split(":");

		List<String> lista = new ArrayList<String>();

		for (String a : salidaBuena) {
			lista.add(a);
		}

		return lista;
	}

}
