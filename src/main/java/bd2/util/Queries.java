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
import bd2.model.Traduccion;
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
		consultaHQL_b(session, "Inglés");
		consultaHQL_c(session);
		consultaHQL_d(session, "2015-07-01", "2015-12-31");
		consultaHQL_e(session);
		consultaHQL_f(session);
		consultaHQL_g(session, "Leuchtturm");
		consultaHQL_h(session);
		consultaHQL_i(session, "Aleman");
		
		session.close();

	}

	/**
	 * a) Listar los nombres de	todos los documentos
	 * @param session
	 */
	
	public static void consultaHQL_a(Session session) {
		Query query = session.createQuery("SELECT D.nombre FROM Documento D");
	
		tx = session.beginTransaction();
		List<String> documentos = query.list();
		tx.commit();
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n a) Listar los nombres de todos los documentos. \n");
		
		for (String d : documentos) {
			System.out.println("Documento: " + d + "\n");
		}
		System.out.println("\n");
	}	
	
	
	/**
	 * b) Listar los emails	de los moderadores que hayan evaluado traducciones al inglés.	
	 * @param session
	 */
	
	public static void consultaHQL_b(Session session, String nombreIdioma) {
		
		Query query = session.createQuery("SELECT DISTINCT m.email FROM Moderador m WHERE :nombre_idioma in (SELECT e.traduccion.idioma.nombre FROM m.evaluaciones e)");		
     	query.setParameter("nombre_idioma", nombreIdioma);

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n b) Listar los emails de los moderadores que hayan evaluado traducciones al inglés. \n\n");
		
		tx = session.beginTransaction();
     	List<String> moderadores = query.list();
     	tx.commit();
     	
		for (String email : moderadores) {
			System.out.println("Email: " + email + "\n");
		}
	}


	/**
	 * c) Listar los usuarios que hayan	iniciado una cursada de	Francés	de nivel 3 como mínimo.	
	 * @param session
	 */	
	
	public static void consultaHQL_c(Session session) {
		

		Query query = session.createQuery("SELECT DISTINCT usr FROM Usuario usr JOIN usr.cursadasRealizadas c WHERE c.curso.idioma.nombre = 'Frances' AND c.curso.nivel >= 3");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n c) Listar los usuarios que hayan iniciado una cursada de Frances de nivel 3 como minimo \n");

		tx = session.beginTransaction();
		List<Usuario> usuarios = query.list();
		tx.commit();
		
		for (Usuario usr : usuarios) {
			System.out.println("Nombre: " + usr.getNombre() + "\n");
		}
		System.out.println("\n");
	}
	
	
	/**
	 * d) Listar moderadores que hayan revisado	alguna traducción entre dos fechas pasadas como argumento.		
	 * @param session
	 */		
	
	public static void consultaHQL_d(Session session, String fechaDesde, String fechaHasta) {
	
		Query query = session.createQuery("SELECT distinct m FROM Moderador m JOIN m.evaluaciones e WHERE (e.traduccion.fecha BETWEEN :fecha_desde AND :fecha_hasta)");
		query.setString("fecha_desde", fechaDesde);
		query.setString("fecha_hasta", fechaHasta);

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n d) Listar moderadores que hayan revisado alguna traducción entre dos fechas pasadas como argumento. \n\n");

		tx = session.beginTransaction();
		List<Moderador> moderadores_entre_fechas = query.list();
		tx.commit();
		
		for (Moderador m : moderadores_entre_fechas) {
			System.out.println("Nombre: "+m.getNombre()+"\n");
		}
	}
	
	
	
	/**
	 * e) Listar traducciones completas	del	Inglés al Francés.		
	 * @param session
	 */		
	
	public static void consultaHQL_e(Session session) {
		
		Query query = session.createQuery("FROM Traduccion t where t.idioma.nombre = 'Frances' and t.parrafo.documento.idioma.nombre = 'Ingles'");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n E) Listar traducciones	completas del Inglés al	Francés. \n\n");
		
		tx = session.beginTransaction();
		List<Traduccion> traducciones = query.list();
		tx.commit();
		
		for (Traduccion t : traducciones) {
			System.out.println("Nombre: " + t.getDescripcion() + "\n");
		}
		System.out.println("\n");
	}

	
	
	/**
	 * f) Obtener los emails de	los	usuarios con alguna	cursada	aprobada.			
	 * @param session
	 */	
	
	public static void consultaHQL_f(Session session) {
		
		Query query = session.createQuery("SELECT distinct u.email FROM Usuario u WHERE u in ("
											+ "SELECT c.usuario FROM Cursada c JOIN c.pruebas p "
											+ "WHERE p.puntaje >= 60 AND c.usuario = u "
											+ "GROUP BY c.curso "
											+ "HAVING count(p) = (SELECT cur.lecciones.size FROM Curso cur WHERE cur = c.curso)"
				                            + ")");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n F) Obtener los emails de los usuarios con alguna cursada aprobada. \n\n");
		
		tx = session.beginTransaction();
		List<String> emails = query.list();
		tx.commit();
		
		for (String email : emails) {
			System.out.println("Usuario con cursada aprobada: "+ email +"\n");
		}
		System.out.println("\n");
	}	
	
	
	
	/**
	 * g) Obtener los nombres de los documentos	que	no tengan ningún párrafo traducido (en ningún idioma).			
	 * @param session
	 */		
	
	public static void consultaHQL_g(Session session, String palabra) {
		
		Query query = session.createQuery("select distinct d from Diccionario d join d.definiciones def where index(def) = :palabra");
		query.setString("palabra", palabra);

		System.out.println("----------------------------------------------------------------------------------------");		
		System.out.println("\n\n g) Obtener el idioma que define la palabra enviada como parámetro en su diccionario. \n\n");
		
		tx = session.beginTransaction();
		List<Diccionario> diccionarios = query.list();
		tx.commit();
		
		for (Diccionario d : diccionarios) {
			System.out.println("El idioma "+d.getIdioma().getNombre()+" define la palabra "+palabra+"\n");
		}
		
		System.out.println("\n");
	}	
	
	
	
	/**
	 * h) Obtener los nombres de los documentos	que	no tengan ningún párrafo traducido (en ningún idioma).			
	 * @param session
	 */		
	
	public static void consultaHQL_h(Session session) {
		
		Query query = session.createQuery("SELECT d.nombre FROM Documento d WHERE d not in (SELECT doc FROM Documento doc JOIN doc.parrafos p WHERE p in (SELECT t.parrafo FROM Traduccion t))");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n h) Obtener los nombres de los documentos que no tengan ningún párrafo traducido (en ningun idioma). \n\n");
		
		tx = session.beginTransaction();
		List<String> nombres = query.list();
		tx.commit();
		
		for (String n : nombres) {
			System.out.println("El documento "+ n +" no tiene ninguna traducción\n");
		}
	}	
	
		
	/**
	 * i) Obtener los nombres de los documentos	que	tengan	párrafos sin traducir al idioma	de nombre enviado como parámetro.				
	 * @param session
	 */			
	
	public static void consultaHQL_i(Session session, String nombreIdioma) {

		Query query = session.createQuery("SELECT distinct d.nombre FROM Documento d JOIN d.parrafos p WHERE p not in ("
												+ "SELECT t.parrafo FROM Traduccion t WHERE t.idioma.nombre = :nombre_idioma)");
		query.setString("nombre_idioma", nombreIdioma);

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n i) Obtener los nombres de los documentos que tengan párrafos sin traducir al idioma de nombre enviado como parámetro. \n\n");		
	
		tx = session.beginTransaction();
		List<String> nombres = query.list();
		tx.commit();
		
		for (String nombre : nombres) {
			System.out.println("El documento "+ nombre +" no está totalmente traducido. \n");
		}
	}

}