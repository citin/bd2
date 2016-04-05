package bd2.model;

public class Prueba {
	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
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
		return (this.puntaje >= 7);
	} 
	
	
}
