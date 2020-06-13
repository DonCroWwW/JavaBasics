/**
 * 
 */
package keywords;

/**
 * @author DonCroW
 *
 */
public class Abstract {

	
	public static void about()
	{
		System.out.println("\t when we talk about an ABSTRACT CLASS:");
		System.out.println("An abstract class is basically a template, we can use it to create other classes with the same properties as our"
				+ "abstract class, but we can't create an instance of the class itself");
		System.out.println("Common example: we want to create an animal, but we can't create an animal without knowing "
				+ "what type do we want to create? a dog, a cat, kangoroo, tiger, sheep? they are all animals(abstract class)"
				+ "but we need to identify the extended class of animal before creating an instance of that animale	");
		
		System.out.println("\t When we talk about an ABSTRACT METHOD");
		System.out.println("We can make the analogy to an abstract class:");
		System.out.println("When we add abstract to a class, we make that CLASS UNNABLE TO HAVE A BODY");
		//why would we ever want to do that?
		System.out.println("It may be usefull, because it could stil be overrided, but we can allready override a method anyway");
		System.out.println("Well, adding ABSTRACT to a method it will make that method MUST OVERRIDEABLE");
		System.out.println("All classes that extends the main class with an abstract method must create their own body for the main class abstract method");
		System.out.println("Could be usefull in getters and setters if we want to keep the enclapsulation i guess?");
	}
}
