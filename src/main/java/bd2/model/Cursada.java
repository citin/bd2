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

	/**
	 * Variable de instancia inicio. 
	 * Fecha de inicio de la cursada
	 */
	private long idCursada;
	
	/**
	 * Variable de instancia inicio. 
	 * Fecha de inicio de la cursada
	 */
	private Date inicio;

	/**
	 * Variable de instancia usuario. 
	 * Usuario de la cursada
	 */
	private Usuario usuario;

	/**
	 * Variable de instancia pruebas. 
	 * Coleccion de pruebas de la cursada.
	 */
	private Collection<Prueba> pruebas;

	/**
	 * Variable de instancia curso. 
	 * Curso de la cursada.
	 */
	private Curso curso;
	
	/**
	 * Constructor por defecto para la clase Cursada.
	 */
	public Cursada(){
		this.setPruebas(new ArrayList<Prueba>());		
	}

	/**
	 * Constructor de la clase Cursada con argumentos
	 * 
	 * @param curso
	 * @param inicio
	 * @param usuario
	 */
	public Cursada(Curso curso, Date inicio, Usuario usuario) {
		super();
		this.setInicio(inicio);
		this.setUsuario(usuario);
		usuario.agregarCursada(this);
		this.setCurso(curso);
		this.setPruebas(new ArrayList<Prueba>());
	}
	

	public long getIdCursada() {
		return idCursada;
	}

	public void setIdCursada(long idCursada) {
		this.idCursada = idCursada;
	}

	/**
	 * Método para recupera el inicio del objeto cursada
	 * @return Date
	 */	
	public Date getInicio() {
		return inicio;
	}

	/**
	 * Método para setear una fecha de inicio al objeto cursada
	 * @param inicio
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	/**
	 * Método para recupera el usuario del objeto cursada
	 * @return Usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Método para setear unusuario al objeto cursada
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Método para recupera la coleccion de pruebas del objeto cursada
	 * @return Collection
	 */
	public Collection<Prueba> getPruebas() {
		return pruebas;
	}

	/**
	 * Método para setear una coloccion de pruebas al objeto cursada
	 * @param pruebas
	 */
	public void setPruebas(Collection<Prueba> pruebas) {
		this.pruebas = pruebas;
	}

	/**
	 * Método para recupera el curso del objeto cursada
	 * @return Curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * Método para setear un curso al objeto cursada
	 * @param curso
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * Método para recupera el idioma del objeto cursada
	 * @return Idioma
	 */
	public Idioma getIdioma() {
		return curso.getIdioma();
	}

	/**
	 * Método para recupera el nivel del objeto cursada
	 * @return int
	 */
	public int getNivel(){
		return curso.getNivel();
	}
	
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
