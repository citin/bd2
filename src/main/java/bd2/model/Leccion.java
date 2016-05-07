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
	private long idLeccion;
	private String nombre;

	/**
	 * Constructor por defecto para la clase Leccion.
	 */
	public Leccion(){
		
	}
	
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
	
	public long getIdLeccion() {
		return idLeccion;
	}

	public void setIdLeccion(long idLeccion) {
		this.idLeccion = idLeccion;
	}

}
