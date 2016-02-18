package bd2.model;

import java.util.Date;

/**
 * @author bd2
 *
 */
public class Traduccion extends Tarea {


	protected String texto;
	protected Parrafo parrafo;
	protected Idioma idioma;

	public Traduccion(Date fecha, String descripcion, Boolean completa, String texto, Parrafo parrafo, Idioma idioma) {
		super(fecha, descripcion, completa);
		this.texto = texto;
		this.idioma = idioma;
		this.parrafo = parrafo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public Parrafo getParrafo() {
		return parrafo;
	}

	public void setParrafo(Parrafo parrafo) {
		this.parrafo = parrafo;
	}	
	
}
