package empleado.rol;

import java.util.GregorianCalendar;


/**
 * Clase que modela a el rol de sueldo
 * de caracter fijo.
 * 
 * @author garciparedes
 *
 */
public class RolSueldoFijo extends BaseRolSueldoMensual{

	private double complemento;

	
	/**
	 * Constructor de la clase RolSueldoFijo.
	 * 
	 * @param sueldo Sueldo base del empleado.
	 * @param fechaAlta Fecha de alta del empleado.
	 * @param complemento Complemento que cobra el empleado segun los años que lleve contratado.
	 * 
	 */
	public RolSueldoFijo(double sueldo, GregorianCalendar fechaAlta, double complemento){
		super(sueldo, fechaAlta);
		
		assert(complemento > 0);		
		this.complemento = complemento;
	}
	

	
	/**
	 * Setter de complemento.
	 * 
	 * @param complemento Double.
	 */
	public void setComplemento(double complemento){
		assert(complemento > 0);	
		this.complemento = complemento;
	}
	
	
	/**
	 * Getter de complemento.
	 * 
	 * @return complemento Double.
	 */
	public double getComplemento(){
		return complemento;
	}
	
	
	/**
	 * Funcion que devuelve el numero de 
	 * años que el Empleado lleva
	 * trabajando en la empresa.
	 * 
	 * @return contractedYears Integer.
	 */
	public int getContractedYears(){
		return (getFechaAlta().get(GregorianCalendar.YEAR)
				-GregorianCalendar.getInstance().get(GregorianCalendar.YEAR)
		);
	}
	
	
	/**
	 * Funcion que calcula el sueldo
	 * extra que le corresponde al Empleado.
	 * 
	 * @return sueldoExtra Double.
	 */
	public double getSueldoExtra(){
		return getComplemento()*getContractedYears();
	}
	
	
	/**
	 * Getter de sueldo
	 * 
	 * @return sueldo Double.
	 */
	@Override
	public double getSueldo() {
		return super.getSueldo() + complemento;
	}
}
