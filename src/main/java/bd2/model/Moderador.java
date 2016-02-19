/**
 * 
 */
package bd2.model;

import java.util.Date;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author bd2
 *
 */
public class Moderador extends Usuario {

	protected Collection<Evaluacion> evaluaciones = new HashSet<Evaluacion>();
	protected Collection<Idioma> idiomas = new HashSet<Idioma>();
	
	public Moderador(String email, String nombre, Date fechaDeCreacion) {
		super(email, nombre, fechaDeCreacion);
		// TODO Auto-generated constructor stub
	}

	public int reputacion(){
		//TODO - implementar según lo que aporta al sistema
		return 0;
	}

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
