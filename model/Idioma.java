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
	private String nombre;  // Nombre del Idioma
	private Diccionario diccionario;
	
	/**
	 * Constructoir de la clase idioma
	 * 
	 * @param nombre 
	 */
	
	public Idioma(String nombre){
		this.setNombre(nombre);  
		this.setDiccionario(new Diccionario(this, "Edicion 1")); // Por defecto se inicializa en la Edicion 1
	} //Cierre del constructor
	
	// Método para recuperar el nombre del objeto idioma	
	public String getNombre() {
		return nombre;
	}
	
	// Método para setear un nombre al objeto idioma	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Método para recuperar el diccionario del objeto idioma	
	public Diccionario getDiccionario() {
		return diccionario;
	}
	
	// Método para setear un diccionario al objeto idioma	
	public void setDiccionario(Diccionario diccionario) {
		this.diccionario = diccionario;
	}
}
