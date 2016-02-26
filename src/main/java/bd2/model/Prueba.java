package bd2.model;

/**
 * @author bd2
 *
 */
public class Prueba {
	protected int puntaje;
	protected Leccion leccion;

	public Prueba(Leccion leccion, Integer puntaje) throws Exception {
		this.setLeccion(leccion);
		this.setPuntaje(puntaje);
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) throws Exception {
		if (puntaje < 0)
			throw new Exception(
					"No se puede usar valores negativos como puntaje de una prueba.");
		if (puntaje > 100)
			throw new Exception("No se puede usar valores mayores a 100 como puntaje de una prueba.");
		this.puntaje = puntaje;
	}

	public Leccion getLeccion() {
		return leccion;
	}

	public void setLeccion(Leccion leccion) {
		this.leccion = leccion;
	}

	public Boolean aprobada() {
		return this.getPuntaje() >= 60;
	}
}
