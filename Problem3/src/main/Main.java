/**
 * 
 */
package main;

import number.Complejo;
import vector.MyVector;

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

		MyVector<Complejo> vectorA = new MyVector<Complejo>(3);
		vectorA.addValue(new Complejo(3,4));
		vectorA.addValue(new Complejo(3,4));
		vectorA.addValue(new Complejo(3,4));

		System.out.println(vectorA);
		System.out.println();

		
		MyVector<Complejo> vectorB = new MyVector<Complejo>(3);
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
