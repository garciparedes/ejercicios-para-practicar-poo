package empleado;

/**
 * Clase de partida para el ejercicio.
 * 
 * @author garciparedes
 *
 */
public class Empleado {
	
	private static final String NOMBRE = "Nombre: ";
	private static final String EDAD = "Edad: ";
	private static final String NIF = "NIF: ";

	private String nombre;
	private int edad;
	private String nif;

	/**
	 * Constructor de la clase Empleado.
	 * 
	 * @param nombre Nombre del empleado.
	 * @param edad Edad del empleado en años.
	 * @param nif NIF del empleado.
	 */
	public Empleado(String nombre, int edad, String nif){
		assert(!nombre.equals(""));
		this.nombre = nombre;
		
		assert(edad > 0);
		this.edad = edad;
		
		assert( (!nif.equals("")) && (nif.length() == 9) );
		this.nif = nif;
	}
	
	
	/**
	 * Getter del Nombre.
	 * 
	 * @return nombre String con el nombre del empleado.
	 */
	public String getNombre(){
		return nombre;
	}
	
	/**
	 * Getter del Edad.
	 * 
	 * @return edad String con el edad del empleado.
	 */
	public int getEdad(){
		return edad;
	}
	
	
	/**
	 * Getter del nif.
	 * 
	 * @return nif String con el nif del empleado.
	 */
	public String getNif(){
		return nif;
	}
	
	/**
	 * Funcion encargado de transformar
	 * en cadena de caracteres el objeto.
	 */
	@Override
	public String toString(){
		return (NOMBRE + getNombre()
				+ EDAD + getEdad()
				+ NIF + getNif()
		);
	}
	
}
