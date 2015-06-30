package empleado;

/**
 * Clase abstracta que añade el sueldo a la clase Empleado.
 * La manera en que se calcula el sueldo es definida en clases inferiores.
 * 
 * @author garciparedes
 *
 */
public abstract class BaseEmpleadoSueldo extends Empleado{

	private static final String SUELDO = "Sueldo: ";

	
	/**
	 * Constructor de la clase BaseEmpleadoSueldo.
	 * 
	 * @param nombre Nombre del empleado.
	 * @param edad Edad del empleado en años.
	 * @param nif NIF del empleado.
	 */
	public BaseEmpleadoSueldo(String nombre, int edad, String nif){
		super(nombre, edad, nif);
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
		return (super.toString() + SUELDO + getSueldo());
	}

}
