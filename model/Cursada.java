/**
 * Cursada.java
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

	private Date inicio;
	private Usuario usuario;
	private Collection<Prueba> pruebas;
	private Curso curso;
	
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
		this.setInicio(inicio);
		this.setUsuario(usuario);
		usuario.agregarCursada(this);
		this.setCurso(curso);
		this.setPruebas(new ArrayList<Prueba>());
	}
	
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
	public Idioma getIdioma() {
		return curso.getIdioma();
	}
	public int getNivel(){
		return curso.getNivel();
	}

	
	// Methods
	/**
	 * Agrega una prueba a la cursada.
	 * @param prueba
	 */
	public void agregarPrueba(Prueba prueba){
		pruebas.add(prueba);
	}
	
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
	
	/**
	 * Retorna una coleccion de las lecciones aprobadas que posee esta cursada.
	 * @return
	 */
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
}
