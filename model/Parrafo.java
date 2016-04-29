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
	
	/**
	 * Variable de instancia texto
	 */
	private String texto;
	
	/**
	 * Variable de instancia documento
	 */
	private Documento documento;
	
	/**
	 * Constructor por defecto para la clase Parrafo.
	 */
	public Parrafo(){
		
	}
	
	/**
	 * Constructor con argumentos para la clase Parrafo
	 * @param nuevoTexto
	 * @param nuevoDocuemnto
	 */
	
	public Parrafo(String nuevoTexto, Documento nuevoDocuemnto){
		this.setTexto(nuevoTexto);
		this.setDocumento(nuevoDocuemnto);
	} 
	
	/**
	 * Método para recupera el texto del objeto parrafo
	 * @return String
	 */
	public String getTexto() {
		return texto;
	}
	
	/**
	 * Método para setear un texto al objeto parrafo
	 * @param texto
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	/**
	 * Método para recupera el objeto documento del objeto parrafo
	 * @return Documento
	 */
	public Documento getDocumento() {
		return documento;
	}
	
	/**
	 * Método para setear un objeto documento al objeto parrafo
	 * @param documento
	 */
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
