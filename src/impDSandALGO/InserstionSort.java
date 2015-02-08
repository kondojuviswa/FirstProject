package impDSandALGO;

public class InserstionSort {
	
	//Cormen exercise 2.1-2
	void insertionSort(int[] A)
	{
		int key,i;
		for(int j = 1;j< A.length;j++)
		{
			key = A[j];
			i = j-1;
			while(i >= 0 && A[i] < key)
			{
				A[i+1]=A[i];
				i = i-1;
				printArray(A);

			}
			A[i+1]=key;
			
		}
		
	}
	//Recursive version of Insertion sort
	void insertionSortRecursive(int[] A,int p,int q)
	{
		int key,i;
		
		
			if(p==q)
			{
				return;
			}
			
		insertionSortRecursive(A,p,q-1);
		//printArray(A);
		i = q-1;
		key = A[q];
		while(i>=0 && A[i]>key)
		{   //printArray(A);
			A[i+1] = A[i];
			i = i - 1;
			
		}
		A[i+1] = key;
		}
	
		
		
	
	void printArray(int[] A)
	{
		//System.out.println("I am in printArray");
		int i =0;
		while(i < A.length)
		{
			System.out.print(A[i++]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5,1,4,2,8,11,34,13,7,6,9,0};
		int[] SA = {1,2,3,4,5,6,7,8,9};
		int[] RS = {9,8,7,6,5,4,3,2,1};
		//int unSortEle = A[];
		InserstionSort is = new InserstionSort();
		//is.printArray(A);
		//is.insertionSortRecursive(A,0,11);
		is.insertionSortRecursive(RS,0,8);
		is.printArray(SA);
	
}
}
