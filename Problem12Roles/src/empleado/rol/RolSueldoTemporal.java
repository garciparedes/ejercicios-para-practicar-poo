package empleado.rol;

import java.util.GregorianCalendar;


/**
 * Clase que modela los roles de
 * manera temporal.
 * 
 * @author garciparedes
 *
 */
public class RolSueldoTemporal extends BaseRolSueldoMensual{
	
	private static final String FECHA_BAJA = "Fecha Baja: ";
	
	private GregorianCalendar fechaBaja;

	
	/**
	 * Constructor de la clase RolSueldoTemporal.
	 * 
	 * @param sueldo Sueldo base del empleado.
	 * @param fechaAlta Fecha de alta del empleado.
	 * @param fechaBaja Fecha de baja del empleado.
	 */
	public RolSueldoTemporal(double sueldo, GregorianCalendar fechaAlta, GregorianCalendar fechaBaja){
		super( sueldo, fechaAlta);
		
		assert(fechaBaja.after(fechaAlta));	
		this.fechaBaja = fechaBaja;
	}
	
	
	/**
	 * Setter de fecha baja.
	 * 
	 * @param fechaBaja La fecha de baja debe ser posterior a la de alta.
	 */
	public void setFechaBaja(GregorianCalendar fechaBaja){
		assert(fechaBaja.after(getFechaAlta()));		
		this.fechaBaja = fechaBaja;
	}
	
	
	/**
	 * Getter de fecha de baja.
	 * 
	 * @return fecha de baja.
	 */
	public GregorianCalendar getFechaBaja(){
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
