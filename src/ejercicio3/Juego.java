package ejercicio3;
import java.util.Random;

public class Juego {
	
	private  int contador = 0;

	//En esta clase pongo los metodos que corresponden con las acciones del juego,como poner ficha o determinar el ganador

	public boolean ponerFicha(Tablero t, Jugadores j1, int x, int y) {

		// Aquí compruebo que las coordenadas se correspondan a la matriz y que no se
		// repita tampoco posicion

		if ((x < 0 || x > 2 || y < 0 || y > 2) || (!t.getTabla()[x][y].equals("_"))) {

			System.out.println("Coordenadas incorrectas");

			return false;

		} else {

			t.getTabla()[x][y] = j1.getFicha();

			t.imprimirTablero();

			return true;

		}
		
	}

	public boolean maquina(Tablero t,Jugadores j)	{
		
		int x;
		
		int y;
	
		Random	r  = new Random();
		
		
			
		x = r.nextInt(3);
		y = r.nextInt(3);
		
	
		
		if  (!t.getTabla()[x][y].equals("_"))	{
			
			return false;
			
			
		
		}else {
			
			t.getTabla()[x][y] = j.getFicha();
			
			t.imprimirTablero();
			
			return true;
			
		}
		
	}
		
	public boolean comprobarGanador(Tablero t, Jugadores j) {

		// ganador filas

		if (t.getTabla()[0][0].equals(j.getFicha()) && t.getTabla()[0][1].equals(j.getFicha())
				&& t.getTabla()[0][2].equals(j.getFicha())) {
			
			//lo pongo a 10 para llamarlo en el main y que me pueda sacar del bucle si gana.
			contador = 10;

			System.out.println("El Jugador "+ j.getNombre() +" ha ganado");

		} else if (t.getTabla()[1][0].equals(j.getFicha()) && t.getTabla()[1][1].equals(j.getFicha())
				&& t.getTabla()[1][2].equals(j.getFicha())) {

			contador = 10;
			
			System.out.println("El Jugador "+ j.getNombre() +" ha ganado");

		} else if (t.getTabla()[2][0].equals(j.getFicha()) && t.getTabla()[2][1].equals(j.getFicha())
				&& t.getTabla()[2][2].equals(j.getFicha())) {
			
			contador = 10;

			System.out.println("El Jugador "+ j.getNombre() +" ha ganado");

			// Columnas:
		} else if (t.getTabla()[0][0].equals(j.getFicha()) && t.getTabla()[1][0].equals(j.getFicha())
				&& t.getTabla()[2][0].equals(j.getFicha())) {
			
			contador = 10;

			System.out.println("El Jugador "+ j.getNombre() +" ha ganado");

		} else if (t.getTabla()[0][1].equals(j.getFicha()) && t.getTabla()[1][1].equals(j.getFicha())
				&& t.getTabla()[2][1].equals(j.getFicha())) {
			
			contador = 10;

			System.out.println("El Jugador "+ j.getNombre() +" ha ganado");

		} else if (t.getTabla()[0][2].equals(j.getFicha()) && t.getTabla()[1][2].equals(j.getFicha())
				&& t.getTabla()[2][2].equals(j.getFicha())) {
			
			contador = 10;

			System.out.println("El Jugador "+ j.getNombre() +" ha ganado");
			// diagonales

		} else if (t.getTabla()[0][0].equals(j.getFicha()) && t.getTabla()[1][1].equals(j.getFicha())
				&& t.getTabla()[2][2].equals(j.getFicha())) {
			
			contador = 10;

			System.out.println("El Jugador "+ j.getNombre() +" ha ganado");

		} else if (t.getTabla()[0][2].equals(j.getFicha()) && t.getTabla()[1][1].equals(j.getFicha())
				&& t.getTabla()[2][0].equals(j.getFicha())) {
			
			contador = 10;

			System.out.println("El Jugador "+ j.getNombre() +" ha ganado");

		
			
		}
		
		return false;
		
	}
	
	

	public int getContador() {
		return contador;
	}
	
	
	public void setContador(int contador) {
		this.contador = contador;
	}

}

