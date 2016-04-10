/**
 * Prueba.java
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
public class Prueba {
	
	// Attributes
	private Integer puntaje;
	private Leccion leccion;
	
	/**
	 * Constructor de la clase Prueba
	 * @param leccion
	 * @param puntaje
	 */
	public Prueba(Leccion leccion, Integer puntaje) {
		super();
		verificarPuntaje(puntaje);

		this.setPuntaje(puntaje);
		this.setLeccion(leccion);
	}

	// Accesors
	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		verificarPuntaje(puntaje);
		this.puntaje = puntaje;
	}

	public Leccion getLeccion() {
		return leccion;
	}

	public void setLeccion(Leccion leccion) {
		this.leccion = leccion;
	}

	// Methods
	
	/**
	 * Retorna un booleano indicando si la prueba esta aprobada.
	 * @return
	 */
	public Boolean aprobada() {
		return (this.puntaje >= 60);
	} 
	
	/**
	 * Verifica que el puntaje este entre 0 y 100
	 * Levanta excepcion
	 * @param puntajeOk
	 * @return
	 */
	private Boolean verificarPuntaje(int puntajeOk){
		if (puntajeOk < 0) {
			throw new RuntimeException("No se puede usar valores negativos como puntaje de una prueba.");
		} else {
		if (puntajeOk > 100) {
			throw new RuntimeException("No se puede usar valores mayores a 100 como puntaje de una prueba.");
		}
		}
		return true;
	}
	
}
