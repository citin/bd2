/**
 * Idioma.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

/**
 * @author Grupo10
 *
 */
public class Idioma {
	
	private String nombre;
	private Diccionario diccionario;
	
	/**
	 * Constructoir de la clase idioma
	 * 
	 * @param nombre
	 */
	
	public Idioma(String nombre){
		this.nombre = nombre;
		this.diccionario = new Diccionario(this, "Edicion 1");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Diccionario getDiccionario() {
		return diccionario;
	}
	public void setDiccionario(Diccionario diccionario) {
		this.diccionario = diccionario;
	}
}
