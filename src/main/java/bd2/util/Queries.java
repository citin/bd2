package bd2.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


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

		/*
		 * 
		 * 
		 */
		
		session.close();

	}
}