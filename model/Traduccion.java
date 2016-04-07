/**
 * Traduccion.java
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

public class Traduccion extends Tarea {
	
	private Date fecha;
	private String descripcion;
	private Boolean completa;
	private String texto;
	private Idioma idioma;
	private Parrafo parrafo;
	
	/**
	 * Constructor de la clase Traduccion
	 * 
	 * @param fecha
	 * @param descripcion
	 * @param completa
	 * @param texto
	 * @param parrafo
	 * @param idioma
	 */
	
	public Traduccion(Date fecha, String descripcion, Boolean completa, String texto, Parrafo parrafo, Idioma idioma){
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.completa = completa;
		this.texto = texto;
		this.parrafo = parrafo;
		this.idioma = idioma;
	}

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

	public Boolean getCompleta() {
		return completa;
	}

	public void setCompleta(Boolean completa) {
		this.completa = completa;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public Parrafo getParrafo() {
		return parrafo;
	}

	public void setParrafo(Parrafo parrafo) {
		this.parrafo = parrafo;
	}

	public Idioma getIdiomaOriginal() {
		return this.getParrafo().getDocumento().getIdioma();
	}
}
