
import javax.swing.JOptionPane;

/**
 * Clase Electrodomestico
 * Contiene información de un Electrodomestico
 * @author Oriol
 *
 */
public class Electrodomestico {

	/**ATRIBUTOS**/
	private double precioBase;
	private String color;
	private String consumoEnerg;
	private double peso;

	/**CONSTRUCTORES**/

	//Constructor por defecto

	public Electrodomestico() {
		this.precioBase = 100;
		this.color = "blanco";
		this.consumoEnerg = "F";
		this.peso = 5;
	}

	/**
	 * Constructor con 2 parametros
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso ) {
		this.precioBase = precioBase;
		this.color = "blanco";
		this.consumoEnerg = "F";
		this.peso = peso;
	}
	/**
	 * Constructor con 4 parametros
	 * @param precioBase
	 * @param color
	 * @param consumoEnerg
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, String consumoEnerg, double peso) {
		this.precioBase = precioBase;
		this.color = tipoColor();
		this.consumoEnerg = tipoEnerg();
		this.peso = peso;
	}

	/**	METODOS **/

	public static String tipoColor() {
		String color = JOptionPane.showInputDialog("Introduce el color:");
		color = color.toLowerCase();

		//Con el switch comprovamos que la entrada sea la correcta, no importa si es en mayuscula o minuscula
		switch (color) {
		case"blanco":
			break;		
		case"negro":
			break;
		case"rojo":
			break;
		case"azul":
			break;
		case"gris":
			break;
		default:
			JOptionPane.showMessageDialog(null,  "Entrada incorrecta");
			color = JOptionPane.showInputDialog("Introduce el color:");
		}
		return color;
	}

	public static String tipoEnerg() {
		String consumoEnerg = JOptionPane.showInputDialog("Introduce el consumo energético: ");
		consumoEnerg = consumoEnerg.toUpperCase();

		//Con el switch comprovamos que la entrada sea la correcta, no importa si es en mayuscula o minuscula
		switch (consumoEnerg) {
		case"A":
			break;		
		case"B":
			break;
		case"C":
			break;
		case"D":
			break;
		case"E":
			break;
		case"F":
			break;
		default:
			JOptionPane.showMessageDialog(null,  "Entrada incorrecta");
			consumoEnerg = JOptionPane.showInputDialog("Introduce el consumo energético: ");
		}
		return consumoEnerg;
	}

	/**GETTERS & SETTERS**/
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumoEnerg() {
		return consumoEnerg;
	}

	public void setConsumoEnerg(String consumoEnerg) {
		this.consumoEnerg = consumoEnerg;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


	//Muestra la informacion del Electrodomestico
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnerg=" + consumoEnerg
				+ ", peso=" + peso + "]";
	}
}
