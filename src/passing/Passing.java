/**
 * 
 */
package passing;

/**
 * @author DonCroW
 *
 */
public class Passing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void about ()
	{
		System.out.println("By the books Java is said to be passed by value, but ! what happens when we have an Object type parameter? ");
		System.out.println("Well, we have to pass it by refference");
		System.out.println("What's the catch here?");
		System.out.println("Well, let's say we want to increment a number");
		System.out.println("When we call the itteration method by a value, let the value by 4 for ex, no matter how many times we call that method"
				+ "the result will be the same, since we aren't storring the value changes, every time we cann itt(4) it will return 5, no matter what");
		System.out.println("On the other hand, when we itterate a number property, let's say age"
				+ "every change made to the value will be storage, since the object is storage, the feilds of it will also have a memory container"
				+ "when we call the method seccond time, it will read the itterated value of that object container");
		
	}
	
}
