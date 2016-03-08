package bd2.model;

/**
 * @author bd2
 *
 */
public class Leccion {
	protected String nombre;
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Leccion(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
