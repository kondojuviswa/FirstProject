
public class BitSet {
	
	/** Implementation of Binary Search algorithm using generics.  Use on any type that
     *  implements Comparable
     */
    public static<T extends Comparable<? super T>> int  binarySearch(T[] A, int p, int r, T x) {
    	int temp = 0; //  Variable that holds the index q(smallest index) such that A[q] > x
	while(p <= r) {
	    int q = (p+r) >>> 1;
            int cmp = A[q].compareTo(x);
            if (cmp < 0) {
		p = q+1;
	    } else if (cmp == 0) {  // x found
		return q;
	    } else { // A[q] > x, so x is not in the right half
	    temp = q; // temp holds the smallest index q such that A[q] > x
		r = q-1;
	    }
	}
	// x not found, return -1
	if (temp == 0)   // temp unchaged means all the numbers A[p...r] < x
		return r+1;
	else
	return temp;    // returns the smallest index such that A[q] > x
    }
	 // Iterative version of binary search
    public static int iterativeBinarySearch(int[] A, int p, int r, int x) {
    	int temp = 0;
	while(p <= r) {
	    int q = (p+r)/2;
	    if(A[q] < x) {  // A[q] is too small, x is not in left half
		p = q+1;
	    } else if (A[q] == x) {  // x found
		return q;
	    } else { // A[q] > x, so x is not in the right half
	    	temp = q;
		r = q-1;
	    }
	}
	// x not found, return -1
	return temp;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 64, n =0;
		//System.out.println(Integer.toString(x,2));
		
	//x |= 1 << n;   // set on
	//	x &= ~(1 << n);  // set off
	//	System.out.println(Integer.toString(x,2));
		int[] A = { 1,4,6,8,9,11,24,35,45,56,67};
		//System.out.println(iterativeBinarySearch(A,0,A.length-1,11));
		//System.out.println(iterativeBinarySearch(A,0,A.length-1,5));
		int index = 0;
		Integer[] IA = new Integer[8];
		//for(int i = 0;i < IA.length ; i++)
		//	IA[i] = new Integer((i+20)%5);
		IA[0] = new Integer(5);
		IA[1] = new Integer(10);
		IA[2] = new Integer(17);
		IA[3] = new Integer(19);
		IA[4] = new Integer(34);
		IA[5] = new Integer(45);
		IA[6] = new Integer(56);
		IA[7] = new Integer(67);
		
		for(int i = 0;i< IA.length ;i++)
			System.out.println(IA[i]);
		index = binarySearch(IA,0,IA.length-1,33);
		System.out.println( "Index value is:" +index);
	}

}

