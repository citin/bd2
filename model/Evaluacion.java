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
 * La clase Evaludacion se utiliza para instanciar a los objetos evaluacion
 * @author Grupo10
 *
 */
public class Evaluacion extends Tarea {
	
	/**
	 * Puntaje
	 */
	private Integer puntaje;
	/**
	 * traduccion
	 */
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
	
	/**
	 * Método para recuperar el puntaje del objeto evaluacion
	 * @return int
	 */
	public int getPuntaje() {
		return this.puntaje;
	}
	
	/**
	 * Método para setear un puntaje al objeto evaluacion
	 * @param puntaje
	 */
	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}
	
	/**
	 * Método para recuperar la traduccion del objeto evaluacion
	 * @return Traduccion
	 */
	public Traduccion getTraduccion() {
		return traduccion;
	}
	
	/**
	 * Método para setear un objeto traduccion al objeto evaluacion
	 * @param traduccion
	 */
	public void setTraduccion(Traduccion traduccion) {
		this.traduccion = traduccion;
	}
	
}