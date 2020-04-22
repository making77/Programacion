package ejercicio3;

import java.util.Scanner;

public class Partida {

	public static void main(String[] args) {

		int pos1;

		int pos2;
		
		int opcion;

		String volverjugar;
		

		Tablero t = new Tablero();

		Jugadores j1 = new Jugadores("jugaor 1", "X");
		Jugadores j2 = new Jugadores("jugaor 2", "O");
		Jugadores cpu = new Jugadores("cpu","O");

		Juego jogo = new Juego();

		Scanner mk = new Scanner(System.in);
		
		
		
		do	{
		
		System.out.println("--Menu--");
		System.out.println("--------");
		System.out.println("1.Jugar con amigos");
		System.out.println("2.Jugar vs cpu");
		System.out.println("3.Salir");
			
			
		opcion=mk.nextInt();
		
		switch(opcion)	{
		
		case 1:
		
		do { // Este primer do es para que de la opcion de repetir partida.

			// este contador lo utilizare para contar los turnos,lo emplearé dentro de un
			// setter para modificar el contador que tengo en el metodo juego.

			int contador = 0;

			System.out.println("Comienza la partida");

			System.out.println(" ");
			t.iniciarTablero();
			t.imprimirTablero();

			do { // este segundo es para que se repitan los turnos y se pueda salir cuando hay un
					// ganador o empate

				do { // este es como control de errores. hay un do por cada jugador.

					System.out.println(" ");
					System.out.println("Jugador 1: Te toca porner fila y columna\n");
					System.out.println("Fila");
					pos1 = mk.nextInt();
					System.out.println("Columna");
					pos2 = mk.nextInt();

				} while (jogo.ponerFicha(t, j1, pos1, pos2) == false); // Aqui si las coordenadas son erroneas o
																		// contiene ficha hace que se repita
																		// sino coloca una ficha.

				jogo.setContador(contador++);

				// Aquí compruebo que se si se han gastado todos lo movimientos.lo hago aquí
				// porque siempre va a ser el jugador uno el que acabe,estoy modificando el
				// contador de la clase juego,
				//

				if (jogo.comprobarGanador(t, j1) == true) {

					// Aquí lo que hago es coger el contador a 10 para que me saque del bucle.
					jogo.getContador();

				

				}else if (contador == 9) {

					System.out.println("Empate");

				}
				
				if (jogo.getContador() < 8) { // pongo esta condición para que se salte su turno si se ha finalizado el
												// juego
												// por victoria o empate

					do {

						System.out.println(" ");
						System.out.println("Jugador 2: Te toca porner fila y columna\n");
						System.out.println("Fila");
						pos1 = mk.nextInt();
						System.out.println("Columna");
						pos2 = mk.nextInt();

					} while (jogo.ponerFicha(t, j2, pos1, pos2) == false);

					jogo.setContador(contador++);

					if (jogo.comprobarGanador(t, j2) == true) {

						jogo.getContador();

					}

				}

			} while (jogo.getContador() < 8);

			System.out.println(" ");

			System.out.println("¿Desean volver a juagar? NO/SI(Pulse cualquier tecla)");

			mk.nextLine();

			volverjugar = mk.nextLine();

		} while (!volverjugar.equals("NO"));
		
		break;
		
		
		case 2:
			
			
			
			do { 

				int contador = 0;

				System.out.println("Comienza la partida");

				System.out.println(" ");
				t.iniciarTablero();
				t.imprimirTablero();

				do { 

					do { 

						System.out.println(" ");
						System.out.println("Jugador 1: Te toca porner fila y columna\n");
						System.out.println("Fila");
						pos1 = mk.nextInt();
						System.out.println("Columna");
						pos2 = mk.nextInt();

					} while (jogo.ponerFicha(t, j1, pos1, pos2) == false); 

					jogo.setContador(contador++);

					
					if (jogo.comprobarGanador(t, j1) == true) {

						jogo.getContador();

					
					}else if (contador == 9) {

						System.out.println("Empate");

					}
					
					if (jogo.getContador() < 8) { 

							System.out.println("La cpu pone ficha");
							
						do {
							
							
						} while (jogo.maquina(t,cpu) == false);

						jogo.setContador(contador++);

						if (jogo.comprobarGanador(t, cpu) == true) {

							jogo.getContador();

						}

					}

				} while (jogo.getContador() < 8);

				System.out.println(" ");

				System.out.println("¿Desean volver a juagar? NO/SI(Pulse cualquier tecla)");

				mk.nextLine();

				volverjugar = mk.nextLine();

			} while (!volverjugar.equals("NO"));
			
			
		break;
		
		case 3:
			
			System.out.println("Bye Bye");
			
			break;
			
			
		default :
			
			System.out.println("Opción incorrecta");
		}	

		
		
		}while(opcion !=3);
		
		
		mk.close();
	}

}
