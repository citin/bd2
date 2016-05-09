/**
 * Usuario.java
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


	/**
	 * Variable de instancia idUsuario . 
	 * identificador del usuario
	 */
	private long idUsuario;
	
	/**
	 * Variable de instancia email . 
	 * email del usuario
	 */
	private String email;

	/**
	 * Variable de instancia nombre. 
	 * nombre del usuario
	 */
	private String nombre;
	
	/**
	 * Variable de instancia fecha de creacion. 
	 * Fecha de creacion del usuario
	 */
	private Date fechaDeCreacion;

	/**
	 * Variable de instancia cursadas realizadas. 
	 * Coleccion de cursadas realizadas por el usuario
	 */
	private Collection<Cursada> cursadasRealizadas;

	/**
	 * Variable de instancia traducciones. 
	 * Coleccion de traducciones hechas por el usuario
	 */
	private Collection<Traduccion> traducciones;

	/**
	 * Constructor por defecto para la clase Usuario.
	 */
	public Usuario(){
		
	}

	/**
	 * Constructor de la clase Usuario
	 * 
	 * @param email
	 * @param nombre
	 * @param fechaDeCreacion
	 */
	public Usuario(String email, String nombre, Date fechaDeCreacion) {
		super();
		this.setEmail(email);
		this.setNombre(nombre);
		this.setFechaDeCreacion(fechaDeCreacion);
		this.setCursadasRealizadas(new ArrayList<Cursada>());
		this.setTraducciones(new ArrayList<Traduccion>());
	
	}

	/**
	 * Método para setear el id del objeto usuario
	 */
	public long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Método para recuperar el id del objeto usuario
	 * @param idUsuario
	 */
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * Método para recuperar el mail del objeto usuario
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Método para setear el mail del objeto usuario
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método para recuperar el nombre del objeto usuario
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para setear el nombre del objeto usuario
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para recuperar la fecha de creacion del objeto usuario
	 * @return Date
	 */
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	/**
	 * Método para setear la fecha de creacion del objeto usuario
	 * @param fechaDeCreacion
	 */
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	/**
	 * Método para recuperar la coleccion de cursadas realizadas del objeto usuario
	 * @return Collection
	 */
	public Collection<Cursada> getCursadasRealizadas() {
		return cursadasRealizadas;
	}

	/**
	 * Método para setear la coleccion de cursadas realizadas del objeto usuario
	 * @param cursadasRealizadas
	 */
	public void setCursadasRealizadas(Collection<Cursada> cursadasRealizadas) {
		this.cursadasRealizadas = cursadasRealizadas;
	}

	/**
	 * Método para recuperar las traducciones del objeto usuario
	 * @return Collection
	 */
	public Collection<Traduccion> getTraducciones() {
		return traducciones;
	}

	/**
	 * Método para setear la coleccion de traducciones del objeto usuario
	 * @param traducciones
	 */
	public void setTraducciones(Collection<Traduccion> traducciones) {
		this.traducciones = traducciones;
	}


	/**
	 * Método para agregar una cursada en la coleccion de cursadas del objeto usuario
	 * @param cursada
	 */
	public void agregarCursada(Cursada cursada){
		cursadasRealizadas.add(cursada);
	}

	/**
	 * Método para agregar una traduccion en la coleccion de traducciones del objeto usuario
	 * @param traduccion
	 */
	public void agregarTraduccion(Traduccion traduccion){
		traducciones.add(traduccion);
	}


	/**
	 * Retorna el nivel máximo entre las cursadas aprobadas
	 * @param idioma
	 * @return
	 */
	public int nivel(Idioma idioma){
		int aux = 0;
		for (Iterator<Cursada> cursadasIterador = cursadasRealizadas.iterator(); cursadasIterador.hasNext();) {
			Cursada cursada = (Cursada) cursadasIterador.next();
			
			if ((cursada.finalizada()) && (cursada.getIdioma().equals(idioma))) {
				if (cursada.getNivel() > aux) {
					aux = cursada.getNivel();
				}
			}
		}
		return aux;
	}	
	
	/**
	 * Retorna todas las cursadas aprobadas para un idioma
	 * @param idioma
	 * @return
	 */
	public Collection<Cursada> cursadasAprobadas(Idioma idioma) {
		Collection<Cursada> aux = new ArrayList<Cursada>();
		for (Iterator<Cursada> iCursada = cursadasRealizadas.iterator(); iCursada.hasNext();) {
			Cursada cursada = (Cursada) iCursada.next();
			if (cursada.finalizada() && (cursada.getIdioma().equals(idioma))) {
				aux.add(cursada);
			}
		}
		return aux;
	}		
}