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
	
	/**
	 * Variable de instancia idDocumento. 
	 */
	
	private Long idDocumento;
	
	/**
	 * Variable de instancia nombre. 
	 * Nombre del documento
	 */
	private String nombre; 
	
	/**
	 * Variable de instancia complejidad.
	 * Nivel de complejidad del documento
	 */
	private Integer complejidad;
	
	/**
	 * Variable de instancia idioma
	 * Idioma que entiende el Documento
	 */
	private Idioma idioma;
	
	/**
	 * Variable de instancia parrafos
	 * Colección de objeros parrafos
	 */
	private Collection<Parrafo> parrafos;
	
	/**
	 * Constructor por defecto para la clase Documento.
	 */
	public Documento(){
		
	}
	
	/**
	 * Constructor con argumentos para la clase Documento
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
	
	/**
	 * Método para recupera el nombre del objeto documento
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método para setear un nombre al objeto documento
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método para recupera la complejidad del objeto documento
	 * @return Integer
	 */
	public Integer getComplejidad() {
		return complejidad;
	}
	
	/**
	 * Método para setear una complejidad al objeto documento
	 * @param complejidad
	 */
	public void setComplejidad(Integer complejidad) {
		this.complejidad = complejidad;
	}
	
	/**
	 * Método para recuperar el Idioma del objeto documento
	 * @return Idioma
	 */
	public Idioma getIdioma() {
		return idioma;
	}
	
	/**
	 * Método para setear un Idioma al objeto documento
	 * @param idioma
	 */
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	/**
	 * Método para agregar un objeto Parrafo a la coleccion de parrafos del objeto documento
	 * @param p
	 * @return Parrafo
	 */
	public Parrafo agregarParrafo(String p){
		Parrafo nuevoParrafo = new Parrafo(p, this);
		this.parrafos.add(nuevoParrafo);
		return nuevoParrafo;
	}
	
	/**
	 * Metodo que retorna la collecion de parrafos
	 * @return Collection
	 */
	public Collection<Parrafo> getParrafos(){
		return this.parrafos;
	}
}
