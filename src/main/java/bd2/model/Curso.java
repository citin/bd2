/**
 * Curso.java
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
	
	// Attributes
	private long idCurso;
	private String nombre;
	private Integer nivel;
	private Collection<Leccion> lecciones;
	private Idioma idioma;


	/**
	 * Constructor por defecto para la clase Curso.
	 */
	public Curso(){
		this.setLecciones( new ArrayList<Leccion>());
	}
	
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
		this.setNombre(nombre);
		this.setNivel(nivel);
		this.setIdioma(idioma);
		this.setLecciones( new ArrayList<Leccion>());
	}
	
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
	public long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}
	
	// Methods
	/**
	 * Agrega una leccion al curso.
	 * @param lec
	 */
	public void agregarLeccion(Leccion lec){
		this.lecciones.add(lec);
	}
}
