package bd2.model;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author bd2
 *
 */
public class Documento {
	protected Idioma idioma;
	protected String nombre;
	protected Collection<Parrafo> parrafos = new HashSet<Parrafo>();
	private long id;
	

	public Documento(){}
	
	public Documento(String nombre, Idioma idioma) {
		this.nombre = nombre;
		this.idioma = idioma;
	}
	
	
	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Parrafo agregarParrafo(String texto){
		Parrafo nuevo = new Parrafo(texto, this);
		this.parrafos.add(nuevo);
		return nuevo;
	}

	public Collection<Parrafo> getParrafos() {
		return parrafos;
	}

	private void setParrafos(Collection<Parrafo> parrafos) {
		this.parrafos = parrafos;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	

}

