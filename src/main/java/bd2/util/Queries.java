package bd2.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bd2.model.Moderador;


public class Queries {

	private static SessionFactory sessions;
	private static Transaction tx = null;

	public Queries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml");
		sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();

		consultaHQL_b(session);
		
		/*
		 * 
		 * 
		 */
		
		session.close();

	}
	
	public static void consultaHQL_b(Session session) {
		tx = session.beginTransaction();
		
		 Query query = session.createQuery("select distinct m from Moderador m join m.evaluaciones e where e.traduccion.idioma.nombre = 'ingles'");
		//Query query = session.createQuery("select distinct m from Moderador m");

		List<Moderador> moderadores = query.list();
		System.out.println("\n\n b) Listar los emails de los moderadores que hayan evaluado traducciones al inglés. \n\n");
		for (Moderador m : moderadores) {
			System.out.println("Email: " + m.getEmail() + "\n");
		}

		tx.commit();
	}
}