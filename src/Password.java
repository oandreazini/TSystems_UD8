import java.security.SecureRandom;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Clase Password
 * Contiene información de un Password
 * @author Oriol
 *
 */
public class Password {

	/**ATRIBUTOS**/

	private int longitud;
	private String contraseña;

	/**CONSTRUCTORES**/

	//Constructor por defecto
	public Password () {
		this.longitud=8;
		this.contraseña="Oriol32";
	}

	/**
	 * Constructor con 2 parametros
	 * @param longitud
	 * @param contraseña
	 */
	public Password(int longitud, String contraseña) {
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	/**	METODOS **/

	public static String PasswordVariable(int longitud) {

		//Creamos la variable chars para tener todos los valores que pueda tener la contraseña
		final String chars = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";

		SecureRandom random = new SecureRandom();
		StringBuilder contraseña = new StringBuilder();

		//Pedimos el rango que queremos que tenga la contraseña
		String entrada = JOptionPane.showInputDialog("Introduce la longitud de la contraseña:");
		longitud = Integer.parseInt(entrada);

		//Cada interacción del bucle elige aleatoriamente un carácter, y lo agrega a la instancia "StringBuilder"
		for(int i=0; i<longitud; i++) {
			int randomIndex = random.nextInt(chars.length());
			contraseña.append(chars.charAt(randomIndex));
		}
		JOptionPane.showMessageDialog(null,  " La contraseña es :" +contraseña);
		return contraseña.toString();
	}

	/**GETTERS & SETTERS**/

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	//Muestra la informacion de Password
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

}
