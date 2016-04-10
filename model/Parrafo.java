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
	
	// Attributes
	private String texto;
	private Documento documento;
	
	/**
	 * Constructor de la clase Parrafo
	 * 
	 * @param nuevoTexto
	 * @param nuevoDocuemnto
	 */
	
	public Parrafo(String nuevoTexto, Documento nuevoDocuemnto){
		this.setTexto(nuevoTexto);
		this.setDocumento(nuevoDocuemnto);
	} //Cierre del constructor
	
	// Método para recupera el texto del objeto parrafo
	public String getTexto() {
		return texto;
	}
	
	// Método para setear un texto al objeto parrafo
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	// Método para recupera el objeto documento del objeto parrafo
	public Documento getDocumento() {
		return documento;
	}
	
	// Método para setear un objeto documento al objeto parrafo
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
