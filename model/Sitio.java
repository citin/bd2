/**
 * Evaluacion.java
 * 
 * BBDD2 - Proyecto Integrador 
 * 
 * Etapa 1
 * 
 */
package bd2.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Grupo10
 *
 */
public class Sitio {

	/**
	 * Constructor de la clase Sitio
	 */
	public Sitio() {
		super();
		this.setDocumentos(new ArrayList<Documento>());
		this.setUsuarios(new ArrayList<Usuario>());
		this.setCursos( new ArrayList<Curso>());
	}

	private Collection<Documento> documentos;
	private Collection<Usuario> usuarios;
	private Collection<Curso> cursos;

	public void registrarUsuario(Usuario user){
		usuarios.add(user);
	}

	public void agregarCurso(Curso curso){
		cursos.add(curso);
	}

	public void agregarDocumento(Documento documento){
		documentos.add(documento);
	}

	public Collection<Documento> getDocumentos() {
		return documentos;
	}

	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}

	public Collection<Curso> getCursos() {
		return cursos;
	}

	// Private Accesors
	private void setDocumentos(Collection<Documento> documentos) {
		this.documentos = documentos;
	}
	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setCursos(Collection<Curso> cursos) {
		this.cursos = cursos;
	}

}
