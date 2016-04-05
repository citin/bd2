/**
 * Documento.java
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
public class Documento {
	
	private String nombre;
	private Integer complejidad;
	private Idioma idioma;
	private Collection<Parrafo> parrafos;
	
	/**
	 * Constructor de la clase Documento
	 * 
	 * @param nuevoNombre
	 * @param nuevoIdioma
	 */
	
	public Documento(String nuevoNombre, Idioma nuevoIdioma){
		this.nombre = nuevoNombre;
		this.complejidad = 0;		
		this.idioma = nuevoIdioma;
		this.parrafos = new ArrayList<Parrafo>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getComplejidad() {
		return complejidad;
	}
	public void setComplejidad(Integer complejidad) {
		this.complejidad = complejidad;
	}
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	public Parrafo agregarParrafo(String p){
		Parrafo nuevoParrafo = new Parrafo(p, this);
		this.parrafos.add(nuevoParrafo);
		return nuevoParrafo;
	}
	
	public Collection<Parrafo> getParrafos(){
		return this.parrafos;
	}
}
