/**
 * 
 */
package keywords;

/**
 * @author DonCroW
 *
 */
public class Static {

	/**
	 * @param args
	 */
	

	
	public static void about()
	{
		System.out.println("Static is a usefull keyword in java");
		System.out.println("When we use STATIC in a method declaration we allow that method to be called without an instane of it's class");
		System.out.println("In the other words: we don't need to create an instance of that class in order to use that method");
		System.out.println("It's used to enable a way in which you can give more instances the same method");
		//could be rephrased better, but it will help u  understand it
	    System.out.println("If i try to  call a NON STATIC METHOD by CLASS.NonStaticMethod this method won't be availbe, compiler won't see it");
	    
	} 

	public static void staticMethod() // i could had made the function with return instead of printing to console, but that's not the point
	{
		System.out.println("This is a STATIC METHOD");
		System.out.println("If the keyword static is missing it will retrun a compiling error");
	}
	
	public void nonStaticMethod()
	{
		System.out.println("This is a NON-STATIC METHOD");
		System.out.println("You can only call this method after you create an instance of the CLASS in which i was declared");
	}
	
	public static void  testingStatic()
	{
		Static.staticMethod();
//		Static.nonStaticMethod;  // it's out of the class scope, Class.NonStaticMethod can't be chose from class methods
		Static myStaticObject= new Static();
		myStaticObject.staticMethod(); // i can call this NON STATIC METHOD from an object of my class
		myStaticObject.nonStaticMethod();// now I can call the NON STATIC METHOD from an object of my class
		
		
	}
}

