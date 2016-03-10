package bd2.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import bd2.model.*;

public class DBLoader {

	private static SessionFactory sessions;
		
	public DBLoader() { }

	public static void main(String[] args) {
		try {
			System.out.println("----------------------- Setting up Hibernate -----------------------");
			Configuration cfg = new Configuration();
			cfg.configure("hibernate/hibernate.cfg.xml");

			System.out.println("Droping schema.........");
			new SchemaExport(cfg).drop(true, true);
			System.out.println("DONE.");

			System.out.println("Generating schema.........");
			new SchemaExport(cfg).create(true, true);
			System.out.println("DONE.");

			System.out.println("Building sessions.........");
			sessions = cfg.buildSessionFactory();
			Sitio sitio = cargarBase();
			
			Session session = sessions.openSession();
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.save(sitio);
				session.flush();
				tx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (tx != null) {
					tx.rollback();
				}
				session.close();
			}
			session.disconnect();
			
			System.out.println("DONE.");
		} catch (Exception e) {
			System.out.println("------------------------FAIL.------------------------");
			e.printStackTrace();
		}
	}

	private static Sitio cargarBase() throws Exception {
		Idioma sueco, ingles;
		Documento manualIkea;
		Parrafo manualIkeaIntro;
		Traduccion suecoAIngles;
		Curso cursoInglesBasico;
		Leccion vocabularioBasico, articuloDeterminado, presentePerfecto;
		Prueba vocabularioBasicoDesaprobada, articuloDeterminadoAprobado;
		Cursada nuevaCursada;
		
		Date hoy;
		Calendar cal = Calendar.getInstance();
		hoy = cal.getTime();
		
		Usuario sven = new Usuario("sven@knudsen.net", "Sven", hoy);
		Moderador pablo = new Moderador("pablo@polyglot.com", "Pablo", hoy);
		
		sueco = new Idioma("Sueco");
		ingles = new Idioma("Inglés");
		manualIkea = new Documento("Manual de Ikea", sueco);
		manualIkeaIntro =  manualIkea.agregarParrafo("Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Nullam quis risus eget urna mollis ornare vel eu leo. Integer posuere erat a ante venenatis dapibus posuere velit aliquet. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.");
		suecoAIngles = new Traduccion(hoy, "Sueco a Inglés", true, "Furniture is good", manualIkeaIntro, ingles);
		sven.agregarTraduccion(suecoAIngles);
		
		ingles.getDiccionario().agregarDefinicion("cat", "Feline domestic creature");
		Documento algoritmos = new Documento("Algoritmos",ingles);
		
		
		cursoInglesBasico = new Curso("Introducción al ingles", ingles, 1);

		vocabularioBasico = new Leccion("Vocabulario 1");
		articuloDeterminado = new Leccion("Articulo determinado");
		presentePerfecto = new Leccion("Presente Perfecto");

		cursoInglesBasico.agregarLeccion(vocabularioBasico);
		cursoInglesBasico.agregarLeccion(articuloDeterminado);
		
		vocabularioBasicoDesaprobada = new Prueba(vocabularioBasico, 30);
		articuloDeterminadoAprobado = new Prueba(articuloDeterminado, 90);
		nuevaCursada = new Cursada(cursoInglesBasico, hoy, sven);
		nuevaCursada.agregarPrueba(articuloDeterminadoAprobado);
		nuevaCursada.agregarPrueba(vocabularioBasicoDesaprobada);
		

		pablo.agregarIdioma(ingles);
		pablo.agregarIdioma(sueco);
		pablo.evaluar(suecoAIngles, "Bien", 8);		
		Sitio sitio = new Sitio();
		sitio.agregarDocumento(algoritmos);
		sitio.agregarDocumento(manualIkea);
		sitio.registrarUsuario(sven);
		sitio.registrarUsuario(pablo);
		sitio.agregarCurso(cursoInglesBasico);

		return sitio;
		
	}

}