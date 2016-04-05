package bd2.model;

import java.util.Collection;

public class Moderador extends Usuario {
	
		private Collection<Evaluacion> evaluaciones;
		private Collection<Idioma> idiomas;
		
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
}
