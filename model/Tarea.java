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
 * @author barra
 *
 */
public abstract class Tarea {
	
	private Date fecha;
	private String descripcion;
	private Boolean completa;
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void completar() {
		this.completa = true;
	}
	
	public Boolean getCompleta() {
		return completa;
	}
	
	public void setCompleta(Boolean completa) {
		this.completa = completa;
	}

}
