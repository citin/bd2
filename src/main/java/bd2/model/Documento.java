package bd2.model;

public class Documento {
	protected Idioma idioma;
	protected String nombre;
	
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

	public Documento(String nombre, Idioma idioma) {
		this.nombre = nombre;
		this.idioma = idioma;
	}
}

