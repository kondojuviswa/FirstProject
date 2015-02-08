package HelloWorld;

public class testUnary {
	public static void main(String[] args){
		int value = 10;
		value = -value ;
		//System.out.println("negated value is: " + value);
		value += 15;
		//System.out.println("Incremented value is:" + value);
		value -= 6 ; 
		//System.out.println("Decremented value is: " + value);
		value -= value;
		//System.out.println("Final value is :" + value);
		
		// test the prefix and postfix increments
		int val = 1;
		//val++;
		System.out.println(val++);
		//++val;
		System.out.println(++val);
	}

}
