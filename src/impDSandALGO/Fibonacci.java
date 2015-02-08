package impDSandALGO;
// Author: Viswanadha Pratap Kondoju 
import java.util.*;
import java.io.*;

public class Fibonacci {
	
    private static int phase = 0;
    private static long startTime, endTime, elapsedTime;
    
         //Implementation of Fibonacci number calculation using iteration 
        long fibIteration(long n,int p)
        {
        	
        	long f0 = 0,f1 = 1 ,result = 0;
        	for(int i=2;i<=n;i++)
        	{
        		result = (f0+f1)%p;
        		f0 = f1;
        		f1 = result;
        	}
        	return result%p;
        }
        		
		long fibDAC(long n,int p)
		{
			long [][] Result = {{0,0},{0,0}},D = {{1,1},{1,0}},E = {{1,0},{0,0}};
			//Result[][] holds the values Fib[n] and Fib[n-1]
			// E is padded with zeros 0s for{{1},{0}}
			if(n <= 1){
				return n;
			}			
			MatrixMultiplication m = new MatrixMultiplication();
			Result = m.matrixMultiplicationUsingDAC(D,n-1,p);
			Result = m.matrixmultiplication(Result, E,p);
			return Result[0][0] ; 
		}
		
		 public static long timer()
		    {
		        if(phase == 0) {
			    startTime = System.currentTimeMillis();
			    phase = 1;
			    return 0;
			} else {
			    endTime = System.currentTimeMillis();
		            elapsedTime = endTime-startTime;
		            phase = 0;
		            return elapsedTime;
		        }
		    }

		   
			public static void main(String[] args) throws FileNotFoundException {
					// TODO Auto-generated method stub
			Fibonacci ft = new Fibonacci();
			long DAC_output,Iter_output;			
			Scanner in ;	
			if (args.length > 0) {
			File inputFile = new File(args[0]);
	        in = new Scanner(inputFile);
			}else
			{
			System.out.println("Enter the value of n followed by p :");
	        in = new Scanner(System.in);
	        }
	        
			while(in.hasNext()){
	        long n = in.nextLong();
	        int p = in.nextInt();
	        long timeTakenDAC,timeTakenIter;
			//call to fibDAC
			timer();
			DAC_output = ft.fibDAC(n,p);
			timeTakenDAC = timer();
			//Call to fibIteration
			timer();
			Iter_output = ft.fibIteration(n,p);
			timeTakenIter  = timer(); 
			if(DAC_output == Iter_output){
			System.out.println("n:"+n+"\n"+"p:"+p+"\n"+DAC_output+ " "+timeTakenIter+" "+timeTakenDAC);
	         }
			else{
				System.out.println("Mismatch between DAC and Iter outputs");
			}
			}

			}
}


