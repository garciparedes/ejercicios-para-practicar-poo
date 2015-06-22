/**
 * 
 */
package main;

import number.Complejo;

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

		Complejo complejoA = new Complejo(2,2);
		System.out.println("Complejo A: " + complejoA);
		System.out.println("Modulo de Complejo A: " + complejoA.getModulo());
		System.out.println("Angulo de Complejo A: " + complejoA.getAngulo());

		Complejo complejoB = new Complejo(2,3);
		System.out.println("Complejo B: " + complejoB);

		
		Complejo complejoSuma = complejoA.suma(complejoB);
		System.out.println("Suma de Complejo A + B: " + complejoSuma);
	
		Complejo complejoResta = complejoA.resta(complejoB);
		System.out.println("Resta de Complejo A - B: " +complejoResta);
		

	}

}
