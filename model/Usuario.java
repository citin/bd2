package bd2.model;

import java.util.Collection;
import java.util.Date;

public class Usuario {
	private String email;
	private String nombre;
	private Date fechaDeCreacion;
	private Collection<Cursada> cursadasRealizadas;
	private Collection<Traduccion> traducciones;

	// CONSTRUCTOR
	public Usuario(String email, String nombre, Date fechaDeCreacion) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
	}
	
	// METHODS
	
	// Retorna el nivel máximo entre las cursadas aprobadas 
	// por el usuario del Idioma recibido por parámetro.
	public int nivel(Idioma idioma){
		cursadasRealizadas cada | cursada |
		cursada.getIdioma = idioma
	return	
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
}