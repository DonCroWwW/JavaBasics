/*difference between Arguments and Parameters*
 * 
 */
package argumentsAndParameters;

/**
 * @author DonCroW
 *
 */
public class Parameters {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		about();
	}



	public static void about()
	{
		System.out.println("Similar to an argument, but not the same, let's give some exemple to help consolidate that");
		System.out.println("For the void function: Parameters is the variable that's going to STORE that DATA like STRING[] args");
		System.out.println("While the argument is the data itself!! GIGEL=ARGUMENT, args[0] is the parameter");
		System.out.println("However, for the println method,we are using an argument and not a parameter");
		System.out.println("All that being said, when we DECLARE a method we are requiring a parameter, but when we CALL a method we use an argument");


	}




}
