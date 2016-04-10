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
	
	// Attributes
	private String nombre; 				  // Nombre del documento
	private Integer complejidad; 		  // Nivel de complejidad del documento
	private Idioma idioma; 				  // Idioma que entiende el Documento
	private Collection<Parrafo> parrafos; // Colección de Parrafos
	
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
	} //Cierre del constructor
	
	// Método para recupera el nombre del objeto documento
	public String getNombre() {
		return nombre;
	}
	
	// Método para setear un nombre al objeto documento
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Método para recupera la complejidad del objeto documento
	public Integer getComplejidad() {
		return complejidad;
	}
	
	// Método para setear una complejidad al objeto documento
	public void setComplejidad(Integer complejidad) {
		this.complejidad = complejidad;
	}
	
	// Método para recuperar el Idioma del objeto documento
	public Idioma getIdioma() {
		return idioma;
	}
	
	// Método para setear un Idioma al objeto documento
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	// Método para agregar un objeto Parrafo a la coleccion de parrafos del objeto documento
	public Parrafo agregarParrafo(String p){
		Parrafo nuevoParrafo = new Parrafo(p, this);
		this.parrafos.add(nuevoParrafo);
		return nuevoParrafo;
	}
	
	// Método para recuperar la colección de parrafos
	public Collection<Parrafo> getParrafos(){
		return this.parrafos;
	}
}
