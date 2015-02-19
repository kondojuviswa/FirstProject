/**
 * 
 */
package impDSandALGO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Viswandha Pratap Kondoju
 * 
 * NetID : vxk147730
 *
 */
public class LinkedListPractice {

	/**
	 * @param args
	 */
	
	/* union will computer the union of the given linkedlists
	 * and return the combined List of the elements between these
	 * two lists
	 */
	
public static<T extends Comparable<? super T>>
    LinkedList<T> union(LinkedList<T> l1, LinkedList<T> l2)   
	{
		LinkedList<T> combinedList = new LinkedList<T>();
		while(!l1.isEmpty()&& !l2.isEmpty())
		{
			
			if(l1.peekFirst().compareTo(l2.peekFirst()) < 0)
				combinedList.add(l1.remove());
			else if(l1.peekFirst().compareTo(l2.peekFirst()) > 0)
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
	
	/* intersect will compute the intersection of the two linked lists
	 * and return the common list of elements between the two lists
	 */
	public static<T extends Comparable<? super T>>
    LinkedList<T> intersect(LinkedList<T> l1, LinkedList<T> l2)
	{
		LinkedList<T> commonList = new LinkedList<T>();
		while(!l1.isEmpty() && !l2.isEmpty())
		{
			if(l1.peekFirst().compareTo(l2.peekFirst()) == 0)
			{
				commonList.add(l1.remove());
				l2.remove();
			}
			else if(l1.peekFirst().compareTo(l2.peekFirst()) < 0)
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
	public static <T> void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> l5 = new LinkedList<Integer>();
		LinkedList<Integer> l6 = new LinkedList<Integer>();
		
		/*Input linked Lists are given in a file input.txt
		 * I read each line into two linked lists l1,l5 and l2,l6
		 * And i will create a union of list l1,l5 and intersection
		 * of lists l2 and l6
		 */
		Scanner in;
		 if (args.length > 0) {
	            File inputFile = new File(args[0]);
	            in = new Scanner(inputFile);
	          
	        } else {
	           in = new Scanner(System.in);
	       }
		 String line1,line2;
		 line1 = new String(in.nextLine());
		 line2 = new String(in.nextLine());
		 String[] ints_in_line1 = line1.split(" ");
		 String[] ints_in_line2 = line2.split(" ");
		 int i = 0; 
		 /*Reading the input from file into linkedlists 
		  * l1,l5 and l2,l6
		  */
		 while(i < ints_in_line1.length)
		 {
			l1.add(Integer.parseInt(ints_in_line1[i]));
			l5.add(Integer.parseInt(ints_in_line1[i++]));
		 }
		 
		 i = 0;
		 while(i < ints_in_line2.length)
		 {
			l2.add(Integer.parseInt(ints_in_line2[i]));
			l6.add(Integer.parseInt(ints_in_line2[i++]));
		 }		
		
	    System.out.println("First list:" + l1);
		System.out.println("Second List : " + l2);
		LinkedListPractice llp = new LinkedListPractice();
		
		/* l3 and l4 are the linked lists to store the resultant 
		 * combined and common linked lists returned by the union 
		 * intersect functions respectively
		 * 
		 */
		LinkedList l3 = new LinkedList<Integer>();
		LinkedList l4 = new LinkedList<Integer>();
		l3 = union(l1, l2);
		l4 = intersect(l5, l6);
		
		System.out.println("Union of the above two lists is:" + l3);
	    System.out.println("Intersection of the above two lists is:" + l4);
		
		}
	}
