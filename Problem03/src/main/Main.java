/**
 * 
 */
package main;

import number.Complejo;
import number.Racional;
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

		System.out.println(vectorA.multiplicacion(3));
		System.out.println();
		
		System.out.println(vectorA.division(2));
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
		
		
		GenericVector<Racional> vectorARacional = new GenericVector<Racional>(3);
		vectorARacional.addValue(new Racional(3,4));
		vectorARacional.addValue(new Racional(3,4));
		vectorARacional.addValue(new Racional(3,4));

		System.out.println(vectorARacional);
		System.out.println();

		System.out.println(vectorARacional.multiplicacion(3));
		System.out.println();
		
		System.out.println(vectorARacional.division(2));
		System.out.println();
		
		GenericVector<Racional> vectorBRacional = new GenericVector<Racional>(3);
		vectorBRacional.addValue(new Racional(3,4));
		vectorBRacional.addValue(new Racional(3,4));
		vectorBRacional.addValue(new Racional(3,4));

		System.out.println(vectorBRacional);
		System.out.println();

		System.out.println(vectorBRacional.suma(vectorARacional));
		System.out.println();

		System.out.println(vectorBRacional.resta(vectorARacional));
		System.out.println();

	}

}
