package empleado.rol;

/**
 * Clase que modela el rol de los sueldos
 * contratados por horas.
 * 
 * @author garciparedes
 *
 */
public class RolSueldoHoras extends BaseRolSueldo {
	private double precioHora;
	private int numHoras;
	
	
	/**
	 * Constructor de la clase RolSueldoHoras.
	 * 
	 * @param precioHora Precio por hora trabajada.
	 */
	public RolSueldoHoras(double precioHora){
		super();assert(precioHora > 0);
		this.precioHora = precioHora;
	}
	
	
	/**
	 * Setter del Precio por Hora.
	 * 
	 * @param precioHora Double.
	 */
	public void setPrecioHora(double precioHora){
		assert(precioHora > 0);
		this.precioHora = precioHora;
	}
	
	
	/**
	 * Setter del numero de Horas trabajadas.
	 * 
	 * @param numHoras Integer.
	 */
	public void setNumHoras(int numHoras){
		this.numHoras = numHoras;
	}
	
	
	/**
	 * Setter del numero de horas trabajadas a cero.
	 * Sirve para poner a cero el contador cuando
	 * el mes finaliza.
	 */
	public void resetNumHoras(){
		setNumHoras(0);
	}
	

	/**
	 * Procedimiento para incrementar o 
	 * decrementar el numero de horas trabajadas.
	 * 
	 * @param horas horas a incrementar/decrementar Integer.
	 */
	public void addHoras(int horas){
		setNumHoras(getNumHoras() + horas);
	}
	
	
	/**
	 * Getter del precio por hora.
	 * 
	 * @return precioHora Double.
	 */
	public double getPrecioHora(){
		return precioHora;
	}
	
	
	/**
	 * Getter del numero de horas trabajadas.
	 * 
	 * @return numHoras Integer.
	 */
	public int getNumHoras(){
		return numHoras;
	}


	/**
	 * Getter del sueldo.
	 * 
	 * @return sueldo Sueldo Correspondiente al trabajao por horas.
	 */
	@Override
	public double getSueldo() {
		return (getPrecioHora() * getNumHoras());
	}
}