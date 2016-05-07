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
 * Esta es la clase Diccionario que se utiliza para mantener una collecion de palabras
 * para un determinado idioma y para un numero de edicion X.
 * 
 * @author Grupo10
 *
 */
public class Diccionario {
	
	/**
	 * Variable de instancia idDiccionario
	 */
	private Long idDiccionario;
	
	/**
	 * Variable de instancia edicion
	 */
	private String edicion;
	
	/**
	 * Variable de instancia idioma
	 */
	private Idioma idioma;
	
	/**
	 * Variable de instancia definiciones
	 */
	private Map<String, String> definiciones;
	
	/**
	 * Constructor por defecto para la clase Diccionario.
	 */
	public Diccionario(){
		
	}
	
	/**
	 * Constructor con argumentos de la clase Diccionario
	 * 
	 * @param nuevoIdioma
	 * @param nuevaEdicion
	 */
	
	public Diccionario(Idioma nuevoIdioma, String nuevaEdicion){
		this.setIdioma(nuevoIdioma);
		this.setEdicion(nuevaEdicion);
		this.setDefiniciones(new Hashtable<String, String>());
	} 
	
	/**
	 * Método para recuperar la edición del objeto diccionario
	 * @return String
	 */
	public String getEdicion() {
		return edicion;
	}
	
	/**
	 * Método para setear la edición del objeto diccionario
	 * @param edicion
	 */
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	/**
	 * Método para obtener el idioma del objeto diccionario
	 * @return
	 */
	public Idioma getIdioma() {
		return idioma;
	}
	
	/**
	 * Método para setear el idioma del objeto diccionario
	 * @param idioma
	 */
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	/**
	 * Método para recupera una definicion
	 * @param str
	 * @return String
	 */
	public String definicion(String str){
		return (String) this.definiciones.get(str);
	}
	
	/**
	 * Método para obtener la collection de objetos definiciones
	 * @return Map
	 */
	public Map<String, String> getDefiniciones() {
		return definiciones;
	}
	
	/**
	 * Metodo para setear una nueva collection de objetos definiciones
	 * @param definiciones
	 */
	public void setDefiniciones(Map<String, String> definiciones) {
		this.definiciones = definiciones;
	}
	
	/**
	 * Método para agregar un nuevo objeto definicion a la collection
	 * @param def1
	 * @param def2
	 */
	public void agregarDefinicion(String def1, String def2){
		definiciones.put(def1, def2);
	}
}
