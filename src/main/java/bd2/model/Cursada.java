package bd2.model;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

/**
 * @author bd2
 *
 */
public class Cursada {
	protected Curso curso;
	protected Date inicio;
	protected Usuario usuario;
	protected Collection<Prueba> pruebas = new HashSet<Prueba>();
	
	public Cursada(Curso curso, Date inicio, Usuario usuario){
		this.curso = curso;
		this.inicio = inicio;
		this.usuario = usuario;
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
	
	public void agregarPrueba(Prueba prueba){
		this.pruebas.add(prueba);
	}

	public Collection<Prueba> getPruebas() {
		return pruebas;
	}

	public void setPruebas(Collection<Prueba> pruebas) {
		this.pruebas = pruebas;
	}
	
	public Boolean finalizada(){
		return false;
	}
	
}
