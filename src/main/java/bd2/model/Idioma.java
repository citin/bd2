package bd2.model;

/**
 * @author bd2
 *
 */
public class Idioma {
	protected String nombre;
	protected Diccionario diccionario;
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Idioma(String nombre) {
		this.nombre = nombre;
		this.diccionario = new Diccionario(this, "");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Diccionario getDiccionario() {
		return this.diccionario;
	}

	public void setDiccionario(Diccionario diccionario) {
		this.diccionario = diccionario;
	}
}
