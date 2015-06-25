package cuenta;

public class CuentaCredito extends Cuenta implements ComisionInterface{

	private static float COMISION = 35;
	
	
	private float saldoMinimoNegativo;
	
	
	/**
	 * Constructor de la clase.
	 */
	public CuentaCredito(){
		super();
		this.saldoMinimoNegativo = 0;
	}
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param saldoMinimoNegativo float
	 */
	public CuentaCredito(int saldoMinimoNegativo){
		super();
		this.saldoMinimoNegativo = saldoMinimoNegativo;
	}
	
	
	
	/**
	 * Setter de saldoMinimoNegativo.
	 * 
	 * @param saldoMinimoNegativo
	 * 
	 * @requires (saldoMinimoNegativo <= 0) 
	 */
	public void setSaldoMinimoNegativo(float saldoMinimoNegativo){
		this.saldoMinimoNegativo = saldoMinimoNegativo;
	}
	
	
	/**
	 * Getter de saldoMinimoNegativo.
	 * 
	 * @return saldoMinimoNegativo
	 */
	public float getSaldoMinimoNegativo(){
		return saldoMinimoNegativo;
	}
	
	
	
	/**
	 * Procedimiento para sacar dinero de la cuenta
	 * 
	 * @param saldoMinimoNegativo
	 * 
	 * @requires (cantidad >= saldoMinimoNegativo 
	 *			&& getSaldo()-cantidad >= getSaldoMinimoNegativo()) 
	 *
	 */
	@Override
	public void reintegro(float cantidad) {}
	
	
	/**
	 * Procedimiento con el cual el banco cobra la comision mensual.
	 * 
	 * @requires (getSaldo()-COMISION >= saldoMinimoNegativo) 
	 *
	 */
	@Override
	public void cobraComision(){
		reintegro(COMISION);	
	}
}
