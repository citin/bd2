package bd2.model;

public class Prueba {
	// new Prueba(vocabularioBasico, 60);
	public Prueba(Leccion leccion, Integer puntaje) {
		super();
		verificarPuntaje(puntaje);
		
		this.puntaje = puntaje;
		this.leccion = leccion;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		verificarPuntaje(puntaje);
		this.puntaje = puntaje;
	}

	public Leccion getLeccion() {
		return leccion;
	}

	public void setLeccion(Leccion leccion) {
		this.leccion = leccion;
	}

	private Integer puntaje;
	private Leccion leccion;
	
	public Boolean aprobada() {
		return (this.puntaje >= 60);
	} 
	
	private Boolean verificarPuntaje(int puntajeOk){
		if (puntajeOk < 0) {
			throw new RuntimeException("No se puede usar valores negativos como puntaje de una prueba.");
		} else {
		if (puntajeOk > 100) {
			throw new RuntimeException("No se puede usar valores mayores a 100 como puntaje de una prueba.");
		}
		}
		return true;
	}
	
}
