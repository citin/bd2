/**
 * Idioma.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

/**
 * Esta es la clase Idioma que se utiliza para instanciar a los objetos idiomas
 * 
 * @author Grupo10
 *
 */
public class Idioma {

	/**
	 * Variable de instancia idIdioma
	 */
	private long idIdioma;
	
	/**
	 * Variable de instancia nombre
	 */
	private String nombre;
	
	/**
	 * Variable de instancia diccionario
	 */
	private Diccionario diccionario;
	
	/**
	 * Este es el constructor por defecto para la clase Idioma.
	 */
	public Idioma(){
		this.diccionario = new Diccionario();
	}
	
	public long getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(long idIdioma) {
		this.idIdioma = idIdioma;
	}
	
	/**
	 * Constructor con argumentos para la clase Idioma
	 * 
	 * @param nombre 
	 */
	
	public Idioma(String nombre){
		this.setNombre(nombre);  
		this.setDiccionario(new Diccionario(this, "Edicion 1")); // Por defecto se inicializa en la Edicion 1
	}
	
	/**
	 * Método para recuperar el nombre del objeto idioma	
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método para setear un nombre al objeto idioma	
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método para recuperar el diccionario del objeto idioma	
	 * @return Diccionario
	 */
	public Diccionario getDiccionario() {
		return diccionario;
	}
	
	/**
	 * Método para setear un diccionario al objeto idioma	
	 * @param diccionario
	 */
	public void setDiccionario(Diccionario diccionario) {
		this.diccionario = diccionario;
	}
}
