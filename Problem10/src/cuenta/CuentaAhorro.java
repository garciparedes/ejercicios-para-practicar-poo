package cuenta;

/**
 * Clase que modela la representacion de una cuenta ahorro.
 * 
 * @author garciparedes
 *
 */
public class CuentaAhorro extends BaseCuentaInteres{
	
	private static int SALDO_TO_INTERES = 1000;
		
	
	/**
	 * Constructor de la clase.
	 */
	public CuentaAhorro(){
		super();
	}
	
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param intereses Interes a cobrar.
	 */
	public CuentaAhorro(float interes){
		super(interes);
	}
	
	
	/**
	 * Funcion que indica si se pueden o no
	 * cobrar los interes.
	 * 
	 * @requires ((getSaldo >=0) && (SALDO_TO_INTERES >=0))
	 */
	@Override
	public boolean hayInteres(){
		if (getSaldo() >= SALDO_TO_INTERES)
			return true;
		else
			return false;
	}

}
