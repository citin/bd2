package bd2.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class Moderador extends Usuario {
	
		public Moderador(String email, String nombre, Date fechaDeCreacion) {
		super(email, nombre, fechaDeCreacion);
		
		this.evaluaciones = new ArrayList<Evaluacion>(); 
		this.idiomas = new ArrayList<Idioma>();
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
		public int reputacion() {
			return evaluaciones.size();
		}
		public boolean manejaIdioma(Idioma idioma) {
			return idiomas.contains(idioma);
		}
		public void agregarIdioma(Idioma idioma) {
			idiomas.add(idioma);
		}
		public void evaluar(Traduccion traduccion, String descripcion, int puntaje) {
			
			if (this.puedeTraducir(traduccion)) {
			
			Evaluacion nueva = new Evaluacion(Calendar.getInstance().getTime(), descripcion, true, traduccion, puntaje);
			evaluaciones.add(nueva);}
		}
		private boolean puedeTraducir(Traduccion traduccion) {

			if ( ( !this.manejaIdioma(traduccion.getIdioma()) ) ||
				 ( !this.manejaIdioma(traduccion.getIdiomaOriginal()) ) ) {
				throw new RuntimeException("No se pueden evaluar traducciones de idiomas que el moderador no maneja.");
			}		
			return true;
		}
}

		

