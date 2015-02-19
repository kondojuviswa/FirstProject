/**
 * 
 */
package impDSandALGO;
import java.util.*;

/**
 * @author My PC
 *
 */
public class LinkedListPractice extends LinkedList<Integer> implements SortedSet<Integer>{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListPractice ll = new LinkedListPractice();
		ll.add(1);
		ll.add(5);
		ll.add(6);
		ll.add(2);
		
		System.out.println(ll);
		
		
		
 
	}

	@Override
	public Comparator<? super Integer> comparator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<Integer> subSet(Integer fromElement, Integer toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<Integer> headSet(Integer toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<Integer> tailSet(Integer fromElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer last() {
		// TODO Auto-generated method stub
		return null;
	}

}
