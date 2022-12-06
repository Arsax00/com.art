package controllers;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Clientes;

public class ClientesController {
	public String createClientes(String cif, String nom, String apes, String dir, int telf, String email, String web,
			int fax, String observaciones) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Clientes.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {
			Clientes clientes = new Clientes(cif, nom, apes, dir, telf, email, web, fax, observaciones);

			session.beginTransaction();

			session.save(clientes);

			session.getTransaction().commit();

			session.close();

			return "Entrada en clientes creada";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al registrar la entrada en clientes";
	}

	public String deleteCliente(int cif) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Clientes.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();

			Clientes clientes = session.get(Clientes.class, cif);

			session.delete(clientes);

			session.getTransaction().commit();

			session.close();
			return "Entrada en clientes borrada";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al borrar la entrada en clientes";

	}

	public String getCliente(int cif) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Clientes.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {

			session.beginTransaction();

			Clientes clientes = session.get(Clientes.class, cif);

			session.getTransaction().commit();

			session.close();
			return clientes.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al obtener la entrada de clientes";

	}

	public String[] getClientes() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Clientes.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Clientes> criteria = builder.createQuery(Clientes.class);
		criteria.from(Clientes.class);
		List<Clientes> data = session.createQuery(criteria).getResultList();

		String salida = "";
		for (Clientes a : data) {
//			 System.out.println(a.toString());
			salida += a.toString();
			salida += ":";
		} // Fin Para

		String[] salidaBuena;
		salidaBuena = salida.split(":");
		return salidaBuena;
	}
}
