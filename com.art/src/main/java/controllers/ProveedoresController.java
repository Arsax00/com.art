package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Proveedores;

public class ProveedoresController {
	public String createProveedor(String cif, String nom, String dir, int telf, String email, String web, int fax,
			String observaciones) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Proveedores.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {
			Proveedores proveedores = new Proveedores(cif, nom, dir, telf, email, web, fax, observaciones);

			session.beginTransaction();

			session.save(proveedores);

			session.getTransaction().commit();

			session.close();

			return "Entrada en proveedores creada";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al registrar la entrada en proveedores";
	}

	public String deleteProveedor(int cif) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Proveedores.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();

			Proveedores proveedores = session.get(Proveedores.class, cif);

			session.delete(proveedores);

			session.getTransaction().commit();

			session.close();
			return "Entrada en proveedores borrada";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al borrar la entrada en proveedores";

	}

	public String getProveedor(int cif) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Proveedores.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {

			session.beginTransaction();

			Proveedores proveedores = session.get(Proveedores.class, cif);

			session.getTransaction().commit();

			session.close();
			return proveedores.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al obtener la entrada de proveedores";

	}

	public List<String> getProveedores() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Proveedores.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Proveedores> criteria = builder.createQuery(Proveedores.class);
		criteria.from(Proveedores.class);
		List<Proveedores> data = session.createQuery(criteria).getResultList();

		String salida = "";
		for (Proveedores a : data) {
//			 System.out.println(a.toString());
			salida += a.toString();
			salida += ":";
		} // Fin Para

		String[] salidaBuena;
		salidaBuena = salida.split(":");

		List<String> lista = new ArrayList<String>();
		
		for (String a : salidaBuena) {
			lista.add(a);
		}//Fin Para

		return lista;
	}
}
