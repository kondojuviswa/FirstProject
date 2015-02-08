package impDSandALGO;

public class MatrixMultiplication {
	
	//Normal two dimensional matrix multiplication 
	long[][] matrixmultiplication(long[][] A,long[][] B,int p)
	{
		long[][] C = {{0,0},{0,0}};
		//code to calculate the matrix multiplication C=A*B
		C[0][0] = (A[0][0]*B[0][0] + A[0][1]*B[1][0])%p;
		C[0][1] = (A[0][0]*B[0][1] + A[0][1]*B[1][1])%p;
		C[1][0] = (A[1][0]*B[0][0] + A[1][1]*B[1][0])%p;
		C[1][1] = (A[1][0]*B[0][1] + A[1][1]*B[1][1])%p;
		
		return C;
		
	}
	
	// Matrix multiplication using Divide and conquer approach to calculate large matrix multiplications
	long[][] matrixMultiplicationUsingDAC(long[][] A,long power,int p)
	{
		
		long[][] temp; long[][] C = {{0,0},{0,0}};
		
		if(power == 1)
		{
			return A;
		}
		
		if(power%2==0)
		{
			temp = matrixMultiplicationUsingDAC(A,power/2,p);
			C = matrixmultiplication(temp,temp,p);
			return C;
			
		}
		else 
		{
			return matrixmultiplication(A,matrixMultiplicationUsingDAC(A,power-1,p),p);
		}
	}
	
	void printMatrix(long[][] A)
	{
	     for(int i = 0;i <2 ;i++){
	    	 
		    for(int j = 0; j < 2; j++){
		    	
			   System.out.print(A[i][j] + " ");
			   
		    }
		    System.out.println("\n");
		    
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			}

}
