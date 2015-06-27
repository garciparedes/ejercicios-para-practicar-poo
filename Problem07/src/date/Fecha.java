package date;

/**
 * Clase que modela una fecha a través de los campos
 * year, month y day. 
 * 
 * Además tiene dos modos de convertir
 * la fecha en cadena de caracteres que se configura mediante
 * los procedimientos seExtendida() y setAbreviada().
 * 
 * @author garciparedes
 *
 */
public class Fecha implements Cloneable{

	private static final String[] MONTHS = {"Enero", "Febrero","Marzo"
										,"Abril","Mayo","Junio"
										,"Julio","Agosto","Septiembre"
										,"Octubre","Noviembre","Diciembre"};
	private static final String SEP_EXTENDIDA = " de ";
	private static final String SEP_ABREVIADA = "/";
	
	private int year;
	private int month;
	private int day;
	
	private boolean extendida;
	
	/**
	 * Constructor de la clase Fecha
	 * 
	 * @param year Año que compone la fecha.
	 * @param month Mes que compone la fecha.
	 * @param day Dia que compone la fecha.
	 */
	public Fecha(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	/**
	 * Constructor de la clase Fecha
	 * 
	 * @param year Año que compone la fecha.
	 * @param month Mes que compone la fecha.
	 * @param day Dia que compone la fecha.
	 * @param extendida Indica si la fecha se imprimirá de forma extendida.
	 */
	public Fecha(int year, int month, int day, boolean extendida) {
		this(year, month, day);
		this.extendida = extendida;
	}
	
	/**
	 * Setter del año.
	 * 
	 * @param year Año que compone la fecha.
	 */
	public void setYear(int year){
		this.year = year;
	}
	
	
	/**
	 * Setter del mes.
	 * 
	 * @param month Mes que compone la fecha.
	 */
	public void setMonth(int month) {
		assert(month >= 1 && month<= 12);
		
		this.month = month;
	}
	
	/**
	 * Setter del dia.
	 * 
	 * @param day Dia que compone la fecha.
	 */
	public void setDay(int day) { 
		assert(day >= 1 && day <= getMaxDay());
		this.day = day;
	}
	
	/**
	 * Setter de Extendida.
	 * 
	 * Hace que al llamar a la funcion toString()
	 * esta devuelva la fecha de manera extendida.
	 */
	public void setExtendida() {
		extendida = true;
	}
	
	
	/**
	 * Setter de Abreviada.
	 * 
	 * Hace que al llamar a la funcion toString()
	 * esta devuelva la fecha de manera abreviada.
	 */
	public void setAbreviada() {
		extendida = false;
	}
	
	/**
	 * Getter de year.
	 * 
	 * @return year Año que compone la fecha.
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Getter de Month
	 * 
	 * @return month Mes que compone la fecha.
	 */
	public int getMonth() {
		return month;
	}
	
	
	/**
	 * Getter de Day.
	 * 
	 * @return day Dia que compone la fecha.
	 */
	public int getDay() {
		return day;
	}
	
	
	/**
	 * Getter del día maximo que tiene
	 * el mes actual.
	 * @return
	 */
	public int getMaxDay(){
		switch(getMonth()){
		
			case 1: case 3: case 5:
			case 7: case 8: case 10:
			case 12:
				return 31;
				
			case 4: case 6:
			case 9: case 11:
				return 30;
				
			case 2:
				if (isBisiesto())
					return 29;
				else
					return 28;
				
			default:
				//Este punto nunca se va a alcanzar.
				return -1;
		}
	}
	
	
	/**
	 * Getter De extendida.
	 * 
	 * @return extendida Indica si la fecha se imprimirá de forma extendida.
	 */
	public boolean isExtendida() {
		return extendida;
	}
	
	
	/**
	 * Funcion booleana que indica si el objeto
	 * invocante es bisiesto o no.
	 * 
	 * @return bisiesto
	 */
	public boolean isBisiesto(){
		if ((getYear() % 4 == 0) && ((getYear() % 100 != 0) 
				|| (getYear() % 400 == 0)))
			return true;
		else
			return false;
	}
	
	
	/**
	 * Procedimiento que incrementa en un dia
	 * la fecha que representa.
	 */
	public void incrementarDia() {
		if (getMaxDay() == getDay()){
			if (getMonth() == 12){
				setYear(getYear()+1);
				setMonth(1);
				setDay(1);
			} else{
				setMonth(getMonth()+1);
				setDay(1);
			}
		} else {
			setDay(getDay()+1);
		}
	}
	
	/**
	 * Funcion que devuelve un objeto de
	 * tipo fecha igual que el del objeto
	 * invocante pero con el dia incrementado
	 * en la unidad.
	 * 
	 * @return fecha Fecha con un dia mas que el invocante.
	 */
	public Fecha incremento() {
		Fecha result = (Fecha) clone();
		result.incrementarDia();
		return result;
	}
	
	
	/**
	 * Funcion encargado de transformar
	 * en cadena de caracteres el objeto Fecha.
	 * 
	 * Según el valor que se haya indicado anteriormente
	 * la fecha se muestra de manera abreviada "xx/xx/xxxx"
	 * o extendida "xx de xxxxxxxx de xxxx".
	 */
	@Override
	public String toString() {
		if (isExtendida()) {
			return( getDay() + SEP_EXTENDIDA + MONTHS[getMonth()-1] + SEP_EXTENDIDA + getYear());
		} else {
			return( getDay() + SEP_ABREVIADA + getMonth() + SEP_ABREVIADA + getYear());

		}
	}
	
	
	/**
	 * Funcion encargada de clonar el objeto Fecha.
	 */
	@Override
	public Object clone(){
		//return new Fecha(getYear(), getMonth(), getDay());
		try {
			return (Fecha) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
