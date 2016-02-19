/**
 * 
 */
package bd2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bd2
 *
 */
public class Diccionario {

	protected Map<String, String> definiciones = new HashMap<String, String>();
	protected Idioma idioma;
	protected String edicion;

	/**
	 * 
	 */
	public Diccionario(Idioma idioma) {
		this.idioma = idioma;
	}

	public Map<String, String> getDefiniciones() {
		return definiciones;
	}

	public void setDefiniciones(Map<String, String> definiciones) {
		this.definiciones = definiciones;
	}
	
	public void agregarDefinicion(String palabra, String significado){
		this.getDefiniciones().put(palabra, significado);
	}
	
	public String definicion(String palabra){
		return this.getDefiniciones().get(palabra);
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

}
