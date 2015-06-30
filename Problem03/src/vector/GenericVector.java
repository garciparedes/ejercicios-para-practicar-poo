/**
 * 
 */
package vector;

import java.util.ArrayList;


/**
 * Clase GenericVector.
 * Esta clase sirve para modelar vectores
 * en el sistema. Es una clase generica que
 * permite la entrada de todo tipo de objetos
 * que implementen la interfaz VectorOps, que
 * ademas tambien implementa la propia clase para
 * realizar dichas operaciones.
 * 
 * @author garciparedes
 *
 */
public class GenericVector<E extends VectorOps<E>> implements VectorOps<GenericVector<E>>{

	private ArrayList<E>  vectorList;
	
	
	/**
	 * Constructor de la clase GenericVector.
	 */
	public GenericVector(){
		vectorList = new ArrayList<E>();
	}
	
	
	/**
	 * Constructor de la clase GenericVector.
	 * 
	 * @param dimen numero de elementos que tendra el vector.
	 */
	public GenericVector(int dimen){
		assert(dimen > 0);

		vectorList = new ArrayList<E>(dimen);
	}
	
	
	/**
	 * Constructor de la clase GenericVector.
	 * 
	 * @param elements Lista de elementos con los
	 * cuales se inicializa el vector.
	 */
	@SafeVarargs
	public GenericVector( E... elements){
		this();				 

		assert(elements != null);
		
		for (E element: elements){
				addValue(element);
		}
	}
	
	
	/**
	 * Funcion que agrega un elemento al vector.
	 * 
	 * @param element elemento a agregar.
	 */
	public void addValue(E element){
		assert(element != null);
		
		getVector().add(element);
	}
	
	
	/**
	 * Funcion que devuelve la longitud del vector.
	 * 
	 * @return longitud del vector.
	 */
	public int getDimen(){
		return getVector().size();
	}
	
	
	/**
	 * Funcion que devuelve el elemento
	 * que esta en el vector en una determinada posicion.
	 * 
	 * @param pos posicion en la que esta el elemento.
	 * @return elemento que se pide.
	 */
	public E getValue(int pos){
		assert(pos >= 0 && pos < getDimen());
		
		return getVector().get(pos);
	}
	
	
	/**
	 * Funcion que devuelve una
	 * lista con todos los elementos
	 * contenidos en el vector de tipo
	 * ArrayList<E>.
	 * 
	 * @return result Lista con elementos del vector.
	 */
	public ArrayList<E> getVector(){	
		return vectorList;
	}


	/**
	 * Funcion que suma dos vectores del mismo tipo
	 * y devuelve un nuevo vector con el resultado.
	 * 
	 * @return result Resultado de la operacion.
	 */
	@Override
	public GenericVector<E> suma(GenericVector<E> vector) {
		assert(vector != null);
		
		GenericVector<E> result = new GenericVector<E>(getDimen());	
		for (int i = 0; i < getDimen(); i++){
			result.addValue(
					getValue(i).suma(vector.getValue(i))
			);
		}
		return result;
	}


	/**
	 * Funcion que resta dos vectores del mismo tipo
	 * y devuelve un nuevo vector con el resultado.
	 * 
	 * @return result Resultado de la operacion.
	 */
	@Override
	public GenericVector<E> resta(GenericVector<E> vector) {
		GenericVector<E> result = new GenericVector<E>(getDimen());	
		for (int i = 0; i < getDimen(); i++){
			result.addValue(
					getValue(i).resta(vector.getValue(i))
			);
		}
		return result;
	}
	
	
	/**
	 * Funcion que devuelve el contenido del vector 
	 * convertido en una cadena de caracteres de tipo
	 * String.
	 * 
	 * @return result Cadena de caracteres.
	 */
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();		
		sb.append("(");	
		for (E element: getVector()){
			sb.append(element);
			sb.append(" ");
		}
		sb.append(")");
		return sb.toString();
	}


	/**
	 * Funcion que multiplica todo el vector por
	 * un numero double.
	 * 
	 * @return result Resultado de la operacion.
	 */
	@Override
	public GenericVector<E> multiplicacion(double value) {
		GenericVector<E> result = new GenericVector<E>(getDimen());
		for(E element : getVector()){
			result.addValue(element.multiplicacion(value));
		}
		return result;
	}


	/**
	 * Funcion que divide todo el vector entre
	 * un numero double.
	 * 
	 * @return result Resultado de la operacion.
	 */
	@Override
	public GenericVector<E> division(double value) {
		GenericVector<E> result = new GenericVector<E>(getDimen());	
		for(E element : getVector()){
			result.addValue(element.division(value));
		}		
		return result;
	}
}
