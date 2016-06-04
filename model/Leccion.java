/**
 * Leccion.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

public class Leccion {
	// Attributes
	private String nombre;
	
	/**
	 * Constructor de la clase Leccion
	 * @param nombre
	 */
	public Leccion(String nombre) {
		super();
		this.setNombre(nombre);
	}


	// Accesors
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}	
}
