/**
 * 
 */
package overloading;

import foundation3.Methods;

/**
 * @author DonCroW
 *
 */
public class Overloading {

	
	public static void about()
	
	{
		System.out.println("Method overloading concept is that : we  can haave same method, but slightly different parameters( or numbers of parameterers which are called OPTIONAL PARAMETERS");
		System.out.println("Creating 2 methods with the same body, but different signature");
		Methods.signature();
		System.out.println("Will help us achive overloading");
	}
	
	
	public void testPar(int x)
	{ System.out.println(x);
		if(x%2==0)
			System.out.println("is even");
		else System.out.println("is odd");
	}
	
	public void testPare(int x, int y)
	{
	System.out.println(x+" "+y);
	   if((x+y)%2==0)
	     System.out.println("Numers are even");
	   else System.out.println("Numbers are not even");
	 
	}
}
