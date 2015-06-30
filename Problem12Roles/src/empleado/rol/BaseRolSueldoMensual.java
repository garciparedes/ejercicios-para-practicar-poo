package empleado.rol;

import java.util.GregorianCalendar;


/**
 * Clase BaseRolSueldoMensual encargada de
 * modelar los roles con contrato mensual.
 * 
 * @author garciparedes
 *
 */
public class BaseRolSueldoMensual extends BaseRolSueldo{

	private static final String FECHA_ALTA = "Fecha Alta: ";
	private double sueldo;
	private GregorianCalendar fechaAlta;
	
	
	/**
	 * Constructor de la clase BaseRolSueldo.
	 * 
	 * @param sueldo Sueldo base del empleado.
	 * @param fechaAlta Fecha de alta del empleado.
	 */
	public BaseRolSueldoMensual(double sueldo, GregorianCalendar fechaAlta){
		super();
		
		assert(sueldo > 0);
		this.sueldo = sueldo;
		
		assert(fechaAlta.before(GregorianCalendar.getInstance()));
		this.fechaAlta = fechaAlta;
	}
	
	
	/**
	 * Getter de Sueldo.
	 * 
	 * @return sueldo Sueldo del empleado.
	 */
	@Override
	public double getSueldo() {
		return sueldo;
	}
	
	
	/**
	 * Getter de Fecha de Alta
	 * @return fechaAlta MyGregorianCalendar con la fecha de alta.
	 */
	public GregorianCalendar getFechaAlta(){
		return fechaAlta;
	}
	
	
	/**
	 * Funcion encargado de transformar
	 * en cadena de caracteres el objeto.
	 */
	@Override
	public String toString(){
		return (super.toString() + FECHA_ALTA + getFechaAlta());
	}
}
