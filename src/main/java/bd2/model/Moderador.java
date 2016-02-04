/**
 * 
 */
package bd2.model;

import java.util.Date;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author bd2
 *
 */
public class Moderador extends Usuario {

	protected Collection<Evaluacion> evaluaciones = new HashSet<Evaluacion>();
	
	public Moderador(String email, String nombre, Date fechaDeCreacion) {
		super(email, nombre, fechaDeCreacion);
		// TODO Auto-generated constructor stub
	}

	public int reputacion(){
		//TODO - implementar según lo que aporta al sistema
		return 0;
	}

}
