package impDSandALGO;

public class QuickSort {
	
	void quickSort(int[] A, int start, int end)
	{
		if(start < end)
		{
		int pindex = partition(A,start,end);//get the partition index
		quickSort(A,start,pindex-1); //sort the segment to the left of pivot
		quickSort(A,pindex+1,end); // sort the segment to the right of pivot 
		}
	}
	
	//partitioning logic
	//Always right most element of the segement to be sorted is chosen as the pivot
	//and the elements in the segment are rearraged such that all the
	//elements less than the pivot are moved to the left and all the elements
	//greater are moved to the right of the pivot
	int partition(int[] A,int start,int end)
		{
			int pivot = A[end];
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
		QuickSort qs = new QuickSort();
		int[] A = {7,2,1,6,8,5,3,4,23,56,78,11,24,53,42,61};
		//int part = qs.partition(A, 0, 7);
		//System.out.println(part);
		qs.quickSort(A, 0, A.length-1);
		qs.printArray(A);

	}

}
