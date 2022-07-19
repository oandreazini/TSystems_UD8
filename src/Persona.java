
/**
 * Clase Persona
 * Contiene información de una Persona
 * @author Oriol
 *
 */
public class Persona {

	/**ATRIBUTOS**/

	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	private final String hombre ="H";


	/**CONSTRUCTORES**/

	//Constructor por defecto
	public Persona (String DNI) {
		this.nombre="";
		this.edad=0;
		this.DNI =DNI;
		this.sexo=hombre;
		this.peso=0;
		this.altura=0;
	}

	/**
	 * Constructor con 4 parametros
	 * @param nombre
	 * @param edad
	 * @param DNI
	 * @param sexo
	 */
	public Persona (String nombre, int edad, String DNI, String sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI =DNI;
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
	}

	/**
	 * Constructor con 6 parametros
	 * @param nombre
	 * @param edad
	 * @param DNI
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona (String nombre, int edad, String DNI, String sexo, double peso, double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI =DNI;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}

	/**GETTERS & SETTERS**/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	//Muestra la informacion del Persona
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

}
