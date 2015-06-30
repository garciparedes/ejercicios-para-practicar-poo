package empleado.rol;


/**
 * Clase abstracta que añade el sueldo a la clase Empleado.
 * La manera en que se calcula el sueldo es definida en clases inferiores.
 * 
 * @author garciparedes
 *
 */
public abstract class BaseRolSueldo {

	
	private static final String SUELDO = "Sueldo: ";

	
	/**
	 * Constructor de la clase BaseRolSueldo.
	 */
	public BaseRolSueldo(){
	}
	
	
	/**
	 * Funcion encargada de calcular el
	 * sueldo del empleado.
	 * 
	 * @return sueldo Double con el sueldo del empleado.
	 */
	public abstract double getSueldo();

	
	/**
	 * Funcion encargado de transformar
	 * en cadena de caracteres el objeto.
	 */
	@Override
	public String toString(){
		return (SUELDO + getSueldo());
	}
}
