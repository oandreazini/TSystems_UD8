
/**
 * Clase SerieHijo
 * Clase SerieHijo hereda de la clase Serie
 * @author Oriol
 * 
 */

public class SerieHijo extends Serie{
	
	public SerieHijo() {
		super("", 3, "", "");
	}
	
	/**ATRIBUTO**/
	private boolean entregado;
	
	/**CONSTRUCTORES**/

	//Constructor por defecto
	public SerieHijo(boolean entregado) {
		this.titulo ="";
		this.numTemp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	/**
	 * Constructor con 2 parametro
	 * @param titulo
	 * @param creador
	 */
	public SerieHijo(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	
	/**GETTERS & SETTERS**/
	
	protected boolean isEntregado() {
		return entregado;
	}
	protected void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	//Muestra la informacion de la SerieHijo
	@Override
	public String toString() {
		return "SerieHijo [titulo=" + titulo + ", numTemp=" + numTemp + ",entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
}
