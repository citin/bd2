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
<<<<<<< HEAD
=======
	private String observacion;
>>>>>>> 7917cbd4af1bec742e5adb469af8fc787d80135a
	
	/**
	 * Constructor de la clase Evaluacion
	 * 
	 * @param fecha
<<<<<<< HEAD
	 * @param descripcion
=======
	 * @param observacion
>>>>>>> 7917cbd4af1bec742e5adb469af8fc787d80135a
	 * @param completa
	 * @param traduccion
	 * @param puntaje
	 */
	
<<<<<<< HEAD
	public Evaluacion(Date fecha, String descripcion, Boolean completa, Traduccion traduccion, Integer puntaje){
		this.setFecha(fecha);
		this.setDescripcion(descripcion);		
		this.setTraduccion(traduccion);
		this.setCompleta(completa);
		this.setPuntaje(puntaje);
	}
	
	
	public int getPuntaje() {
		return this.puntaje;
=======
	public Evaluacion(Date fecha, String observacion, Boolean completa, Traduccion traduccion, Integer puntaje){
		this.setFecha(fecha);
		this.observacion = observacion;		
		this.setTraduccion(traduccion);
		this.setCompleta(completa);
		this.puntaje = puntaje;
	}
	
	
	public Integer getPuntaje() {
		return puntaje;
>>>>>>> 7917cbd4af1bec742e5adb469af8fc787d80135a
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
<<<<<<< HEAD
=======


	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
>>>>>>> 7917cbd4af1bec742e5adb469af8fc787d80135a
	
}
