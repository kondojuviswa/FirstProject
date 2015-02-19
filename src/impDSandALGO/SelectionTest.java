package impDSandALGO;

import java.util.Scanner;

public class SelectionTest {
	int select(int[] A, int start, int end,int k)
	{
		int temp = 0;
		//if(start < end)
		//{
		int pindex = partition(A,start,end,end);//get the partition index
		temp = pindex-start+1;
		if(temp == k)
		{
			return A[pindex];
		}
		if(k<temp)
		{
		return select(A,start,pindex-1,k); 
		}//sort the segment to the left of pivot
		else{
		return select(A,pindex+1-temp,end,k); // sort the segment to the right of pivot 
		}
		//}
		//return -1;
	}
	
	//partitioning logic
	//Always right most element of the segement to be sorted is chosen as the pivot
	//and the elements in the segment are rearraged such that all the
	//elements less than the pivot are moved to the left and all the elements
	//greater are moved to the right of the pivot
	int partition(int[] A,int start,int end,int pivot)
		{
		//	int pivot = A[partition_index];
			int pindex = start;
			int temp = 0;
			for(int i=start;i<end;i++)
			{
				if(A[i] < pivot)
				{
					temp = A[i];
					A[i] = A[pindex];
					A[pindex] = temp;
					pindex++;
				}
			}
			temp = A[pindex];
			A[pindex] = A[end];
			A[end] = temp;
			printArray(A);
			return pindex;
		}
	
	void printArray(int[] A)
	{
		for(int i = 0;i < A.length;i++)
		{
			System.out.print(A[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionTest qs = new SelectionTest();
		int[] A = {7,2,1,6,8,5,3,4,23,56,78,11,24,53,42,61};
		//int part = qs.partition(A, 0, 7);
		//System.out.println(part);
		int p = 0;int k;
		System.out.println("Enter the value of k:");
		Scanner in ;
		in = new Scanner(System.in);
		k = in.nextInt(); // k is the number of the subsets we divide the array
		int size_of_set = A.length/k;
		p = qs.select(A, 0, A.length-1,12);
		//qs.printArray(A);
		System.out.println(p);

	}
}