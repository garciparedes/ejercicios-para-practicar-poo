package embarcacion;

import java.util.Calendar;

/**
 * Clase Barco. Es una clase abstracta que sirve
 * como clase base para el resto de embarcaciones,
 * que deben heredar de ella.
 * 
 * @author garciparedes
 *
 */
public abstract class Barco {
	
	public static int PRECIO_FIJO = 12;
	public static int MULTIPLICADOR_ESLORA = 10;
	private String matricula;
	private int eslora;
	private int fabricacionYear;
	
	
	/**
	 * Constructor de la clase barco.
	 * 
	 * @param matricula Matricula del barco.
	 * @param eslora Eslora medida en metros que tiene el barco.
	 * @param fabricacionYear Año de fabricacion del barco.
	 */
	public Barco(String matricula, int eslora, int fabricacionYear){
		assert(matricula.length()>0);
		this.matricula = matricula;
		
		assert(eslora > 0);
		this.eslora = eslora;
		
		assert(fabricacionYear <= Calendar.getInstance().get(Calendar.YEAR));
		this.fabricacionYear = fabricacionYear;
	}
	
	
	/**
	 * Setter de matricula.
	 * 
	 * @param matricula Matricula del barco.
	 */
	public void setMatricula(String matricula){
		assert(matricula.length()>0);
		this.matricula = matricula;
	}
	
	
	/**
	 * Setter de eslora.
	 * 
	 * @param eslora Eslora medida en metros que tiene el barco.
	 */
	public void setEslora(int eslora){
		assert(eslora > 0);
		this.eslora = eslora;
	}
	
	
	/**
	 * Setter de fabricacionYear.
	 * 
	 * @param fabricacionYear Año de fabricacion del barco.
	 */
	public void setFabricacionYear(int fabricacionYear){
		assert(fabricacionYear <= Calendar.getInstance().get(Calendar.YEAR));
		this.fabricacionYear = fabricacionYear;
	}
	
	
	/**
	 * Getter de matricula.
	 * 
	 * @return matricula Matricula del barco.
	 */
	public String getMatricula(){
		return matricula;
	}
	
	/**
	 * Getter de eslora.
	 * 
	 * @return eslora Eslora medida en metros que tiene el barco.
	 */
	public int getEslora(){
		return eslora;
	}
	
	
	/**
	 * Getter de fabricacionYear.
	 * 
	 * @return fabricacionYear Año de fabricacion del barco.
	 */
	public int getFabricacionYear(){
		return fabricacionYear;
	}

	/**
	 * Funcion encargada de calcular el precio
	 * diario por amarrar el barco en regimen
	 * de alquiler.
	 * 
	 * @return precioAlquiler Precio de alquiler de amarre diario.
	 */
	public double getPrecioAlquiler() {
		return MULTIPLICADOR_ESLORA*getEslora()*PRECIO_FIJO;
	}

}
