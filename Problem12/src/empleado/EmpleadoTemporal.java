/**
 * 
 */
package empleado;

import calendar.MyGregorianCalendar;

/**
 * Clase que modela a los empleados de
 * manera temporal.
 * 
 * @author garciparedes
 *
 */
public class EmpleadoTemporal extends BaseEmpleadoMensual {

	private static final String FECHA_BAJA = "Fecha Baja: ";
	
	private MyGregorianCalendar fechaBaja;

	
	/**
	 * Constructor de la clase BaseEmpleadoSueldoMensual.
	 * 
	 * @param nombre Nombre del empleado.
	 * @param edad Edad del empleado en años.
	 * @param nif NIF del empleado.
	 * @param sueldo Sueldo base del empleado.
	 * @param fechaAlta Fecha de alta del empleado.
	 * @param fechaBaja Fecha de baja del empleado.
	 */
	public EmpleadoTemporal(String nombre, int edad, String nif
			,double sueldo, MyGregorianCalendar fechaAlta, MyGregorianCalendar fechaBaja) {
		
		super(nombre, edad, nif, sueldo, fechaAlta);
		
		assert(fechaBaja.after(fechaAlta));	
		this.fechaBaja = fechaBaja;
	}
	
	
	/**
	 * Setter de fecha baja.
	 * 
	 * @param fechaBaja La fecha de baja debe ser posterior a la de alta.
	 */
	public void setFechaBaja(MyGregorianCalendar fechaBaja){
		assert(fechaBaja.after(getFechaAlta()));		
		this.fechaBaja = fechaBaja;
	}
	
	/**
	 * Getter de fecha de baja.
	 * 
	 * @return fecha de baja.
	 */
	public MyGregorianCalendar getFechaBaja(){
		return fechaBaja;
	}
	
	/**
	 * Funcion encargado de transformar
	 * en cadena de caracteres el objeto.
	 */
	@Override
	public String toString(){
		return (super.toString() + FECHA_BAJA + getFechaBaja());
	}

}
