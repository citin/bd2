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
	
	private Integer puntaje;
	private Traduccion traduccion;
	
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
	}
	
	
	public int getPuntaje() {
		return this.puntaje;
	}
	
	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}
	
	public Traduccion getTraduccion() {
		return traduccion;
	}
	
	public void setTraduccion(Traduccion traduccion) {
		this.traduccion = traduccion;
	}
	
}