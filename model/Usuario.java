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
public class Usuario {
	private String email;
	private String nombre;
	private Date fechaDeCreacion;
	private Collection<Cursada> cursadasRealizadas;
	private Collection<Traduccion> traducciones;

	/**
	 * Constructor de la clase Usuario
	 * 
	 * @param email
	 * @param nombre
	 * @param fechaDeCreacion
	 */
	// CONSTRUCTOR
	public Usuario(String email, String nombre, Date fechaDeCreacion) {
		super();
		this.setEmail(email);
		this.setNombre(nombre);
		this.setFechaDeCreacion(fechaDeCreacion);
		this.setCursadasRealizadas(new ArrayList<Cursada>());
	}
	
	// METHODS
	/**
	 * Retorna el nivel máximo entre las cursadas aprobadas
	 * @param idioma
	 * @return
	 */
	public int nivel(Idioma idioma){
		int aux = 0;
		for (Iterator<Cursada> cursadasIterador = cursadasRealizadas.iterator(); cursadasIterador.hasNext();) {
			Cursada cursada = (Cursada) cursadasIterador.next();
			
			if ((cursada.finalizada()) && (cursada.getIdioma() == idioma)) {
				if (cursada.getNivel() > aux) {
					aux = cursada.getNivel();
				}
			}
		}
		return aux;
	}	
	
	// SETTERS & GETTERS
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public Collection<Cursada> getCursadasRealizadas() {
		return cursadasRealizadas;
	}
	public void setCursadasRealizadas(Collection<Cursada> cursadasRealizadas) {
		this.cursadasRealizadas = cursadasRealizadas;
	}
	public Collection<Traduccion> getTraducciones() {
		return traducciones;
	}
	public void setTraducciones(Collection<Traduccion> traducciones) {
		this.traducciones = traducciones;
	}

	public void agregarCursada(Cursada cursada){
		cursadasRealizadas.add(cursada);
	}
	public void agregarTraduccion(Traduccion traduccion){
		traducciones.add(traduccion);
	}
	
	//Methods
	/**
	 * Retorna todas las cursadas aprobadas para un idioma
	 * @param idioma
	 * @return
	 */
	public Collection<Cursada> cursadasAprobadas(Idioma idioma) {
		Collection<Cursada> aux = new ArrayList<Cursada>();
		for (Iterator<Cursada> iCursada = cursadasRealizadas.iterator(); iCursada.hasNext();) {
			Cursada cursada = (Cursada) iCursada.next();
			if (cursada.finalizada() && (cursada.getIdioma() == idioma)) {
				aux.add(cursada);
			}
		}
		return aux;
	}		
}