/**
 * 
 */
package argumentsAndParameters4;

/**
 * @author DonCroW
 *
 */
public class Arguments {

	/**
	 * @param args
	 */
	
	
	//runByTerminal(args[0]);// Exemple of how to use arguments in a terminal


	public static void about()


	{
		System.out.println("An argument is what we pass to a method");
		System.out.println("Why do we need arguments? ");
		System.out.println("To make dynamic programs");

	}

	public static void runByTerminal(String x) //// If we run this program without an Argument it will return a RUNTIME ERROR
	{
		System.out.println("What's your name? ");
		System.out.println("Hello " +x+"!!!");

		//shortcut for terminal run: java D:/git/java/javaBasics/src/argumentsAndParameters4/Arguments.java replaceNameHere
		//also works with multiple arguments args[1], args[2] etc
	}

}
