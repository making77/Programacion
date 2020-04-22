package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner mk = new Scanner(System.in);

		Vector3D l = new Vector3D();
		Vector3D l2 = new Vector3D();
		Vector3D l3 = new Vector3D();

		int opcion;

		do {

			System.out.println("--Menú---");
			System.out.println("---------");
			System.out.println("1.Inicializar vector");
			System.out.println("2.Suma de vectores");
			System.out.println("3.Resta de vectores");
			System.out.println("4.Calcular módulo de un vector");
			System.out.println("5.Producto escalar de dos vectores");
			System.out.println("6.Producto vectorial de dos vectores");
			System.out.println("7.Imprimir un vector");
			System.out.println("8.Salir");
			System.out.println("");

			opcion = mk.nextInt();

			switch (opcion) {

			case 1:
				// Inicializo aquí dos para que los puedas ver, por pantalla
				l.inicializarVector(1, 2, 3);
				l2.inicializarVector(9, 6, 7);

				System.out.println(l);
				System.out.println(" ");
				System.out.println(l2);

				break;

			case 2:
				
				if (l.SumarVectores(l2) == null) {

					System.out.println("Debe inicializar los vectores");

				} else {

					l3 = l.SumarVectores(l2);// quiero que me muestre la suma en un vector v3,que me retornará del
												// metodo

					System.out.println(l3);

				}

				break;

			case 3:

				if (l.RestarVectores(l2) == null) {

					System.out.println("Debe inicializar los vectores");

				} else {

					l3 = l.RestarVectores(l2);

					System.out.println(l3);
				}

				break;

			case 4:

				if (l.CalcularModulo() == -1) {

					System.out.println("Debe introducir al menos un vector");

				} else {

					System.out.println("El modulo es " + l.CalcularModulo());

				}

				break;

			case 5:

				if (l.productoEscalar(l2) == Math.PI) {

					System.out.println("Debe introducir dos vectores");

				} else {

					System.out.println("El producto escalar es: " + l.productoEscalar(l2));
				}

				break;

			case 6:

				if (l.productoVectorial(l2) == null) {

					System.out.println("Introduzca dos vectores");

				} else {

					l3 = l.productoVectorial(l2);

					System.out.println(" El producto vectorial es: " + l3);
				}

				break;

			case 7:

				if (l.toString() == null) {

					System.out.println("Debe introducir un conjunto");
				} else {

					System.out.println(l);
				}

				break;

			case 8:

				System.out.println("Bye bye");

				break;

			default:

				System.out.println("Opción incorrecta");

			}

		} while (opcion != 8);

	}

}
