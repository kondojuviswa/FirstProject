/**
 * 
 */
package impDSandALGO;
import java.util.*;

/**
 * @author My PC
 *
 */
public class PowerProg {
	Long power(Long x , Long n ){
		Long s;
		if(n == 1){
			return x;
		}
		else
			s = power(x,n/2);
		if(n%2 != 0){
			return s*s*x;
		}
		else
		    return s*s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long x,n;
		System.out.println("Enter x value :");
		x = in.nextLong();
		System.out.println("Enter n value :");
		n = in.nextLong();
		
		PowerProg pp =  new PowerProg();
		
		System.out.println("The "+x+" Power "+n+" value is:" + Long.toString(pp.power(x,n)));
		//System.out.println("The 3 Power 25 value is:" + Integer.toString(pp.power(25,3)));
		//System.out.println("The 9 Power 25 value is:" + Integer.toString(pp.power(25,9)));

	}

}
