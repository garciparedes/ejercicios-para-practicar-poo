package cuenta;

import cuenta.interfaz.InteresInterface;

public abstract class BaseCuentaInteres extends Cuenta implements InteresInterface{
		
	private float interes;
	
	
	/**
	 * Constructor de la clase.
	 */
	public BaseCuentaInteres(){
		super();
		this.interes = 0;
	}
	
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param intereses Interes a cobrar.
	 */
	public BaseCuentaInteres(float interes){
		super();
		this.interes = interes;
	}
	
	
	/**
	 * Setter de interes.
	 * 
	 * @param intereses Interes a cobrar.
	 */
	public void setInteres(float interes){
		this.interes = interes;
	}
	
	
	/**
	 * Getter de interes.
	 * 
	 * @return interes
	 */
	public float getInteres(){
		return interes;
	}
	
	
	/**
	 * 
	 * @requires ((getInteres() >=0) && hayInteres())
	 */
	@Override
	public void pagaInteres(){
		ingreso(getInteres());
	}
}
