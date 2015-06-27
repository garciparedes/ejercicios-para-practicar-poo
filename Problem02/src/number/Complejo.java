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
	private double imag;
	
	
	/**
	 * Constructor de la clase.
	 * 
	 */
	public Complejo(){
		this.real = 0.0;
		this.imag = 0.0;
	}
	
	
	/**
	 * Constructor de la clase que inicializa los valores.
	 * 
	 * @param real double que representa la parte real del numero complejo.
	 * @param imaginario double que representa la parte imaginaria del numero complejo.
	 */
	public Complejo(double real, double imaginario){		
		this.real = real;
		this.imag = imaginario;
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
	 * @param imag double que representa la parte imaginaria del numero complejo.
	 */
	public void setImag(double imag){
		this.imag = imag;
	}	
	
	
	/**
	 * 
	 * Procedimiento que genera el conjugado,
	 * es decir, cambia el signo de la parte
	 * imaginaria de <code>Complejo</code>
	 * 
	 */
	public void conjugar () { 
	    imag = -imag; 
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
	public double getImag() {
		return imag;
	}
	
	
	/**
	 * Funcion que suma el objecto Complejo invocante
	 * junto con complex.
	 * 
	 * @param complex Segundo Complejo a sumar.
	 * @return Complejo con el valor de la suma del invocante + complex.
	 */
	public Complejo suma(Complejo complex){
		Complejo result = new Complejo();
		
		result.setReal(getReal() + complex.getReal());
		result.setImag(getImag() + complex.getImag());

		return result;
	}
	

	/**
	 * Funcion que resta el objecto Complejo invocante
	 * junto con complex.
	 * 
	 * @param complex Segundo Complejo a restar.
	 * @return Complejo con el valor de la restar del invocante - complex.
	 */
	public Complejo resta(Complejo complex){
		Complejo result = new Complejo();
		
		result.setReal(getReal() - complex.getReal());
		result.setImag(getImag() - complex.getImag());

		return result;
	}
	
	
	/**
	 * Funcion que devuelve el modulo de Complejo.
	 * 
	 * @return double modulo.
	 */
	public double getModulo(){
		return Math.sqrt(
				Math.pow(real, SQUARE) 
				+ Math.pow(imag, SQUARE)
		);
	}
	
	
	/**
	 * Funcion que devuelve el angulo de Complejo.
	 * 
	 * @return double angulo.
	 */
	public double getAngulo(){
		return Math.atan2(getImag(), getReal());
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
		return (real + PLUS + imag + IMAGINARY) ;	
	}

}
