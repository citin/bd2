package bd2.util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.List;


import bd2.model.Diccionario;
import bd2.model.Documento;
import bd2.model.Moderador;
import bd2.model.Tarea;
import bd2.model.Usuario;

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

		consultaHQL_a(session);
		consultaHQL_b(session);
		consultaHQL_c(session);
		consultaHQL_d(session);
//		consultaHQL_e(session);
//		consultaHQL_f(session);
//		consultaHQL_g(session);
		consultaHQL_h(session);
//		consultaHQL_i(session);
		
		session.close();

	}

	
	public static void consultaHQL_b(Session session) {
		tx = session.beginTransaction();
		
     	Query query = session.createQuery("SELECT distinct m FROM Moderador m JOIN m.evaluaciones e WHERE e.traduccion.idioma.nombre = 'ingles'");

		List<Moderador> moderadores = query.list();
		System.out.println("\n\n b) Listar los emails de los moderadores que hayan evaluado traducciones al inglés. \n\n");
		for (Moderador m : moderadores) {
			System.out.println("Email: " + m.getEmail() + "\n");
		}
		tx.commit();
	}


	public static void consultaHQL_a(Session session) {

//	tx = session.beginTransaction();

	Query query = session.createQuery("FROM Documento");

	List<Documento> documentos = query.list();
	System.out.println("\n a) Listar los nombres de todos los documentos. \n");
	
	for (Documento d : documentos) {
		System.out.println("Documento: " + d.getNombre() + "\n");
	}
	System.out.println("\n");


//	tx.commit();
	}
	
	public static void consultaHQL_c(Session session) {

//		tx = session.beginTransaction();

		Query query = session.createQuery("FROM Usuario WHERE ");

		List<Usuario> usuarios = query.list();
		System.out.println("\n a) Listar los usuarios que hayan iniciado una cursada de Frances de nivel 3 como minimo \n");
		
		for (Usuario usr : usuarios) {
			System.out.println("Nombre: " + usr.getNombre() + "\n");
		}
		System.out.println("\n");


//		tx.commit();
		}
	
	public static void consultaHQL_d(Session session) {
		tx = session.beginTransaction();

		Query query = session.createQuery("SELECT distinct m FROM Moderador m JOIN m.evaluaciones e WHERE (e.traduccion.fecha BETWEEN :fecha_desde AND :fecha_hasta)");
		query.setString("fecha_desde","2015-07-01");
		query.setString("fecha_hasta","2015-12-31");

		System.out.println("\n\n d) Listar moderadores que hayan revisado alguna traducción entre dos fechas pasadas como argumento. \n\n");
		List<Moderador> moderadores_entre_fechas = query.list();
		for (Moderador m : moderadores_entre_fechas) {
			System.out.println("Nombre: "+m.getNombre()+"\n");
		}
		tx.commit();
	}

	public static void consultaHQL_h(Session session) {
		tx = session.beginTransaction();
		Query query = session.createQuery("from Documento d where d not in (select doc from Documento doc join doc.parrafos p where p in (select t.parrafo from Traduccion t))");

		System.out.println("\n\n h) Obtener los nombres de los documentos que no tengan ningún párrafo traducido (en ningun idioma). \n\n");
		
		List<Documento> documentos_sin_traduccion = query.list();
		for (Documento d : documentos_sin_traduccion) {
			System.out.println("El documento " + d.getNombre() + " no tiene ninguna traducción\n");
		}
		tx.commit();
	}	
	
}