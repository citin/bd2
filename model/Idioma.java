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
	
	// Attributes
	private String nombre;
	private Diccionario diccionario;
	
	/**
	 * Constructoir de la clase idioma
	 * 
	 * @param nombre
	 */
	
	public Idioma(String nombre){
		this.setNombre(nombre);
		this.setDiccionario(new Diccionario(this, "Edicion 1"));
	}
	
	// Accesors
	
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
