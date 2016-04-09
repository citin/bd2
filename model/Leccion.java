package bd2.model;

public class Leccion {
	public Leccion(String nombre) {
		super();
		this.nombre = nombre;
	}

	private String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}	
}
