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
	private String observacion;
	
	/**
	 * Constructor de la clase Evaluacion
	 * 
	 * @param fecha
	 * @param observacion
	 * @param completa
	 * @param traduccion
	 * @param puntaje
	 */
	
	public Evaluacion(Date fecha, String observacion, Boolean completa, Traduccion traduccion, Integer puntaje){
		this.setFecha(fecha);
		this.observacion = observacion;		
		this.setTraduccion(traduccion);
		this.setCompleta(completa);
		this.puntaje = puntaje;
	}
	
	
	public Integer getPuntaje() {
		return puntaje;
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


	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
}
