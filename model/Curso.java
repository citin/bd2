package bd2.model;

import java.util.Collection;

public class Curso {
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Collection<Leccion> getLecciones() {
		return lecciones;
	}
	public void setLecciones(Collection<Leccion> lecciones) {
		this.lecciones = lecciones;
	}
	public Idioma getIdioma() {
		return idioma;
	}
	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	public Leccion agregarLeccion(Leccion lec){
		this.lecciones.add(lec);
		return lec;
	}
	
	private String nombre;
	private Integer nivel;
	private Collection<Leccion> lecciones;
	private Idioma idioma;
	
		
}
