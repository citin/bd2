package bd2.model;
import java.util.Date;

/**
 * @author bd2
 *
 */
public class Cursada {
	protected Curso curso;
	protected Date inicio;
	
	public Cursada(Curso curso, Date inicio){
		this.curso = curso;
		this.inicio = inicio;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	
}
