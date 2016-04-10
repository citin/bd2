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

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;


/**
 * @author Grupo10
 *
 */

public class Cursada {

	/**
	 * Constructor de la clase Cursada
	 * 
	 * @param curso
	 * @param inicio
	 * @param usuario
	 */
	// new Cursada(cursoInglesBasico, hoy, sven);
	public Cursada(Curso curso, Date inicio, Usuario usuario) {
		super();
		this.inicio = inicio;
		this.usuario = usuario;
		usuario.agregarCursada(this);
		this.curso = curso;
		this.pruebas = new ArrayList<Prueba>();
	}

	// Attributes
	private Date inicio;
	private Usuario usuario;
	private Collection<Prueba> pruebas;
	private Curso curso;
	
	// Accesors
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Collection<Prueba> getPruebas() {
		return pruebas;
	}
	public void setPruebas(Collection<Prueba> pruebas) {
		this.pruebas = pruebas;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	// Methods
	/**
	 * Retorna un booleano indicando si la cursada esta finalizada
	 * 
	 * @return
	 */
	public Boolean finalizada() {
		Boolean aux= true;
		for (Iterator<Leccion> iLeccion = curso.getLecciones().iterator(); iLeccion.hasNext();) {
			Leccion leccion = (Leccion) iLeccion.next();
			if (!leccionesAprobadas().contains(leccion)) {
				aux = false;
				break;
			}
		}
		return aux;			
	}
	
	public void agregarPrueba(Prueba prueba){
		pruebas.add(prueba);
	}
	
	public Collection<Leccion> leccionesAprobadas(){
		Collection<Leccion> aux = new ArrayList<Leccion>();
		
		for (Iterator<Prueba> iPrueba = pruebas.iterator(); iPrueba.hasNext();) {			
			Prueba prueba = (Prueba) iPrueba.next();
			if (prueba.aprobada()) {
				aux.add(prueba.getLeccion());
			}
		}
		return aux; 
	}
	public Idioma getIdioma() {
		return curso.getIdioma();
	}
	public int getNivel(){
		return curso.getNivel();
	}
	
}
