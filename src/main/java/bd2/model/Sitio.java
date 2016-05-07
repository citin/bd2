/**
 * Sitio.java
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

	/*
	 * Variable de instancia idSitio
	 * Identificador del sitio
	 */		
	private long idSitio;

	/*
	 * Variable de instancia documentos
	 * Coleccion de documentos del sitio
	 */	
	private Collection<Documento> documentos;
	/*
	 * Variable de instancia usuarios
	 * Coleccion de usuario del sitio
	 */
	private Collection<Usuario> usuarios;
	/*
	 * Variable de instancia cursos
	 * Coleccion de cursos del sitio
	 */
	private Collection<Curso> cursos;

	/*
	 * Constructor por defecto para la clase Sitio.
	 */
	public Sitio(){
		this.setUsuarios(new ArrayList<Usuario>());
		this.setDocumentos(new ArrayList<Documento>());
		this.setCursos(new ArrayList<Curso>());
	}
	
	/**
	 * Método para agregar un objeto usuario a la coleccion de usuario del sitio
	 * @param user
	 */
	public void registrarUsuario(Usuario user){
		usuarios.add(user);
	}

	/**
	 * Método para agregar un objeto curso a la coleccion de usuario del sitio
	 * @param curso
	 */
	public void agregarCurso(Curso curso){
		cursos.add(curso);
	}

	/**
	 * Método para agregar un objeto usuario a la coleccion de usuario del sitio
	 * @param documento
	 */
	public void agregarDocumento(Documento documento){
		documentos.add(documento);
	}

	/**
	 * Método para recuperar la coleccion de documentos del sitio
	 */
	public Collection<Documento> getDocumentos() {
		return documentos;
	}

	/**
	 * Método para recuperar la coleccion de usuario del sitio
	 */
	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * Método para recuperar la coleccion de cursos del sitio
	 */
	public Collection<Curso> getCursos() {
		return cursos;
	}


	/**
	 * Método para setear la coleccion de documentos del sitio
	 * @param documentos
	 */
	private void setDocumentos(Collection<Documento> documentos) {
		this.documentos = documentos;
	}

	/**
	 * Método para setear la coleccion de usuarios del sitio
	 * @param usuarios
	 */
	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * Método para setear la coleccion de cursos del sitio
	 * @param cursos
	 */
	public void setCursos(Collection<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public long getIdSitio() {
		return idSitio;
	}

	public void setIdSitio(long idSitio) {
		this.idSitio = idSitio;
	}


}
