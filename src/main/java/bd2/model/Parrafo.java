package bd2.model;

/**
 * @author bd2
 *
 */
public class Parrafo {
	protected String texto;
	protected Documento documento;
	
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
