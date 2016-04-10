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
 * @author Grupo10
 *
 */
public abstract class Tarea {
	
	// Attributes
	protected Date fecha; 			// Fecha de la Tarea
	protected String descripcion;   // Descripcion de la Tarea
	protected Boolean completa;     // Booleano que indica si la tarea esta completa o no
	
	
	// Método para recuperar la fecha del objeto tarea
	public Date getFecha() {
		return fecha;
	}
	
	// Método para setear la fecha al objeto tarea
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	// Método para recuperar la descripcion del objeto tarea
	public String getDescripcion() {
		return descripcion;
	}
	
	// Método para setear una descripcion al objeto tarea
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	// Método booleano para completar la tarea, la cual por defecto esta en false
	public void completar() {
		this.completa = true;
	}
	
	// Método booleano que retorna true o false dependiendo de si el objeto tarea esta completo o no
	public Boolean getCompleta() {
		return completa;
	}
	
	// Método booleano que pone en true o false para indicar si el objeto tarea esta completo o no
	public void setCompleta(Boolean completa) {
		this.completa = completa;
	}

}