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
	
	private Map<String, String> definiciones;
	private String edicion;
	private Idioma idioma;

	/**
	 * Constructor de la clade Idioma
	 * 
	 * @param nuevoIdioma
	 * @param nuevaEdicion
	 */
	
	public Diccionario(Idioma nuevoIdioma, String nuevaEdicion){
		this.setIdioma(nuevoIdioma);
		this.setEdicion(nuevaEdicion);
		this.setDefiniciones(new Hashtable<String, String>());
	}
	
	public Map<String, String> getDefiniciones() {
		return definiciones;
	}
	public void setDefiniciones(Map<String, String> definiciones) {
		this.definiciones = definiciones;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	public void agregarDefinicion(String def1, String def2){
		definiciones.put(def1, def2);
	}
	
	public String definicion(String str){
		return (String) this.definiciones.get(str);
	}
}
