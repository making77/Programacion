package ejercicio2;

import java.util.ArrayList;


public class Vector3D {

	// Atributos

	private ArrayList<Integer> a = new ArrayList<Integer>();


	

	
	public void inicializarVector(int i, int j, int k) {

		a.add(i);
		a.add(j);
		a.add(k);
		
		

	}

	public Vector3D SumarVectores(Vector3D l2) {

		Vector3D l3 = new Vector3D();

		// Compruebo que los vectores contienen numeros;

		if (a.size() > 0 && l2.a.size() > 0) {

			/*
			 * Uso dos bucles for y pongo una condicion para que cuando sus indices seas
			 * iguales se puedan sumar
			 */

			for (int x : a) {

				for (int y : l2.a) {

					if (a.indexOf(x) == (l2.a.indexOf(y))) {

						l3.a.add(a.get(a.indexOf(x)) + l2.a.get(l2.a.indexOf(y)));

					}

				}

			}

		} else {

			return null;

		}

		return l3;
	}

	public Vector3D RestarVectores(Vector3D l2) {

		Vector3D l3 = new Vector3D();
		
		if (a.size() > 0 && l2.a.size() > 0) {

			/*
			 * Uso dos bucles for y pongo una condicion para que cuando sus indices seas
			 * iguales se puedan restar
			 */
			for (int x : a) {

				for (int y : l2.a) {

					if (a.indexOf(x) == (l2.a.indexOf(y))) {

						l3.a.add(a.get(a.indexOf(x)) - l2.a.get(l2.a.indexOf(y)));

					}

				}

			}

			return l3;

		} else {

			return null;

		}

		}

	public double CalcularModulo() {

		// uso esta variable para guardar el modulo;

		double modulo = 0;

		if (a.size() > 0) {

			for (int x : a) {

				modulo += Math.pow(a.get(a.indexOf(x)), 2);

			}

			modulo = Math.sqrt(modulo);

			return modulo;

		} else {

			// retorno -1 un numero negativo como control de errores.

			return -1;

		}

	}

	public double productoEscalar(Vector3D l2) {

		// Aquí voy guardando los sumandos que voy obteniendo en los ciclos for

		double pescalar = 0;

		if (a.size() > 0 && l2.a.size() > 0) {

			for (int x : a) {

				for (int y : l2.a) {

					if (a.indexOf(x) == (l2.a.indexOf(y))) {

						pescalar += a.get(a.indexOf(x)) * l2.a.get(l2.a.indexOf(y));
					}
				}
			}

			return pescalar;

		} else {

			return Math.PI;

		}
	}

	public Vector3D productoVectorial(Vector3D l2) {
		
		Vector3D l3 = new Vector3D();

		// voy metiendo por cada coordenada del vector con la formula que esta encima.Si lo hacia dando indices al indexOf(4) 
		//y desglosaba la formula en tres partes me salia siempre Class ArrayIndexOutOfBoundsException: -1.
		
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int p4 = 0;
		int p5 = 0;
		int p6 = 0;

		
		if (a.size()>0 && l2.a.size()>0)	{
		
		for (int x : a) {

			for (int y : l2.a) {

				// (Y1*Z2(p1) - Z1*Y2(p2)i
				if (a.indexOf(x) == 1 && l2.a.indexOf(y) == 2) {

					p1 += a.get(a.indexOf(x)) * l2.a.get(l2.a.indexOf(y));

				}

				if (a.indexOf(x) == 2 && l2.a.indexOf(y) == 1) {

					p2 += a.get(a.indexOf(x)) * l2.a.get(l2.a.indexOf(y));

				}

				// (Z1*X2(p3) - X1*Z2(p4)j
				if (a.indexOf(x) == 2 && l2.a.indexOf(y) == 0) {

					p3 += a.get(a.indexOf(x)) * l2.a.get(l2.a.indexOf(y));

				}

				if (a.indexOf(x) == 0 && l2.a.indexOf(y) == 2) {

					p4 += a.get(a.indexOf(x)) * l2.a.get(l2.a.indexOf(y));

				}

				// (X1*Y2 - Y1*X2)K
				if (a.indexOf(x) == 0 && l2.a.indexOf(y) == 1) {

					p5 += a.get(a.indexOf(x)) * l2.a.get(l2.a.indexOf(y));
				}

				if (a.indexOf(x) == 1 && l2.a.indexOf(y) == 0) {

					p6 += a.get(a.indexOf(x)) * l2.a.get(l2.a.indexOf(y));
				}

			}

		}
		
		l3.a.add(p1- p2);

		l3.a.add(p3 - p4);

		l3.a.add(p5 - p6);
		
		}else {
			
			return null;
		}

		return l3;

	}
	
	
	@Override
	public String toString() {//Hago lo mismo que en el ejercicio anterior

		if (a.size()>0)	{
		
		
		String s = "<";

		for (Integer conj : a) {
			
				s += conj + ",";
				
		}
		
		s = s.substring(0, s.length() - 1);

		s += ">";

		return s;

		}else {
			
			return null;
		}
		
	}

}
