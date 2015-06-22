/**
 * 
 */
package main;

import conjunto.Conjunto;

/**
 * @author garciparedes
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conjunto<Integer> conjuntoA = new Conjunto<Integer>();
		System.out.println("Se crea conjunto A: "+ conjuntoA);

		conjuntoA.agrega(1);
		conjuntoA.agrega(2);
		conjuntoA.agrega(3);
		System.out.println("Se añade 1,2,3 a conjunto A: " + conjuntoA);
		
		conjuntoA.agrega(1);
		conjuntoA.elimina(2);
		conjuntoA.agrega(3);
		System.out.println("Se añade 1,3 y se borra 2 a conjunto A: " + conjuntoA);
		

		Conjunto<Integer> conjuntoB = new Conjunto<Integer>(2,3,4,5,6);
		System.out.println("Se crea conjunto B con 2,3,4,5,6: " + conjuntoB);
		
		System.out.println("Se comprueba si esta 2 en conjunto A: " + conjuntoA.esta(2));
		System.out.println("Se comprueba si esta 3 en conjunto A: " + conjuntoA.esta(3));
		

		//Conjunto<Integer> conjuntoUnion = conjuntoA.union(conjuntoB);
		Conjunto<Integer> conjuntoUnion = Conjunto.union(conjuntoA, conjuntoB);
		System.out.println("Se crea conjunto Union de A y B: " + conjuntoUnion);

		//Conjunto<Integer> conjuntoInterseccion = conjuntoA.interseccion(conjuntoB);
		Conjunto<Integer> conjuntoInterseccion = Conjunto.interseccion(conjuntoA, conjuntoB);
		System.out.println("Se crea conjunto Interseccion de A y B: " + conjuntoInterseccion);
	}

}
