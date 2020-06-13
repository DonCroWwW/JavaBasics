/**
 * 
 */
package overRiding;

/**
 * @author DonCroW
 *
 */
public class ex1 extends Overriding{
	
	public static void about()
	{
		System.out.println("This function was created just as an example");
		System.out.println("This will print to console a different object from the main class ");
	
	}
		//in this class we OVERRIDE  the main method about(), so if we call ex1.about it will call this class method, instead of the main class method
}
