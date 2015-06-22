package number;

/**
 * Clase que modela numeros complejos.
 * Consta de métodos tanto para sumar y restar
 * como para obtener su modulo y angulo.
 * 
 * @author garciparedes
 *
 */
public class Complejo {
	
	private static final int SQUARE = 2;
	
	private static final String IMAGINARY = "i";
	private static final String PLUS = " + ";

	
	private double real;
	private double imaginario;
	
	
	/**
	 * Constructor de la clase.
	 * 
	 */
	public Complejo(){
		this.real = 0.0;
		this.imaginario = 0.0;
	}
	
	
	/**
	 * Constructor de la clase que inicializa los valores.
	 * 
	 * @param real double que representa la parte real del numero complejo.
	 * @param imaginario double que representa la parte imaginaria del numero complejo.
	 */
	public Complejo(double real, double imaginario){		
		this.real = real;
		this.imaginario = imaginario;
	}
	
	
	/**
	 * Setter de real.
	 * 
	 * @param real double que representa la parte real del numero complejo.
	 */
	public void setReal(double real){
		this.real = real;
	}
	
	
	/**
	 * Setter de imaginario.
	 * 
	 * @param imaginario double que representa la parte imaginaria del numero complejo.
	 */
	public void setImaginario(double imaginario){
		this.imaginario = imaginario;
	}	

	
	/**
	 * Getter de real.
	 * 
	 * @return double que representa la parte real del numero complejo.
	 */
	public double getReal() {
		return real;
	}
	
	
	/**
	 * Getter de imaginario.
	 * 
	 * @return double que representa la parte imaginaria del numero complejo.
	 */
	public double getImaginario() {
		return imaginario;
	}
	
	
	/**
	 * Funcion que suma el objecto Complejo invocante
	 * junto con complejoB.
	 * 
	 * @param complejoB Segundo Complejo a sumar.
	 * @return Complejo con el valor de la suma del invocante + complejoB.
	 */
	public Complejo suma(Complejo complejoB){
		Complejo complejo = new Complejo();
		
		complejo.setReal(getReal() + complejoB.getReal());
		complejo.setImaginario(getImaginario() + complejoB.getImaginario());

		return complejo;
	}
	

	/**
	 * Funcion que resta el objecto Complejo invocante
	 * junto con complejoB.
	 * 
	 * @param complejoB Segundo Complejo a restar.
	 * @return Complejo con el valor de la restar del invocante + complejoB.
	 */
	public Complejo resta(Complejo complejoB){
		Complejo complejo = new Complejo();
		
		complejo.setReal(getReal() - complejoB.getReal());
		complejo.setImaginario(getImaginario() - complejoB.getImaginario());

		return complejo;
	}
	
	
	/**
	 * Funcion que devuelve el modulo de Complejo.
	 * 
	 * @return double modulo.
	 */
	public double getModulo(){
		return Math.sqrt(
				Math.pow(real, SQUARE) 
				+ Math.pow(imaginario, SQUARE)
		);
	}
	
	
	/**
	 * Funcion que devuelve el angulo de Complejo.
	 * 
	 * @return double angulo.
	 */
	public double getAngulo(){
		return Math.atan2(getImaginario(), getReal());
	}
	
	
	/**
     * Metodo que sobreescribe el metodo toString() de la clase <code>Object</code>.
     *
     * Devuelve una cadena de caracteres.
     *
     * @return String con el contenido de <code>Conjunto</code>.
     */
	@Override
	public String toString(){
		return (real + PLUS + imaginario + IMAGINARY) ;	
	}

}
