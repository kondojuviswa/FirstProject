package impDSandALGO;


public class FibDAC {
	
	long fibDAC(long n,int p)
	{
		long temp = 0;
		if(n<=1)
		{
			return n;
		}
		else if(n%2 == 0)
		{
			return (fibDAC(n/2,p)*fibDAC(n/2,p))%p;
		}
		else
		{
			return n;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
