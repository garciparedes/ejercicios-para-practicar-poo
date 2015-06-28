package embarcacion;

/**
 * Clase YateLujo. Es la clase que representa los
 * yates de lujo dentro del sistema.
 * 
 * @author garciparedes
 *
 */
public class YateLujo extends BarcoDeportivoMotor{

	private int camarotes;
	
	/**
	 * Constructor de la clase YateLujo.
	 * 
	 * @param matricula Matricula del yate de lujo.
	 * @param eslora Eslora medida en metros que tiene del yate de lujo.
	 * @param fabricacionYear Año de fabricacion del yate de lujoa.
	 * @param cv Numero de cavallos de vapor que tiene el yate de lujo.
	 * @param camarotes Numero de camarotes que tiene el yate de lujo.
	 */
	public YateLujo(String matricula, int eslora, int fabricacionYear
			, int cv, int camarotes) {
		super(matricula, eslora, fabricacionYear, cv);

		assert(camarotes > 0);
		this.camarotes = camarotes;
	}
	
	/**
	 * Setter de camarotes.
	 * 
	 * @param camarotes Numero de camarotes que tiene el yate de lujo.
	 */
	public void setCamarotes(int camarotes){
		assert(camarotes > 0);
		this.camarotes = camarotes;
	}
	
	
	/**
	 * Getter de camarotes
	 * 
	 * @return camarotes Numero de camarotes que tiene el yate de lujo.
	 */
	public int getCamarotes(){
		return camarotes;
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
