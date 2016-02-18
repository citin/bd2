package bd2.model;

/**
 * @author bd2
 *
 */
public class Prueba {
	protected int puntaje;
	protected Leccion leccion;
	
	public Prueba(Leccion leccion){
		this.leccion = leccion;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Leccion getLeccion() {
		return leccion;
	}

	public void setLeccion(Leccion leccion) {
		this.leccion = leccion;
	}
}
