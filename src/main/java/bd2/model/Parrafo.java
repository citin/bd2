package bd2.model;

/**
 * @author bd2
 *
 */
public class Parrafo {
	protected String texto;
	protected Documento documento;
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Parrafo(String texto, Documento documento){
		this.texto = texto;
		this.documento = documento;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
}
