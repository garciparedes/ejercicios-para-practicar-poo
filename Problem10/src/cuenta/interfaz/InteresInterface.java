package cuenta.interfaz;

public interface InteresInterface {
	
	/**
	 * Funcion que indica si se pueden o no
	 * cobrar los interes.
	 * 
	 */
	public abstract boolean hayInteres();

	
	/**
	 * 
	 * @requires (hayInteres())
	 */
	public void pagaInteres();
}
