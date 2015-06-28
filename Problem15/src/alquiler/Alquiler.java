package alquiler;

import java.util.GregorianCalendar;

import embarcacion.Barco;

/**
 * Clase alquiler. Encargada de representar
 * un alquiler en el sistema. Los alquileres se caracterizan
 * por su numero de amarre entre un rango de fechas determinadas.
 * Esta clase no es la encargada de gestionar la disponibilidad
 * de esto, tan solo se encarga de almacenarlo.
 * 
 * @author garciparedes
 *
 */
public class Alquiler {

	private int amarre;
	private Barco barco;
	private String nombre;
	private String dni;
	private GregorianCalendar fechaInicial;
	private GregorianCalendar fechaFinal;
	
	/**
	 * Constructor de la clase Alquiler.
	 * @param amarre Numero de amarre del alquiler.
	 * @param barco Barco que usara el alquiler.
	 * @param nombre Nombre del titular del alquiler.
	 * @param dni Dni del titular del alquiler.
	 * @param fechaInicial Fecha inicial del alquiler.
	 * @param fechaFinal Fecha final del alquiler.
	 */
	public Alquiler(int amarre, Barco barco, String nombre, String dni,
			GregorianCalendar fechaInicial, GregorianCalendar fechaFinal){
		
		assert(amarre >= 0);
		this.amarre = amarre;
		
		assert(barco != null);
		this.barco = barco;
		
		assert(nombre.length() > 0);
		this.nombre = nombre;

		assert(dni.length() > 0);
		this.dni = dni;

		assert(fechaInicial.before(GregorianCalendar.getInstance()));
		this.fechaInicial = fechaInicial;

		assert(fechaFinal.after(fechaInicial));
		this.fechaFinal = fechaFinal;
	}
	
	/**
	 * Setter de amarre.
	 * 
	 * El amarre debe ser un numero positivo.
	 * 
	 * @param amarre Numero de amarre del alquiler.
	 */
	public void setAmarre(int amarre){
		assert(amarre >= 0);
		this.amarre = amarre;
	}
	
	
	/**
	 * Setter de barco.
	 * 
	 * El barco no puede ser un objeto nulo.
	 * 
	 * @param barco Barco que usara el alquiler.
	 */
	public void setBarco(Barco barco){
		assert(barco != null);
		this.barco = barco;
	}

	
	/**
	 * Setter de nombre.
	 * 
	 * El nombre no puede ser la cadena vacia.
	 * 
	 * @param nombre Nombre del titular del alquiler.
	 */
	public void setNombre(String nombre){
		assert(nombre.length() > 0);
		this.nombre = nombre;
	}
	
	
	/**
	 * Setter de dni.
	 * 
	 * El dni no puede ser la cadena vacia.
	 * 
	 * @param dni Dni del titular del alquiler.
	 */
	public void setDni(String dni){
		assert(dni.length() > 0);
		this.dni = dni;
	}
	
	
	/**
	 * Setter de fechaInicial.
	 * 
	 * La fecha inicial no puede ser posterior a la fecha fecha actual.
	 * 
	 * @param fechaInicial Fecha inicial del alquiler.
	 */
	public void setFechaInicial(GregorianCalendar fechaInicial){
		assert(fechaInicial.before(GregorianCalendar.getInstance()));
		this.fechaInicial = fechaInicial;
	}
	
	
	/**
	 * Setter de FechaFinal.
	 * 
	 * La fecha final no puede ser anterior a la fecha inicial.
	 * 
	 * @param fechaFinal Fecha final del alquiler.
	 */
	public void setFechaFinal(GregorianCalendar fechaFinal){
		assert(fechaFinal.after(getFechaInicial()));
		this.fechaFinal = fechaFinal;
	}
	
	
	/**
	 * Getter de amarre.
	 * 
	 * @return amarre Numero de amarre del alquiler.
	 */
	public int getAmarre(){
		return amarre;
	}
	
	
	/**
	 * Getter de barco.
	 * 
	 * @return barco Barco que usara el alquiler.
	 */
	public Barco getBarco(){
		return barco;
	}
	
	
	/**
	 * Getter de nombre.
	 * 
	 * @return Nombre del titular del alquiler.
	 */
	public String getNombre(){
		return nombre;
	}
	
	
	/**
	 * Getter de dni.
	 * 
	 * @return dni Dni del titular del alquiler.
	 */
	public String getDni(){
		return dni;
	}
	
	
	/**
	 * Getter de fechaInicial.
	 * 
	 * @return fechaInicial Fecha inicial del alquiler.
	 */
	public GregorianCalendar getFechaInicial(){
		return fechaInicial;
	}
	
	
	/**
	 * Getter de fechaFinal.
	 * 
	 * @return fechaFinal Fecha final del alquiler.
	 */
	public GregorianCalendar getFechaFinal(){
		return fechaFinal;
	}
	
	
	/**
	 * Funcion que calula los dias que dura el alquiler.
	 * 
	 * @return diasAlquiler Dias que dura el alquiler.
	 */
	public int getDiasOcupacion(){
		return (int) (getFechaFinal().getTimeInMillis()-getFechaInicial().getTimeInMillis())
				/(1000 * 60 * 60 * 24);
	}
	
	
	/**
	 * Funcion que calcula el coste que tendra
	 * el alquiler de un amarre a partir del numero
	 * de dias que se haya ocupado y el tipo de barco
	 * que lo ha ocupado.
	 * 
	 * @return precioAlquiler Precio del alguiler del amarre.
	 */
	public double getPrecioAlquiler(){
		return getDiasOcupacion()*getBarco().getPrecioAlquiler();
	}
}
