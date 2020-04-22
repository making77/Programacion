package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Conjunto1 {

	// atributos

	private ArrayList<Integer> c = new ArrayList<Integer>();

	// metodos

	public void añadirNumero(int x) {

		if (!c.contains(x)) {

			c.add(x);

		} else {

			System.out.println("El numero " + x + " ya esta en el conjunto");

		}

	}

	public void borrarNumero(int x) {

		if (c.size() > 0) {

			if (c.contains(x)) {

				c.remove(c.get(c.indexOf(x)));

				System.out.println("Se ha borrado el número " + x + " del conjunto" + c);

			} else {

				System.out.println("El numero " + x + " no esta en el conjunto " + c);

			}

		}else {
			
			System.out.println("Debe introducir un conjunto al menos");
		}

	}

	public Conjunto1 unionConjunto(Conjunto1 l2) {

		Conjunto1 l3 = new Conjunto1();

		if (c.size() > 0 || l2.c.size() > 0) {

			for (int x : c) {

				l3.añadirNumero(x);

			}

			for (int x : l2.c) {

				if (!l3.c.contains(x)) {

					l3.añadirNumero(x);

				}
			}

		} else {

			return null;
		}

		return l3;

	}

	public Conjunto1 interseccionConjunto(Conjunto1 l2) {

		Conjunto1 l3 = new Conjunto1();

		if (c.size() > 0 && l2.c.size() > 0) {

			for (int x : c) {

				if (l2.c.contains(x)) {

					l3.añadirNumero(x);
				}

			}

		} else {

			return null;
		}

		return l3;

	}

	public Conjunto1 diferenciaConjuntos(Conjunto1 l2) {

		Conjunto1 l3 = new Conjunto1();

		Collections.sort(c); /**
								 * uso este sort porque quiero ordenar los conjuntos y ver si son iguales,no se
								 * puede hacer la difeencia de conjuntos de dos conjuntos iguales
								 **/
		Collections.sort(l2.c);

		if (c.size() > 0 && !c.equals(l2.c)) {

			for (int x : c) {

				if (!l2.c.contains(x)) {

					l3.añadirNumero(x);

				}

			}

		} else {

			return null;
		}

		return l3;

	}

	public void comprobarNumero(int x) {

		if (c.contains(x)) {

			System.out.println("El numero " + x + " está en el conjunto");

		} else if (c.size() == 0) {

			System.out.println("Debe introducir un conjunto");

		} else {

			System.out.println("No esta el numero ");

		}

	}

	public int comprobarSub(Conjunto1 l2) {//he usado int como parametro a retornar porque con el for y usando un void no podia poner un Systemout
											//que me escribiera que son conjunto.Me lo repetiría constantemente
						

		if (c.size() > 0 && l2.c.size() > 0) {

			for (int x : c) {

				if (!l2.c.contains(x)) {//si encuentra algun numero que rompra la condicion de subconjunto

					return -1;

				}

			}

		} else {//control de errores si no hay conjuntos

			return -2;
		}
		//si se cumple que son subconjuntos
		return 1;

	}

	public void sonIguales(Conjunto1 l2) {

		// uso collections sort para ordenar las listas y poder ver si son iguales

		Collections.sort(c);

		Collections.sort(l2.c);

		if (c.size() > 0 && l2.c.size() > 0) {

			if (c.equals(l2.c)) {

				System.out.println("El conjunto " + c + "y el conjunto " + l2 + " son igueles");

			} else {

				System.out.println("El conjunto " + c + " y el conjunto " + l2 + "  no son igueles");

			}

		} else {

			System.out.println("Tienes que introducir los conjuntos");

		}

	}

	@Override
	public String toString() {

		if (c.size() > 0) {

			String s = "{"; // no escribo nada aqui, lo hago en el main para poder diferenciar que conjunto
							// se imprime
			for (Integer conj : c) {

				s += "el " + conj + ", ";

			}
			// esto lo hago para eliminar el hueco vacio y la coma final
			s = s.substring(0, s.length() - 2);

			s += "}";

			return s;

		}else {
			
			return null;
		}
	}
}
