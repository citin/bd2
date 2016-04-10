/**
 * Diccionario.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Grupo10
 *
 */
public class Diccionario {
	
	// Attributes
	private String edicion; 				  // Edicion del diccionario
	private Idioma idioma;  				  // Idioma que entiende el Diccionario
	private Map<String, String> definiciones; // Colleción de definiciones que pertenece al Diccionario
	
	/**
	 * Constructor de la clase Diccionario
	 * 
	 * @param nuevoIdioma
	 * @param nuevaEdicion
	 */
	
	public Diccionario(Idioma nuevoIdioma, String nuevaEdicion){
		this.setIdioma(nuevoIdioma);
		this.setEdicion(nuevaEdicion);
		this.setDefiniciones(new Hashtable<String, String>());
	} //Cierre del constructor
	
	// Método para recuperar la edición del objeto diccionario
	public String getEdicion() {
		return edicion;
	}
	
	// Método para setear la edición del objeto diccionario
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	// Método para obtener el idioma del objeto diccionario
	public Idioma getIdioma() {
		return idioma;
	}
	
	// Método para setear el idioma del objeto diccionario
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	// Método para recupera una definicion
	public String definicion(String str){
		return (String) this.definiciones.get(str);
	}
	
	// Método para obtener la collection de objetos definiciones
	public Map<String, String> getDefiniciones() {
		return definiciones;
	}
	
	// Metodo para setear una nueva collection de objetos definiciones
	public void setDefiniciones(Map<String, String> definiciones) {
		this.definiciones = definiciones;
	}
	
	// Método para agregar un nuevo objeto definicion a la collection
	public void agregarDefinicion(String def1, String def2){
		definiciones.put(def1, def2);
	}
}
