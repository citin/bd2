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

	/**
	 * Variable de instancia idLeccion
	 */
	private long idLeccion;

	/**
	 * Variable de instancia nombre
	 */
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

	/**
	 * Método para setear el nombre de la leccion
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el nombre de la leccion
	 */
	public String getNombre() {
		return nombre;
	}	
	
	/**
	 * Método para obtener el id el nombre de la leccion
	 */
	public long getIdLeccion() {
		return idLeccion;
	}

	/**
	 * Método para setear el id de la leccion
	 * @param idLeccion
	 */
	public void setIdLeccion(long idLeccion) {
		this.idLeccion = idLeccion;
	}

}
