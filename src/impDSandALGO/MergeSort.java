package impDSandALGO;

import java.util.Random;

public class MergeSort {
	
	void mergeSort(int[] A)
	{
		if(A.length < 11){
			InserstionSort is = new InserstionSort();
			is.insertionSort(A);
			return;
		}
		int lenA = A.length;
		int mid = 0;
		mid =  lenA/2;
		int[] left ;
		int[] right ;
		left = new int[mid];
		right = new int[lenA - mid];
		
		for(int i = 0; i < mid ; i++)
		{
			left[i] = A[i];
		}
		for(int i = mid ; i < lenA ; i++)
		{
			right[i-mid] = A[i];
		}
	/*	System.out.print("Left Array : ");
		for(int i = 0; i < left.length ; i++)
		{
			System.out.print(left[i] + " ");
		}
		System.out.print("\nRight Array : ");
		for(int i = 0; i < right.length ; i++)
		{
			System.out.print(right[i] + " ");
		}*/
		mergeSort(left);
		mergeSort(right);
		merge(left,right,A);
	}
	void merge(int[] left,int[] right,int[] A)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0,j = 0,k = 0;//for iterating over left,right and A arrays respectively
		while(i < leftSize && j < rightSize)
		{
			if(left[i] <= right[j]){
				A[k] = left[i];
				i++;
			}
			else
			{
				A[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < leftSize)
		{
			A[k] = left[i];
			k++;
			i++;
		}
		while( j < rightSize)
		{
			A[k] = right[j];
			k++;
			j++;
		}
	}
	void printArray(int[] A)
	{
		for(int i = 0;i < A.length;i++)
		{
			System.out.print(A[i]+ " ");
		}
		System.out.println();
	}
	int[] GenerateArray()
	{
		int A[] = new int[1000000];
		Random ran = new Random(1000000);
		for(int i = 0;i<A.length;i++)
		{
			A[i] = new Integer(ran.nextInt());
		}
		return A;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[1000000];
		
		MergeSort ms = new MergeSort();
		A = ms.GenerateArray();
		System.out.print("Unsorted Array:");
		ms.printArray(A);
		//ms.mergeSort(A);
		//System.out.print("Sorted Array:");
		//ms.printArray(A);

	}

}
