/**
 * Evaluacion.java
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
		
		// Attributes
		private Collection<Evaluacion> evaluaciones;
		private Collection<Idioma> idiomas;
		
		// Accesors
		public Collection<Evaluacion> getEvaluaciones() {
			return evaluaciones;
		}
		public void setEvaluaciones(Collection<Evaluacion> evaluaciones) {
			this.evaluaciones = evaluaciones;
		}
		public Collection<Idioma> getIdiomas() {
			return idiomas;
		}
		public void setIdiomas(Collection<Idioma> idiomas) {
			this.idiomas = idiomas;
		}
		
		// Methods
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

		

