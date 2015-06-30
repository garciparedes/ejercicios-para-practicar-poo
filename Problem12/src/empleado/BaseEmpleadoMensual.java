package empleado;

import java.util.Calendar;

import calendar.MyGregorianCalendar;


/**
 * Clase BaseEmpleadoSueldoMensual encargada de
 * modelar los empleados con contrato mensual.
 * 
 * @author garciparedes
 *
 */
public abstract class BaseEmpleadoMensual extends Empleado {

	private static final String FECHA_ALTA = "Fecha Alta: ";
	private double sueldo;
	private MyGregorianCalendar fechaAlta;
	
	/**
	 * Constructor de la clase BaseEmpleadoSueldoMensual.
	 * 
	 * @param nombre Nombre del empleado.
	 * @param edad Edad del empleado en años.
	 * @param nif NIF del empleado.
	 * @param sueldo Sueldo base del empleado.
	 * @param fechaAlta Fecha de alta del empleado.
	 */
	public BaseEmpleadoMensual(String nombre, int edad, String nif
			, double sueldo, MyGregorianCalendar fechaAlta) {
		
		super(nombre, edad, nif);
		
		assert(sueldo > 0);
		this.sueldo = sueldo;
		
		assert(fechaAlta.before(Calendar.getInstance()));
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
	public MyGregorianCalendar getFechaAlta(){
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
