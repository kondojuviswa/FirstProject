/**
 * 
 */
package impDSandALGO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author My PC
 *
 */
public class LinkedListPractice {

	/**
	 * @param args
	 */
	
	/* doUnion will computer the union of the given linkedlist
	 * and return the combined List of the elements between these
	 * two lists
	 */
	LinkedList<Integer> doUnion(LinkedList<Integer> l1,LinkedList<Integer> l2)
	{
		LinkedList<Integer> combinedList = new LinkedList<Integer>();
		while(!l1.isEmpty()&& !l2.isEmpty())
		{
			
			if(l1.peekFirst() < l2.peekFirst())
				combinedList.add(l1.remove());
			else if(l1.peekFirst() > l2.peekFirst())
				combinedList.add(l2.remove());  
			else 
			{
				combinedList.add(l1.remove());
				l2.remove();
			}
		
		}
		if(l1.isEmpty()&& !l2.isEmpty())
		{
			combinedList.addAll(l2);
		}
		else if(!l1.isEmpty() && l2.isEmpty())
		{
			combinedList.addAll(l1);
		}
	
	return combinedList;
	}
	
	/* doIntersection will compute the intersection of the two linked lists
	 * and return the common list of elements between the two lists
	 */
	LinkedList<Integer> doIntersection(LinkedList<Integer> l1 ,LinkedList<Integer> l2)
	{
		LinkedList<Integer> commonList = new LinkedList<Integer>();
		while(!l1.isEmpty() && !l2.isEmpty())
		{
			if(l1.peekFirst() == l2.peekFirst())
			{
				commonList.add(l1.remove());
				l2.remove();
			}
			else if(l1.peekFirst() < l2.peekFirst())
			{
				l1.remove();
			}
			else
			{
				l2.remove();
			}
		}
		return commonList;
	}
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		Scanner in;
		 if (args.length > 0) {
	            File inputFile = new File(args[0]);
	            in = new Scanner(inputFile);
	           // System.out.println(in.toString());

	        } else {
	           in = new Scanner(System.in);
	       }
		 while(in.hasNextLine())
		 {
			 System.out.println(in.next());
		 }
		 

		
		int i = 0;
		while(i<7)
		{
			l1.add(i++*2);
		}
	//	System.out.println(l1);
		 i = 0;
		while(i < 5)
		{
			l2.add(i++*3);
		}
	//	System.out.println(l2);
		LinkedListPractice llp = new LinkedListPractice();
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		LinkedList<Integer> l4 = new LinkedList<Integer>();
		//l3 = llp.doUnion(l1, l2);
		l4 = llp.doIntersection(l1, l2);
		
		//System.out.println("Union of the above two lists is:" + l3);
	//	System.out.println("Intersection of the above two lists is:" + l4);
		
	
		/*l3.add(5);
		l3.addAll(l1);
		System.out.println(l3);
		l3.remove();
		System.out.println(l3);*/
		
		
 
	}

	//
	}
