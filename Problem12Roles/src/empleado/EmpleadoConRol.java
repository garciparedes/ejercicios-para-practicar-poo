package empleado;

import empleado.rol.BaseRolSueldo;

/**
 * Clase empleado con Rol.
 * 
 * @author garciparedes
 *
 */
public class EmpleadoConRol extends Empleado{

	
	private BaseRolSueldo rol;

	
	/**
	 * Constructor de la clase EmpleadoConRol
	 * 
	 * @param nombre Nombre del empleado.
	 * @param edad Edad del empleado en años.
	 * @param nif NIF del empleado
	 * @param rol Rol que desempeña el empleado.
	 */
	public EmpleadoConRol(String nombre, int edad, String nif, BaseRolSueldo rol) {
		super(nombre, edad, nif);
		
		assert(rol != null);
		this.rol = rol;
	}
	
	
	/**
	 * Setter del Rol.
	 * 
	 * @param rol Rol que desempeña el empleado.
	 */
	public void setRol(BaseRolSueldo rol){
		assert(rol != null);
		this.rol = rol;
	}

	
	/**
	 * Getter del Rol.
	 * 
	 * @return Rol que desempeña el empleado.
	 */
	public BaseRolSueldo getRol(){
		return rol;
	}
	
	
	/**
	 * Funcion encargada de calcular el
	 * sueldo del empleado.
	 * 
	 * @return sueldo Double con el sueldo del empleado.
	 */
	public double getSueldo(){
		return getRol().getSueldo();
	}
	
	
	/**
	 * Funcion encargado de transformar
	 * en cadena de caracteres el objeto.
	 * 
	 * @return result cadena de caracteres con el contenido del objeto.
	 */
	@Override
	public String toString(){
		return (super.toString() + getRol().toString());
	}
}
