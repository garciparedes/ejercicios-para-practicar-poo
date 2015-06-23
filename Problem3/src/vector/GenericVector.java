/**
 * 
 */
package vector;

import java.util.ArrayList;
import java.util.Collection;


/**
 * @author garciparedes
 *
 */
public class GenericVector<E extends VectorOps<E>> 
	//implements Operations<MyVector> 
	{

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


	//@Override
	public double getModulo() {
		// TODO Auto-generated method stub
		return 0;
	}


	//@Override
	public GenericVector<E> suma(GenericVector<E> vector) {
		GenericVector<E> result = new GenericVector<E>(getDimen());
		
		for (E element: getVector()){
			result.addValue(element.suma(vector.getValue(0)));
		}
		return result;
	}


	//@Override
	public GenericVector<E> resta(GenericVector<E> vector) {
		GenericVector<E> result = new GenericVector<E>(getDimen());
		
		for (E element: getVector()){
			result.addValue(element.resta( (E) vector.getValue(0)));
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
	
}
