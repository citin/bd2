package bd2.model;

/**
 * @author bd2
 *
 */
public class Prueba {
	protected int puntaje;
	protected Leccion leccion;
	
	public Prueba(Leccion leccion, Integer puntaje){
		if (puntaje < 0)
			throw new Excepcion("No se puede crear una instancia de Prueba con valores negativos como puntaje de una prueba.");
		if (puntaje > 100)
			throw new Excepcion("No se puede usar valores mayores a 100 como puntaje de una prueba.");
		this.leccion = leccion;
		this.puntaje = puntaje;
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
	
	public Boolean aprobada(){
		return this.puntaje >= 60;
	}
}
