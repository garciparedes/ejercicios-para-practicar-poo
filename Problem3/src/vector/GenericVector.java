/**
 * 
 */
package vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * @author garciparedes
 *
 */
public class GenericVector<E extends VectorOps<E>> implements VectorOps<GenericVector<E>>{

	private ArrayList<E>  vectorList;
	
	
	public GenericVector(){
		vectorList = new ArrayList<E>();
	}
	
	
	public GenericVector(int dimen){
		vectorList = new ArrayList<E>(dimen);
	}
	
	
	public GenericVector( E... elements){
		this();				 
		for (E element: elements){
				addValue(element);
		}
	}
	
	
	public void addValue(E complejo){
		getVector().add(complejo);
	}
	
	
	public int getDimen(){
		return getVector().size();
	}
	
	
	public E getValue(int pos){
		return getVector().get(pos);
	}
	
	
	public ArrayList<E> getVector(){	
		return vectorList;
	}
	
	public Iterator<E> getIterator(){
		return vectorList.iterator();
	}


	@Override
	public GenericVector<E> suma(GenericVector<E> vector) {
		GenericVector<E> result = new GenericVector<E>(getDimen());	
		for (int i = 0; i < getDimen(); i++){
			result.addValue(
					getValue(i).suma(vector.getValue(i))
			);
		}
		return result;
	}


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


	@Override
	public GenericVector<E> multiplicacion(double value) {
		GenericVector<E> result = new GenericVector<E>(getDimen());
		for(E element : getVector()){
			result.addValue(element.multiplicacion(value));
		}
		return result;
	}


	@Override
	public GenericVector<E> division(double value) {
		GenericVector<E> result = new GenericVector<E>(getDimen());	
		for(E element : getVector()){
			result.addValue(element.division(value));
		}		
		return result;
	}
}
