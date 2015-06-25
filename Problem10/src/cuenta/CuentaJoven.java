package cuenta;

public class CuentaJoven extends BaseCuentaInteres{
	
	public static int MAX_JOVEN_EDAD = 25;
	
	
	/*
	 * Constructor de la clase.
	 */
	public CuentaJoven(){
		super();
	}
	
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param interes Intereses a cobrar.
	 */
	public CuentaJoven(float interes){
		super(interes);
	}

	/**
	 * Funcion que indica si se accede
	 * al cobro de interes o no.
	 * 
	 * @requires(getTitular() != null)
	 */
	@Override
	public boolean hayInteres() {
		if (getTitular().getEdad() < 25)
			return true;
		else
			return false;
	}
	
	/**
	** @requires (cantidad >=0) **/
	@Override
	public void reintegro(float cantidad) {}
	
}
