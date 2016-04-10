/**
 * Evaluacion.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

import java.util.Date;

/**
 * @author Grupo10
 *
 */
public class Evaluacion extends Tarea {
	
	// Attributes
	private Integer puntaje;       // puntaje de la evalución
	private Traduccion traduccion; // traducción de la evaluación
	
	/**
	 * Constructor de la clase Evaluacion
	 * 
	 * @param fecha
	 * @param descripcion
	 * @param completa
	 * @param traduccion
	 * @param puntaje 
	 */
	
	public Evaluacion(Date fecha, String descripcion, Boolean completa, Traduccion traduccion, Integer puntaje){
		this.setFecha(fecha);
		this.setDescripcion(descripcion);		
		this.setTraduccion(traduccion);
		this.setCompleta(completa);
		this.setPuntaje(puntaje);
	} //Cierre del constructor
	
	// Método para recuperar el puntaje del objeto evaluacion
	public int getPuntaje() {
		return this.puntaje;
	}
	
	// Método para setear un puntaje al objeto evaluacion
	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}
	
	// Método para recuperar la traduccion del objeto evaluacion
	public Traduccion getTraduccion() {
		return traduccion;
	}
	
	// Método para setear un objeto traduccion al objeto evaluacion
	public void setTraduccion(Traduccion traduccion) {
		this.traduccion = traduccion;
	}
	
}