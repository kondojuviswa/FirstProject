package impDSandALGO;

public class Test {
	
	void minAndMax(int[] A)
	{
		int len = A.length;
		if(len%2 == 0)
		{
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] A = { 2,6,4,1,7,9,3};
        int min,secondmin;
        min = A[0];
        secondmin = 0;
        for(int i = 0;i<A.length;i++)
        {
        	if(min > A[i])
        	{
        		secondmin = min;
        		min = A[i];
        	}
        	
        }
        System.out.println("Min is :" + min);
        System.out.println("Second Min is:" + secondmin);
	}

}
