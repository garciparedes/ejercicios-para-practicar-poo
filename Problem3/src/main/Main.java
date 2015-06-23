/**
 * 
 */
package main;

import number.Complejo;
import vector.GenericVector;

/**
 * @author garciparedes
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericVector<Complejo> vectorA = new GenericVector<Complejo>(3);
		vectorA.addValue(new Complejo(3,4));
		vectorA.addValue(new Complejo(3,4));
		vectorA.addValue(new Complejo(3,4));

		System.out.println(vectorA);
		System.out.println();

		
		GenericVector<Complejo> vectorB = new GenericVector<Complejo>(3);
		vectorB.addValue(new Complejo(3,4));
		vectorB.addValue(new Complejo(3,4));
		vectorB.addValue(new Complejo(3,4));

		System.out.println(vectorB);
		System.out.println();

		System.out.println(vectorB.suma(vectorA));
		System.out.println();

		System.out.println(vectorB.resta(vectorA));
		System.out.println();

	}

}
