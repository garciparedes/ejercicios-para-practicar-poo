package embarcacion;

/**
 * Clase Velero. Es la clase que representa
 * los veleros dentro del sistema.
 * 
 * @author garciparedes
 *
 */
public class Velero extends Barco{

	private int mastiles;
	
	/**
	 * Constructor de la clase Velero.
	 * 
	 * @param matricula Matricula del velero.
	 * @param eslora Eslora medida en metros que tiene el velero.
	 * @param fabricacionYear Año de fabricacion del velero.
	 * @param mastiles Numero de mastiles que tiene el velero.
	 */
	public Velero(String matricula, int eslora, int fabricacionYear
			, int mastiles) {
		super(matricula, eslora, fabricacionYear);

		assert(mastiles > 0);
		this.mastiles = mastiles;
	}
	
	/**
	 * Setter de mastiles.
	 * 
	 * @param mastiles Numero de mastiles que tiene el velero.
	 */
	public void setMastiles(int mastiles){
		assert(mastiles > 0);
		this.mastiles = mastiles;
	}
	
	
	/**
	 * Getter de mastiles
	 * 
	 * @return mastiles Numero de mastiles que tiene el velero.
	 */
	public int getMastiles(){
		return mastiles;
	}
	
	/**
	 * Funcion encargada de calcular el precio
	 * diario por amarrar el velero en regimen
	 * de alquiler.
	 * 
	 * @return precioAlquiler Precio de alquiler de amarre diario.
	 */
	@Override
	public double getPrecioAlquiler(){
		return super.getPrecioAlquiler()+getMastiles();
	}

}
