/**
 * Evaluacion.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Grupo10
 *
 */
public class Curso {
	/**
	 * Constructor de la clase Curso
	 * 
	 * @param nombre
	 * @param idioma
	 * @param nivel
	 */
	// new Curso("Introducción al ingles", ingles, 1);
	public Curso(String nombre, Idioma idioma, Integer nivel) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.idioma = idioma;
		this.lecciones = new ArrayList<Leccion>();
	}

	// Attributes
	private String nombre;
	private Integer nivel;
	private Collection<Leccion> lecciones;
	private Idioma idioma;
	
	// Accesors
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Collection<Leccion> getLecciones() {
		return lecciones;
	}
	public void setLecciones(Collection<Leccion> lecciones) {
		this.lecciones = lecciones;
	}
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	// Methods
	public void agregarLeccion(Leccion lec){
		this.lecciones.add(lec);
	}
}
