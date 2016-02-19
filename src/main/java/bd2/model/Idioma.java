package bd2.model;

/**
 * @author bd2
 *
 */
public class Idioma {
	protected String nombre;
	protected Diccionario diccionario;
	
	public Idioma(String nombre) {
		this.nombre = nombre;
		this.diccionario = new Diccionario(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
