package bd2.model;
import java.util.Collection;
import java.util.HashSet;
/**
 * @author bd2
 *
 */

import java.util.Date;

/**
 * @author bd2
 *
 */
public class Usuario {
	protected String email;
	protected String nombre;
	protected Date fechaDeCreacion;
	protected Collection<Traduccion> traducciones = new HashSet<Traduccion>();
	protected Collection<Cursada> cursadasRealizadas = new HashSet<Cursada>();
	protected Collection<Prueba> pruebasRealizadas = new HashSet<Prueba>();
	
	public Usuario(String email, String nombre, Date fechaDeCreacion) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
	}
	
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

	public void agregarCursada(Cursada cursada){
		this.cursadasRealizadas.add(cursada);
	}

	public void agregarLeccion(Prueba prueba){
		this.pruebasRealizadas.add(prueba);
	}

	public void agregarTraduccion(Traduccion traduccion){
		this.traducciones.add(traduccion);
	}
	
	public Integer nivel(){
		return 0;
	}
}