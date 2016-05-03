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
 * Esta es la clase Traduccion que se utiliza para instanciar a los objetos traduccion
 * 
 * @author Grupo10
 *
 */
public class Traduccion extends Tarea {
	
	
	/**
	 * Variable de instancia fecha
	 */
	private Date fecha;

	/**
	 * Variable de instancia descripcion
	 */
	private String descripcion;
	
	/**
	 * Variable de instancia completa
	 */
	private Boolean completa;
	
	/**
	 * Variable de instancia texto
	 */
	private String texto;
	
	/**
	 * Variable de instancia idioma
	 */
	private Idioma idioma;
	
	/**
	 * Variable de instancia parrafo
	 */
	private Parrafo parrafo;
	
	/**
	 * Constructor por defecto para la clase Traduccion.
	 */
	public Traduccion(){
		
	}
	
	/**
	 * Constructor con argumentos para la clase Traduccion
	 * 
	 * @param fecha
	 * @param descripcion
	 * @param completa
	 * @param texto
	 * @param parrafo
	 * @param idioma
	 */
	public Traduccion(Date fecha, String descripcion, Boolean completa, String texto, Parrafo parrafo, Idioma idioma){
		this.setFecha(fecha);
		this.setDescripcion(descripcion);
		this.setCompleta(completa);
		this.setTexto(texto);
		this.setParrafo(parrafo);
		this.setIdioma(idioma);
	} 
	
	/**
	 * Método para recuperar la fecha del objeto traduccion
	 */

	public Date getFecha() {
		return fecha;
	}

	/**
	 * Método para setear una fecha al objeto traduccion
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Método para recuperar la descripcion del objeto traduccion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Método para setear una descripcion al objeto traduccion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Método booleano para recuperar si la Traduccion esta completa o no
	 */
	public Boolean getCompleta() {
		return completa;
	}

	/**
	 * Método booleano para setear si la traducción esta completa o no
	 */
	public void setCompleta(Boolean completa) {
		this.completa = completa;
	}

	/**
	 * Método para recuperar el texto del objeto traduccion
	 * @return String
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * Método para setear un texto al objeto taduccion
	 * @param texto
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * Método para recuperar el Idioma del objeto traduccion
	 * @return Idioma
	 */
	public Idioma getIdioma() {
		return idioma;
	}

	/**
	 * Método para setear un Idioma al objeto traduccion
	 * @param idioma
	 */
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	/**
	 * Método para recuperar el Parrafo del objeto traduccion
	 * @return
	 */
	public Parrafo getParrafo() {
		return parrafo;
	}

	/**
	 * Método para setear un objeto parrafo al objeto traduccion
	 * @param parrafo
	 */
	public void setParrafo(Parrafo parrafo) {
		this.parrafo = parrafo;
	}

	/**
	 * Método para recuperar el idioma original del objeto traduccion
	 * @return Idioma
	 */
	public Idioma getIdiomaOriginal() {
		return this.getParrafo().getDocumento().getIdioma();
	}
}