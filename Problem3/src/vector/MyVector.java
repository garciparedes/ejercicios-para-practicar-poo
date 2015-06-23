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
public class MyVector<E extends Operations<E>> implements Operations<MyVector> {

	private ArrayList<E> vectorList;
	
	
	public MyVector(){
		vectorList = new ArrayList<E>();
	}
	
	
	public MyVector(int dimen){
		vectorList = new ArrayList<E>(dimen);
	}
	
	
	public MyVector( E... elements){
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
	
	
	public <E> Operations getValue(int pos){
		return getVector().get(pos);
	}
	
	
	public ArrayList<E> getVector(){	
		return vectorList;
	}


	@Override
	public double getModulo() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public MyVector<E> suma(MyVector vector) {
		MyVector<E> result = new MyVector<E>(getDimen());
		
		for (E element: getVector()){
			result.addValue(element.suma( (E) vector.getValue(0)));
		}
		return result;
	}


	@Override
	public MyVector resta(MyVector vector) {
		MyVector<E> result = new MyVector<E>(getDimen());
		
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
