/**
 * Tarea.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

import java.util.Date;

/**
 * Esta es la clase Abstracta Tarea de las subclases Evaluacion y Traduccion
 * 
 * @author Grupo10
 *
 */
public abstract class Tarea {
	
	/*
	 * Variable de instancia idTarea
	 * Identificador de tarea
	 */		
	private long idTarea;
	
	/**
	 * Variable de instancia fecha
	 */
	protected Date fecha;
	
	/**
	 * Variable de instancia descripcion
	 */
	protected String descripcion;
	
	/**
	 * Variable de instancia completa
	 */
	protected Boolean completa;
	
	
	/**
	 * Método para recuperar la fecha del objeto tarea
	 * @return Date
	 */
	public Date getFecha() {
		return fecha;
	}
	
	/**
	 * Método para setear la fecha al objeto tarea
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * Método para recuperar la descripcion del objeto tarea
	 * @return String
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Método para setear una descripcion al objeto tarea
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Método booleano para completar la tarea, la cual por defecto esta en false
	 */
	public void completar() {
		this.completa = true;
	}
	
	/**
	 * Método booleano que retorna true o false dependiendo de si el objeto tarea esta completo o no
	 * @return Boolean
	 */
	public Boolean getCompleta() {
		return completa;
	}
	/**
	 * Método booleano que pone en true o false para indicar si el objeto tarea esta completo o no
	 * @param completa
	 */
	public void setCompleta(Boolean completa) {
		this.completa = completa;
	}

	public long getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(long idTarea) {
		this.idTarea = idTarea;
	}
	
}