package bd2.model;

import java.util.Date;

public class Traduccion extends Tarea {


	protected String texto;
	protected Idioma idioma;

	public Traduccion(Date fecha, String descripcion, Boolean completa, String texto, Idioma idioma) {
		super(fecha, descripcion, completa);
		this.texto = texto;
		this.idioma = idioma;
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
	
	
	
}
