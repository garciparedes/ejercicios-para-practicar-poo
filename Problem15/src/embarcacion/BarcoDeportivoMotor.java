package embarcacion;

/**
 * Clase BarcoDeportivoMotor. Es la clase que representa los
 * barcos deportivos de motor dentro del sistema.
 * 
 * @author garciparedes
 *
 */
public class BarcoDeportivoMotor extends Barco{

	
	private int cv;
	
	/**
	 * Constructor de la clase BarcoDeportivoMotor.
	 * 
	 * @param matricula Matricula de la embarcacion deportiva.
	 * @param eslora Eslora medida en metros que tiene la embarcacion deportiva.
	 * @param fabricacionYear Año de fabricacion de la embarcacion deportiva.
	 * @param cv Numero de caballos de vapor que tiene la embarcacion deportiva.
	 */
	public BarcoDeportivoMotor(String matricula, int eslora, int fabricacionYear
			, int cv) {
		super(matricula, eslora, fabricacionYear);

		assert(cv > 0);
		this.cv = cv;
	}
	
	/**
	 * Setter de cv.
	 * 
	 * @param cv Numero de caballos de vapor que tiene la embarcacion deportiva.
	 */
	public void setCamarotes(int cv){
		assert(cv > 0);
		this.cv = cv;
	}
	
	
	/**
	 * Getter de cv
	 * 
	 * @return cv Numero de caballos de vapor que tiene la embarcacion deportiva.
	 */
	public int getCamarotes(){
		return cv;
	}
	
	/**
	 * Funcion encargada de calcular el precio
	 * diario por amarrar la embarcacion
	 * deportiva a motor en regimen
	 * de alquiler.
	 * 
	 * @return precioAlquiler Precio de alquiler de amarre diario.
	 */
	@Override
	public double getPrecioAlquiler(){
		return super.getPrecioAlquiler()+getCamarotes();
	}

}
