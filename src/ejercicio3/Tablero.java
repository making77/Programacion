package ejercicio3;


public class Tablero {

	// Atributos

	private String[][] tabla;

	
	// Metodos.

	public Tablero() {

		tabla = new String[3][3];

	}

	public void iniciarTablero() {

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[0].length; j++) {

				tabla[i][j] = "_";

			}

		}

	}

	public void imprimirTablero() {
		

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[0].length; j++) {

				System.out.print(tabla[i][j] + " ");

			}

			System.out.println(" ");

		}

	}

		
	

	public String[][] getTabla() {
		
		return tabla;
	}
	
	
	
	
	
	
	
}