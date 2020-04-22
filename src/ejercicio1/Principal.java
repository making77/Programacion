package ejercicio1;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		int opcion;

		Scanner mk = new Scanner(System.in);

		Conjunto1 l = new Conjunto1();
		Conjunto1 l2 = new Conjunto1();
		Conjunto1 l3 = new Conjunto1();

		do {

			System.out.println("---Menu---");
			System.out.println("----------");
			System.out.println("1.Añadir elemento al conjunto");
			System.out.println("2.Eliminar elemento del conjunto");
			System.out.println("3.Union de conjuntos");
			System.out.println("4.Intersección de conjuntos");
			System.out.println("5.Diferencia de conjuntos");
			System.out.println("6.Comprobar si un elemento pertenece a un conjunto");
			System.out.println("7.Comprobar si un elemento es subconjunto de otro");
			System.out.println("8.Comprobar si dos conjuntos son iguales ");
			System.out.println("9.imprimir un conjunto");
			System.out.println("10.Salir");
			System.out.println(" ");

			opcion = mk.nextInt();

			switch (opcion) {

			case 1:
				// aprovecho el metodo añadir numero para introducir los numeros.

				l.añadirNumero(9);
				l.añadirNumero(4);
				l.añadirNumero(80);
				l.añadirNumero(20);
				System.out.println("------------");
				l2.añadirNumero(5);
				l2.añadirNumero(6);
				l2.añadirNumero(4);
				l2.añadirNumero(9);

				System.out.println("El conjunto 1 es: " + l);
				System.out.println(" ");
				System.out.println("El conjunto 2 es: " + l2);

				break;

			case 2:

				l.borrarNumero(20);

				break;

			case 3:

				if (l.unionConjunto(l2) == null) {

					System.out.println("Primero introduzca los conjuntos");

				} else {

					l3 = l.unionConjunto(l2);// Los hago asi para poder guardar la union de conjuntos en un nuevo
												// conjunto l3.
												// l3 es el vector que me devolverá el método.
					System.out.println(l3);

				}

				break;

			case 4:

				if (l.interseccionConjunto(l2) == null) {

					System.out.println("Tiene que introducir dos conjuntos");

				} else {

					l3 = l.interseccionConjunto(l2);

					System.out.println(l3);

				}

				break;

			case 5:

				if (l.diferenciaConjuntos(l2) == null) {

					System.out.println("No se puede realizar la diferencia de conjuntos");

				} else {

					l3 = l.diferenciaConjuntos(l2);

					System.out.println(l3);

				}

				break;

			case 6:

				l.comprobarNumero(77);

				break;

			case 7:

				if (l.comprobarSub(l2) == -1) {

					System.out.println("No es subconjunto " + l + " de " + l2);

				} else if (l.comprobarSub(l2) == -2) {

					System.out.println("Tienes que añadir los conjuntos");

				} else {

					System.out.println("Es subconjunto " + l + " de " + l2);

				}

				break;

			case 8:

				l.sonIguales(l2);

				break;

			case 9:

				if (l.toString() == null) {

					System.out.println("Deber introducir al menos un conjunto");

				} else {

					System.out.println(l);
				}

				break;

			case 10:

				System.out.println("bye bye");

				break;

			default:

				System.out.println("Numero incorrecto");

			}

		} while (opcion != 10);
		
		
		mk.close();
	}

	
}
