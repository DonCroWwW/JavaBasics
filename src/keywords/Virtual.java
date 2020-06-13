/**
 * 
 */
package keywords;

/**
 * @author DonCroW
 *
 */
public class Virtual {
	
	
	public static void about()
	{
		System.out.println("In Java in order to override a method, the main method(which will be overrided) MUST BE VIRTUAL");
		//why does it work to override methods without adding virtual to the main method?
		System.out.println("In java most methods are virtual by default");
		// why most and not all?
		System.out.println("Well,the exceptions are: static methods aren't virtual and private methods");
		// why these methods aren't static?
		System.out.println("Well, in the case of private methods: Since it's acces modifier doesn't allow subclasses"
				+ "to acces main class methods, it has no point on making a method able to be overrided if we can't ever override it ");
		System.out.println("Well, we use static in general to create a general method for all instnaces of the class"
				+ "if we would be able to override that method what would be the point of static then"); //?
	}

}
