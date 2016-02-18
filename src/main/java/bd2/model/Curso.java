package bd2.model;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author bd2
 *
 */
public class Curso {
	protected String nombre;
	protected int nivel;
	protected Collection<Leccion> lecciones = new HashSet<Leccion>();
	
	public Curso(String nombre,int nivel){
		this.nombre = nombre;
		this.nivel= nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Collection<Leccion> getLecciones() {
		return lecciones;
	}

	public void setLecciones(Collection<Leccion> lecciones) {
		this.lecciones = lecciones;
	}
}
