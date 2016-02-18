package bd2.model;

import java.util.Date;

/**
 * @author bd2
 *
 */
public class Evaluacion extends Tarea {

	protected Traduccion traduccion;
	protected int puntaje;
	
	public Evaluacion(Date fecha, String descripcion, Boolean completa, Traduccion traduccion, int puntaje) {
		super(fecha, descripcion, completa);
		this.traduccion = traduccion;
		this.puntaje = puntaje;
	}

}
