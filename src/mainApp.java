import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 *Cramos un menu, con un bucle while y la sentencia switch, el bucle nos permite 
		 *tener la opción de salir, y el switch nos permite seleccionar la opción del menú
		 **/
		boolean salir = false;

		while (!salir) {

			String numero = JOptionPane.showInputDialog("\nElija la opción:\n1->Ejercicio 1 \n2->Ejercicio 2"
					+ "\n3->Ejercicio 3 \n4->Ejercicio 4  \n5->Salir" );
			int num = Integer.parseInt(numero);

			switch (num) {
			case 1:
				//Creamos 3 objetos de la clase Persona y las imprimimos por pantalla
				Persona persona1 = new Persona("3030"); 
				Persona persona2 = new Persona("Silvia",20,"3031","M",60,1.60);
				Persona persona3 = new Persona("Oriol", 25, "3030", "H");

				JOptionPane.showMessageDialog(null,  persona1);
				JOptionPane.showMessageDialog(null,  persona2);
				JOptionPane.showMessageDialog(null,  persona3);
				break;
			case 2:
				//Llamamos al método PaswordVariable que se encuentra en la clase password
				int longitud =0;
				Password.PasswordVariable(longitud);
				break;
			case 3:
				//Creamos 1 objeto de la clase Electrodomestico y las imprimimos por pantalla
				Electrodomestico renta= new Electrodomestico(17.9, "", "", 30);
				JOptionPane.showMessageDialog(null,  renta);
				break;
			case 4:
				//Creamos 2 objetos de la clase SerieHijo y 1 objeto de la classe padre Serie
				// y las imprimimos por pantalla
				SerieHijo Strangers = new SerieHijo();
				SerieHijo Hobbit = new SerieHijo("Hobbit", "Juan");
				Serie Marvel = new Serie("Spiederman", 4,"Acción","Pablo");

				JOptionPane.showMessageDialog(null,  Strangers);
				JOptionPane.showMessageDialog(null,  Hobbit);
				JOptionPane.showMessageDialog(null,  Marvel);
				break;
			case 5:
				salir = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Números entre 1 --> 5");
			}
		}
	}
}
