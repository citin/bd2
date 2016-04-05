/**
 * Parrafo.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

/**
 * @author Grupo10
 *
 */
public class Parrafo {
	
	private String texto;
	private Documento documento;
	
	/**
	 * Constructor de la clase Parrafo
	 * 
	 * @param nuevoTexto
	 * @param nuevoDocuemnto
	 */
	
	public Parrafo(String nuevoTexto, Documento nuevoDocuemnto){
		this.texto = nuevoTexto;
		this.documento = nuevoDocuemnto;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
