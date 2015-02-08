package HelloWorld;
//@Author: Pavan Kumar Yadiki Rajakumar. Net ID: pxy140630
//FIBONACCI Homework Assignment1

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Fibonacci {
	
	static int phase = 0;
	static long startTime, endTime, elapsedTime;

	int[][] powerOfMatrices(long n, int mod){
		int[][] val = new int[][]{{1,1},{1,0}};
		if(n == 1){
			return val;
		}
		else{
			int t[][] = new int[2][2];
			t = powerOfMatrices(n/2, mod);
			if( n % 2 == 0){
				return multiplyMatrices(t, t, mod);
			}
			else{
				return multiplyMatrices(val, multiplyMatrices(t, t, mod), mod);
			}
		}
	}

	// This function multiplies 2 matrices and returns the same
	int[][] multiplyMatrices(int[][] arr1, int[][] arr2, int mod){
		int iNoRows1, iNoCols2, iCommon;
		iNoRows1 = arr1.length;
		iNoCols2 = arr2.length;
		// Check if the multiplication of matrices rule holds
		if( arr1[0].length == arr2.length){
			iCommon = arr1[0].length;
			int[][] iResult = new int[iNoRows1][iNoCols2];
			for(int iRow = 0; iRow < iNoRows1; iRow++){
				for(int iCol = 0; iCol < iNoCols2; iCol++){
					for(int iMove = 0; iMove < iCommon; iMove++){
						iResult[iRow][iCol] += arr1[iRow][iMove] * arr2[iMove][iCol];
					}
					iResult[iRow][iCol] %= mod;
				}
			}
			return iResult;
		}
		else{
			return null;
		}
	}

	// This function finds the nth number in a fibonacci series
	long findFibonacci_DAC(long num, int mod){
		int mul[][];
		long fib;
		// Return 0 or 1 if num =0 or 1 respectively
		if(num == 0){
			return 0;
		}
		else if(num == 1){
			return 1;
		}
		// Otherwise, call the function to calculate the fib. numbers using matrix multiplication
		else{
			mul = powerOfMatrices(num-1, mod);
			fib = mul[0][0];
			return fib;	
		}
	}

	// Find the nth number of Fibonacci using linear approach
	long findFibonacci_Linear(long num, int mod){
		long first, second, sum;
		first = sum =0;
		second = 1;
		if(num == 0){
			System.out.println("Number is: " + first);
			return 0;
		}
		else if(num == 1){
			System.out.println("Number is: " + second);
			return 1;
		}
		else{
			for(long count = 2; count <= num; count++)
			{
				sum = (first + second) % mod;
				first = second;
				second = sum;
			}
			return second;
		}
	}

	// This function helps find the execution time of a process when called during
	public static void timer()
	{
		if(phase == 0) {
			startTime = System.currentTimeMillis();
			phase = 1;
		} else {
			endTime = System.currentTimeMillis();
			elapsedTime = endTime-startTime;
			System.out.print( elapsedTime + " msec" + "\t");
			//memory();
			phase = 0;
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in;
		long num; 
		int mod;
		// Read the input from a file
		if(args.length > 0){
			in = new Scanner(new BufferedReader(new FileReader(args[0])));
		}
		// Read the input from console
		else{
			in = new Scanner(System.in);	
			System.out.println("Enter the number followed by mod:");
		}
		// Read the input
		num = in.nextLong();
		mod = in.nextInt();
		// Create an object of Fibonacci
		Fibonacci f = new Fibonacci();
		System.out.println("Start of linear approach.");
		timer();
		// Start of linear approach
		System.out.println("Fibonacci Number: " + f.findFibonacci_Linear(num, mod) + "\t");
		System.out.print("Time taken for Linear approach:");
		timer();		
		timer();
		// Start of DAC approach
		System.out.print("\n\nStart of DAC approach. ");
     f.findFibonacci_DAC(num, mod);
		System.out.print("Time taken for DAC approach:");
		timer();
		// Close the scanner object
		in.close();
	}
}
