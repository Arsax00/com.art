package controllers;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Almacen;
import models.Usuario;

public class AlmacenController {
	public String createAlmacen(String nom, int cant, int com, int ven) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Almacen.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {
			Almacen almacen = new Almacen(nom, cant, com, ven);

			session.beginTransaction();

			session.save(almacen);

			session.getTransaction().commit();

			session.close();

			return "Entrada en almacen creada";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al registrar la entrada en almacen";
	}

	public String deleteAlmacen(int id) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Almacen.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();

			Almacen almacen = session.get(Almacen.class, id);

			session.delete(almacen);

			session.getTransaction().commit();

			session.close();
			return "Entrada en almacen borrada";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al borrar la entrada en almacen";

	}

	public String getAlmacen(int id) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Almacen.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {

			session.beginTransaction();

			Almacen almacen = session.get(Almacen.class, id);

			session.getTransaction().commit();

			session.close();
			return almacen.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al obtener la entrada de almacen";

	}

	public String[] getAlmacenes() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Almacen.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Almacen> criteria = builder.createQuery(Almacen.class);
		criteria.from(Almacen.class);
		List<Almacen> data = session.createQuery(criteria).getResultList();

		String salida = "";
		for (Almacen a : data) {
//			 System.out.println(a.toString());
			salida += a.toString();
			salida += ":";
		} // Fin Para

		String[] salidaBuena;
		salidaBuena = salida.split(":");
		return salidaBuena;
	}
}
