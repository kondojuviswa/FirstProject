package HelloWorld;
//import java.util.Arrays.*;

public class arrcp {

	public static void main(String[] args){
		char[] firstArray = { 'v','i','s','w','a'};
		int[] intArray = { 2,8,4,1,5,12,34,2,46 };
		int testVar = 10;
		System.out.println("Length of the firstArray is :"+firstArray.length);
		char[] secondArray = new char[6];
		System.arraycopy(firstArray, 1, secondArray, 0, 4);
		System.out.print("Copied Array is:");
		String secArrStr = new String(secondArray);
		System.out.println(secArrStr);
		System.out.println("length of the copied string is:"+secondArray.length);
		char[] thirdArray = java.util.Arrays.copyOfRange(firstArray, 1, 4);
		String thirdArrStr = new String(thirdArray);
		System.out.println("String copied using copyOfRange is:" + thirdArrStr);
		System.out.println("The number 12 is located at:"+ java.util.Arrays.binarySearch(intArray ,12));
		java.util.Arrays.sort(intArray);
		
		System.out.println(testVar);
		
	}
}
