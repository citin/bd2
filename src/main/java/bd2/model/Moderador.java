/**
 * Moderador.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

/**
 * @author Grupo10
 *
 */
public class Moderador extends Usuario {

	/**
	 * Variable de instancia evaluaciones. 
	 * Coleccion de evaluaciones del moderador
	 */
	private Collection<Evaluacion> evaluaciones = new ArrayList<Evaluacion>();

	/**
	 * Variable de instancia idiomas. 
	 * Coleccion de idiomas del moderador
	 */
	private Collection<Idioma> idiomas = new ArrayList<Idioma>();

	/**
	 * Constructor por defecto para la clase Moderador.
	 */
	public Moderador(){
		
	}
	
	/**
	 * Constructor para la clase Moderador
	 * 
	 * @param email
	 * @param nombre
	 * @param fechaDeCreacion
	 */
	public Moderador(String email, String nombre, Date fechaDeCreacion) {
		super(email, nombre, fechaDeCreacion);

		this.setEvaluaciones(new ArrayList<Evaluacion>()); 
		this.setIdiomas(new ArrayList<Idioma>());
	}

	/**
	 * Método para recuperar la coleccion de evaluaciones del objeto moderador
	 * @return Collection
	 */
	public Collection<Evaluacion> getEvaluaciones() {
		return evaluaciones;
	}

	/**
	 * Método para la setear la coleccion de evaluaciones del objeto moderador
	 * @param evaluaciones
	 */
	public void setEvaluaciones(Collection<Evaluacion> evaluaciones) {
		this.evaluaciones = evaluaciones;
	}

	/**
	 * Método para recuperar la coleccion de idiomas del objeto moderador
	 * @return Collection
	 */
	public Collection<Idioma> getIdiomas() {
		return idiomas;
	}

	/**
	 * Método para setear la coleccion de idiomas del objeto moderador
	 * @param idiomas
	 */
	public void setIdiomas(Collection<Idioma> idiomas) {
		this.idiomas = idiomas;
	}

	/**
	 * Retorna la reputacion del moderador
	 * @return
	 */
	public int reputacion() {
		return evaluaciones.size();
	}
	
	/**
	 * Retorna un booleano indicando si el moderador tiene al Idioma recibido por parámetro entre los idiomas que maneja.
	 * @param idioma
	 * @return
	 */
	public boolean manejaIdioma(Idioma idioma) {
		return idiomas.contains(idioma);
	}
	public void agregarIdioma(Idioma idioma) {
		idiomas.add(idioma);
	}

	/**
	 * Registra una nueva evaluación (terminada) para la Traduccion recibida por parámetro en la coleccio
	 * @param traduccion
	 * @param descripcion
	 * @param puntaje
	 */
	public void evaluar(Traduccion traduccion, String descripcion, int puntaje) {

		if (this.puedeTraducir(traduccion)) {

			Evaluacion nueva = new Evaluacion(Calendar.getInstance().getTime(), descripcion, true, traduccion, puntaje);
			evaluaciones.add(nueva);}
	}
	/**
	 * Retorna un booleano si el moderador maneja los dos idiomas de la traduccion
	 * @param traduccion
	 * @return
	 */
	private boolean puedeTraducir(Traduccion traduccion) {

		if ( ( !this.manejaIdioma(traduccion.getIdioma()) ) ||
				( !this.manejaIdioma(traduccion.getIdiomaOriginal()) ) ) {
			throw new RuntimeException("No se pueden evaluar traducciones de idiomas que el moderador no maneja.");
		}		
		return true;
	}
}



