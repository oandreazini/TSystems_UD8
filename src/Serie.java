
/**
 * Clase Serie
 * Contiene la información de una Serie
 * @author Oriol
 *
 */
public class Serie {

	/**ATRIBUTOS**/

	protected String titulo;
	protected int numTemp;
	protected String genero;
	protected String creador;

	/**CONSTRUCTORES**/

	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numTemp = 3;
		this.genero = "";
		this.creador = "";
	}

	/**
	 * Constructor con 4 parametros
	 * @param titulo
	 * @param numTemp
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int numTemp, String genero,String creador) {
		this.titulo = titulo;
		this.numTemp = numTemp;
		this.genero = genero;
		this.creador = creador;
	}

	/**GETTERS & SETTERS**/

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected int getNumTemp() {
		return numTemp;
	}

	protected void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
	}

	protected String getCreador() {
		return creador;
	}

	protected void setCreador(String creador) {
		this.creador = creador;
	}

	//Muestra la informacion de la Serie
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemp=" + numTemp + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}
}
