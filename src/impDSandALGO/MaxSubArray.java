package impDSandALGO;
import java.util.*;

public class MaxSubArray {
	int[] maxSubArray(int p,int r,int[] A)
	{   
		System.out.println("maxSubArray("+p+","+r+","+"A");
		int[] out = new int[6]; // to hold the maximum and second maximum sums and subarrays indices
		for(int i = 0; i< out.length;i++)
		{
			out[i] = -111111;
		}
		
		if(p==r) // just a single element so return it as the max sum
		{
			out[0]=p;
			out[1]=p;
			out[2]=A[p];
			return out;
		}
		int q;
		int[] leftSub = new int[6];
		int[] rightSub = new int[6];
		q = (p+r)/2;
		leftSub = maxSubArray(p,q,A);
		rightSub = maxSubArray(q+1,r,A);
		
		int Lsum;
		int Lmax = Lsum = A[q],Lindex = q;
		for(int i = q-1;i>=p;i--)
		{
			Lsum = Lsum + A[i];
			if(Lsum > Lmax)
			{
				Lmax = Lsum;
				Lindex = i;
			}
		}
		int Rsum;
		int Rmax = Rsum = A[q+1],Rindex = q+1;
		for(int i = q+2;i<=r;i++)
		{
			Rsum = Rsum + A[i];
			if(Rsum > Rmax)
			{
				Rmax = Rsum;
				Rindex = i;
			}
		}
		int crossArrSum;
		crossArrSum = Lmax + Rmax;
		//System.out.println(leftSub[5] +" " +rightSub[5] + " " + crossArrSum);
		boolean left = false,right = false,cross = false;
		
		
	    
	    if(leftSub[2] > rightSub[2] && leftSub[2] > crossArrSum)
	    {
	    	out[0] = leftSub[0];
			out[1] = leftSub[1];
			out[2] = leftSub[2];
			if(leftSub[5] > rightSub[2] )
				{
				if(leftSub[5] > crossArrSum)
		      	{
				out[3] = leftSub[3];
				out[4] = leftSub[4];
				out[5] = leftSub[5];
		      	}
				else
				{
					out[3] = Lindex;
					out[4] = Rindex;
					out[5] = crossArrSum;
				}
			}
			else{
				if(rightSub[2] > crossArrSum)
				{
					out[3] = rightSub[0];
					out[4] = rightSub[1];
					out[5] = rightSub[2];
				}
				else
				{
					out[3] = Lindex;
					out[4] = Rindex;
					out[5] = crossArrSum;

				}
			}
	    	
	    }
	    else if(leftSub[2] < rightSub[2] && rightSub[2] > crossArrSum)
	    {
	    	out[0] = rightSub[0];
			out[1] = rightSub[1];
			out[2] = rightSub[2];
			if(rightSub[5] > leftSub[2] )
				{
				if(rightSub[5] > crossArrSum)
		      	{
				out[3] = rightSub[3];
				out[4] = rightSub[4];
				out[5] = rightSub[5];
		      	}
				else
				{
					out[3] = Lindex;
					out[4] = Rindex;
					out[5] = crossArrSum;
				}
			}
			{
				if(leftSub[2] > crossArrSum)
				{
					out[3] = leftSub[0];
					out[4] = leftSub[1];
					out[5] = leftSub[2];
				}
				else
				{
					out[3] = Lindex;
					out[4] = Rindex;
					out[5] = crossArrSum;

				}
			}
	    	
	    }
	    
	    else if(leftSub[2] < crossArrSum && rightSub[2] < crossArrSum)
	    {
	    	
	    	out[0] = Lindex;
			out[1] = Rindex;
			out[2] = crossArrSum;
			if(leftSub[2] == rightSub[2])
			{
				out[3] = leftSub[3];
				out[4] = rightSub[1];
				out[5] = leftSub[3]+rightSub[2];
			}
			
			if(rightSub[2] > leftSub[2] )
				{
				out[3] = rightSub[0];
				out[4] = rightSub[1];
				out[5] = rightSub[2];
		      	}
				else //if(rightSub[2] < leftSub[2])
				{
					out[3] = leftSub[0];
					out[4] = leftSub[1];
					out[5] = leftSub[2];
				}
				
			}
				    	
	  return out;				
	}
		
	//Prints all the elements of the Array passed as an argument
	void printArray(int[] A)
	{
		int i = 0;
		while(i < A.length)
		{
			System.out.print(A[i++]+ " ");
		}
		System.out.println();
	}
	
	// Method to find the maximum of two elements
	int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		return b;
	}
	
	void printMaxAndSecondMax(int[] output)
	{
		System.out.println("Max Sum is :" +output[2]);
		System.out.println("Max Sub array is: A["+output[0]+".."+output[1]+"]");
		System.out.println("Max Second Sum is :" +output[5]);
		System.out.println("Max Second Sub array is: A["+output[3]+".."+output[4]+"]");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] out = {0,0,0,0,0,0};
		/*int[] input =  {4,-1,2,-1,3,-9,4};
		int[] input1 = {4,-1,2,-6,3,-2,4,7,9,6,-3,-1};
		int[] zeroLength  = {};*/
		int size;
		MaxSubArray msa = new MaxSubArray();
	    
	   /* out = msa.maxSubArray(0, 1, zeroLength);// to test the single element case
		msa.printMaxAndSecondMax(out);
		
		out = msa.maxSubArray(0, 6, input); //to test other inputs of length > 1
		msa.printMaxAndSecondMax(out);
		out = msa.maxSubArray(0,input1.length-1, input1);
		msa.printMaxAndSecondMax(out);*/
		// 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size = in.nextInt();
		int[] input = new int[size];
		System.out.println("Enter the elements in the array:");
		int i = 0;
		while(i<size){
			input[i] = in.nextInt();
			i++;
		}
		//}
	    out = msa.maxSubArray(0, input.length-1 ,input);
		msa.printMaxAndSecondMax(out);
		
		

	}

}
