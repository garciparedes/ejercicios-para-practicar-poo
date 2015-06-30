/**
 * 
 */
package empleado;


import java.util.Calendar;

import calendar.MyGregorianCalendar;

/**
 * Clase que modela a los empleados
 * de caracter fijo.
 * @author garciparedes
 *
 */
public class EmpleadoFijo extends BaseEmpleadoMensual {

	private double complemento;
	
	/**
	 * Constructor de la clase Empleado.
	 * 
	 * @param nombre Nombre del empleado.
	 * @param edad Edad del empleado en años.
	 * @param nif NIF del empleado.
	 * @param sueldo Sueldo base del empleado.
	 * @param fechaAlta Fecha de alta del empleado.
	 * @param complemento Complemento que cobra el empleado segun los años que lleve contratado.
	 * 
	 */
	public EmpleadoFijo(String nombre, int edad, String nif
			,double sueldo, MyGregorianCalendar fechaAlta, double complemento) {
		super(nombre, edad, nif,sueldo, fechaAlta );
		
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
		return getFechaAlta().get(Calendar.YEAR)-MyGregorianCalendar.getInstance().get(Calendar.YEAR);
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
