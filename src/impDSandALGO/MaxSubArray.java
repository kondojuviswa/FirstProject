package impDSandALGO;

public class MaxSubArray {
	int[] maxSubArray(int p,int r,int[] A)
	{   
		int[] out = new int[6];
		for(int i = 0; i< out.length;i++)
		{
			out[i] = 0;
		}
		int[] secMax = new int[3];
		if(p==r) // just a single element so return it as the max sum
		{
			out[0]=p;
			out[1]=p;
			out[2]=A[p];
			return out;
		}
		int q;
		int[] leftSub = new int[3];
		int[] rightSub = new int[3];
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
		
	    boolean left = false,right = false,cross = false;
		
		if(leftSub[2]>max(rightSub[2],crossArrSum))
		{
			out[0] = leftSub[0];
			out[1] = leftSub[1];
			out[2] = leftSub[2];
			//return leftSub;
			left  = true;
			
		}
		else if(rightSub[2] > crossArrSum )
		{
			out[0] = rightSub[0];
			out[1] = rightSub[1];
			out[2] = rightSub[2];
			//return rightSub;
			right = true;
			
		}
		else
		{
			out[0] = Lindex;
			out[1] = Rindex;
			out[2] = crossArrSum;
			//return out;
			cross = true;
		}
	//	System.out.println("length of the current array is:" + (r-p+1));
	//	if(r-p+1 == A.length)
	//	{
	//		System.out.println("In the final call");
			if(left == true)
			{
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
			else if(right == true)
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
			else if(cross == true)
		  {
				if(leftSub[2] > rightSub[2])
				{
					out[3] = leftSub[0];
					out[4] = leftSub[1];
					out[5] = leftSub[2];

				}
				else
				{
					out[3] = rightSub[0];
					out[4] = rightSub[1];
					out[5] = rightSub[2];
					
				}

		}
		//}
		return out;
		

				
	}
	
	int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] out = {0,0,0,0,0,0};
		int[] input =  {4,-1,2,-1,3,-9,4};
		int[] input1 = {4,-1,2,-6,3,-2,4,7,9,6,-3,-1};
		MaxSubArray msa = new MaxSubArray();
		out = msa.maxSubArray(0, 6, input);
		System.out.println("Max Sum is :" +out[2]);
		System.out.println("Max Sub array is: A["+out[0]+".."+out[1]+"]");
		System.out.println("Max Second Sum is :" +out[5]);
		System.out.println("Max Second Sub array is: A["+out[3]+".."+out[4]+"]");
		

	}

}
