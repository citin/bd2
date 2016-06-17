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
		consultaHQL_e(session);
		consultaHQL_f(session);
		consultaHQL_g(session,"Leuchtturm");
		consultaHQL_h(session);
		consultaHQL_i(session);
		
		session.close();

	}

	
	public static void consultaHQL_b(Session session) {
		tx = session.beginTransaction();
		
     	Query query = session.createQuery("SELECT distinct m FROM Moderador m JOIN m.evaluaciones e WHERE e.traduccion.idioma.nombre = 'ingles'");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n b) Listar los emails de los moderadores que hayan evaluado traducciones al inglés. \n\n");
     	List<Moderador> moderadores = query.list();
		for (Moderador m : moderadores) {
			System.out.println("Email: " + m.getEmail() + "\n");
		}
		tx.commit();
	}


	public static void consultaHQL_a(Session session) {

	tx = session.beginTransaction();

	Query query = session.createQuery("FROM Documento");

	List<Documento> documentos = query.list();
	
	System.out.println("----------------------------------------------------------------------------------------");
	System.out.println("\n a) Listar los nombres de todos los documentos. \n");
	
	for (Documento d : documentos) {
		System.out.println("Documento: " + d.getNombre() + "\n");
	}
	System.out.println("\n");


	tx.commit();
	}
	
	public static void consultaHQL_c(Session session) {

		tx = session.beginTransaction();

		Query query = session.createQuery("SELECT DISTINCT usr FROM Usuario usr JOIN usr.cursadasRealizadas c WHERE c.curso.idioma.nombre = 'Frances' AND c.curso.nivel >= 3");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n a) Listar los usuarios que hayan iniciado una cursada de Frances de nivel 3 como minimo \n");

		List<Usuario> usuarios = query.list();		
		for (Usuario usr : usuarios) {
			System.out.println("Nombre: " + usr.getNombre() + "\n");
		}
		System.out.println("\n");


		tx.commit();
		}
	
	public static void consultaHQL_d(Session session) {
		tx = session.beginTransaction();

		Query query = session.createQuery("SELECT distinct m FROM Moderador m JOIN m.evaluaciones e WHERE (e.traduccion.fecha BETWEEN :fecha_desde AND :fecha_hasta)");
		query.setString("fecha_desde","2015-07-01");
		query.setString("fecha_hasta","2015-12-31");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n d) Listar moderadores que hayan revisado alguna traducción entre dos fechas pasadas como argumento. \n\n");

		List<Moderador> moderadores_entre_fechas = query.list();
		for (Moderador m : moderadores_entre_fechas) {
			System.out.println("Nombre: "+m.getNombre()+"\n");
		}
		tx.commit();
	}
	
	public static void consultaHQL_e(Session session) {
		tx = session.beginTransaction();
		Query query = session.createQuery("FROM Traduccion t where t.idioma.nombre = 'Frances' and t.parrafo.documento.idioma.nombre = 'Ingles'");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n E) Listar traducciones	completas del Inglés al	Francés. \n\n");
		
		List<Tarea> tareas = query.list();
		for (Tarea t : tareas) {
			System.out.println("Nombre: " + t.getDescripcion() + "\n");
		}
		System.out.println("\n");
		tx.commit();
	}

	public static void consultaHQL_h(Session session) {
		tx = session.beginTransaction();
		Query query = session.createQuery("FROM Documento d WHERE d not in (SELECT doc FROM Documento doc JOIN doc.parrafos p WHERE p in (SELECT t.parrafo FROM Traduccion t))");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n h) Obtener los nombres de los documentos que no tengan ningún párrafo traducido (en ningun idioma). \n\n");
		
		List<Documento> documentos_sin_traduccion = query.list();
		for (Documento d : documentos_sin_traduccion) {
			System.out.println("El documento "+d.getNombre()+" no tiene ninguna traducción\n");
		}
		tx.commit();
	}	
	
	public static void consultaHQL_f(Session session) {
		tx = session.beginTransaction();
		Query query = session.createQuery("SELECT distinct u FROM Usuario u WHERE u in ("
											+ "SELECT c.usuario FROM Cursada c JOIN c.pruebas p "
											+ "WHERE p.puntaje >= 60 AND c.usuario = u "
											+ "GROUP BY c.curso "
											+ "HAVING count(p) = (SELECT cur.lecciones.size FROM Curso cur WHERE cur = c.curso)"
				                            + ")");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n F) Obtener los emails de los usuarios con alguna cursada aprobada. \n\n");
		
		List<Usuario> usuarios_con_cursada_aprobada = query.list();
		for (Usuario u : usuarios_con_cursada_aprobada) {
			System.out.println("Usuario con cursada aprobada: "+u.getEmail()+"\n");
		}
		System.out.println("\n");
		tx.commit();
	}
	
	public static void consultaHQL_i(Session session) {
		tx = session.beginTransaction();

		String nombreIdioma = "Aleman";
		Query query = session.createQuery("SELECT distinct d FROM Documento d JOIN d.parrafos p WHERE p not in ("
												+ "SELECT t.parrafo FROM Traduccion t WHERE t.idioma.nombre = :nombre_idioma)");
		query.setString("nombre_idioma", nombreIdioma);

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\n\n i) Obtener los nombres de los documentos que tengan párrafos sin traducir al idioma de nombre enviado como parámetro. \n\n");		
	
		List<Documento> documentos_item_i = query.list();
		for (Documento d : documentos_item_i) {
			System.out.println("El documento "+d.getNombre()+" no está totalmente traducido. \n");
		}
		tx.commit();
	}
	
	public static void consultaHQL_g(Session session, String palabra) {
		
		Query query = session.createQuery("select distinct d from Diccionario d join d.definiciones def where index(def) = :palabra");
		query.setString("palabra", palabra);

		System.out.println("----------------------------------------------------------------------------------------");		
		System.out.println("\n\n g) Obtener el idioma que define la palabra enviada como parámetro en su diccionario\n");
		
		List<Diccionario> diccionarios = query.list();
		for (Diccionario d : diccionarios) {
			System.out.println("El idioma "+d.getIdioma().getNombre()+" define la palabra "+palabra+"\n");
		}
		
		System.out.println("\n");

	}
	
}