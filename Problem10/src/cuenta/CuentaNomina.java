package cuenta;

public class CuentaNomina extends BaseCuentaInteres implements ComisionInterface{

	private static float COMISION = 35;
	
	private float importeNomina;
	
	
	/**
	 * Constructor de la clase.
	 */
	public CuentaNomina(){
		super();
	}
	
	
	/***
	 * Constructor de la clase.
	 * @param interes Interes a Cobrar.
	 * @param importeNomina Importe de la nomina.
	 */
	public CuentaNomina(float interes, int importeNomina){
		super(interes);
		this.importeNomina = importeNomina;
	}
	
	
	/**
	 * Setter del importe de la nomina.
	 * 
	 * @param importeNomina
	 */
	public void setImporteNomina(float importeNomina){
		this.importeNomina = importeNomina;
	}
	
	
	/**
	 * Getter del importe de la nomina.
	 * @return importeNomina
	 */
	public float getImporteNomina(){
		return importeNomina;
	}
	
	
	/**
	 * Implementacion del metodo hayinteres()
	 * que esta declarado en la interface InteresInterface.
	 * 
	 */
	@Override
	public boolean hayInteres() {
		if (getSaldo() >= 0)
			return true;
		else
			return false;
	}
	
	

	/**
	** @requires (cantidad >=0 && (getSaldo() + getImporteNomina()-cantidad>=0) )
	***/
	@Override
	public void reintegro(float cantidad) {}


	@Override
	public void cobraComision() {
		reintegro(COMISION);		
	}
	
}
