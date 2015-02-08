package impDSandALGO;
import java.util.*;

public class SelectionSort {
	
	void selectionSort(int[] A)
	{
		int MAX,j,temp,maxIndex;
		
		for(int i = 0;i< A.length ;i++ )
		{
			MAX = A[i];
			maxIndex = i;
			j = i+1;
			while(j<A.length)
			{
				if(A[j] < MAX)
				{
					MAX = A[j];
					maxIndex = j;
				}
				j++;
			}
			temp = A[i];
			A[i] = A[maxIndex];
			A[maxIndex] = temp;		
			
		}
		for(int i = 0;i< A.length ; i++)
		{
			System.out.print(A[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//naive implementation
		/*MergeSort ms = new MergeSort();
		
		int k;
		Scanner in ;
		in = new Scanner(System.in);
		k = in.nextInt();
		ms.mergeSort(A);
		System.out.println(A[A.length-1 - k+1]);
		ms.printArray(A);*/
		int[] A = {9,5,1,2,7,8,3};
		SelectionSort s = new SelectionSort();
		s.selectionSort(A);

	}

}
