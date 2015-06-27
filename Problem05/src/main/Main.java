/**
 * 
 */
package main;

import number.Racional;

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
		Racional racionalA = new Racional(3,2);
		racionalA.setDenominador(3);

		Racional racionalB = new Racional(4);
		//Racional racionalC = new Racional(2,0);
		//racionalA.setDenominador(1);

		System.out.println(racionalA.multiplicar(racionalB));
		System.out.println(racionalA.sumar(racionalB));

	}

}
