package vector;
/**
 * Interfaz destinada a la genericidad 
 * de la la clase GenericVector
 * 
 * @author garciparedes
 *
 * @param <T>
 */
public interface VectorOps<T> {

	
	/**
	 * Funcion que suma dos objetos del mismo
	 * tipo y devuelve el resultado en otro objeto nuevo.
	 * 
	 * @param value Segundo Sumando.
	 * @return result Resultado de la suma.
	 */
	public T suma(T value);

	
	/**
	 * Funcion que resta dos objetos del mismo
	 * tipo y devuelve el resultado en otro objeto nuevo.
	 * 
	 * @param value Valor a restar.
	 * @return result Resultado de la resta.
	 */
	public T resta(T value);
	
	
	/**
	 * Funcion que multiplica el objeto por
	 * un numero double.
	 * 
	 * @param value double por el que multiplicar.
	 * @return result Resultado de la operacion.
	 */
	public T multiplicacion(double value);
	
	
	/**
	 * Funcion que divide el objeto por
	 * un numero double.
	 * 
	 * @param value double entre el que dividir.
	 * @return result Resultado de la operacion.
	 */
	public T division(double value);

}
