/**
 * 
 */
package primitives;

/**
 * @author DonCroW
 *
 */
public class MyInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int x=31; //primitive
		Integer y=3; //y= an object/ an instance of the Integer  -> 3 is "autoboxing"
		System.out.println(x);
		System.out.println(y);
		about();
		
		
	}

	public static void about()
	{
		System.out.println("The default value of an int is 0");
		System.out.println("The size of an int is 32bits");
	}
}
