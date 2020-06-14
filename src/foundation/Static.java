/*
 * How it works, when is most ussually used/ not used 
 * + examples
 *  
 */
package foundation;

/**
 * @author DonCroW
 *
 */
public class Static {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		about();
		ex1(); 	
		// How can we use a method WITHOUT creating an instance OF THE CLASS? we use Static in method statement	
		// Ok, but how can we acces a method without static?
		// In this case we need to create an instance 
		// var x = new Static();  // CREATING AN OBJECT
		// x.ex2();// What we have done, we acces the method by an instance of the class		
	}

	public static void ex1() 
	{
		System.out.println("In this method STATEMENT(declaratie) >>STATIC<< has been used ");
		System.out.println("Which means, that I  can be used without creating an instance of the CLASS(static)");	 
	}

	public  void ex2()
	{
		System.out.println("This method doesen't contain static statment");
	}

	public static void about()
	{
		System.out.println("Java is an OrientedObject Language"
				+ "We can consider a class being a FACTORY which creates objects");

		System.out.println("When we use static into a method we basically tell the compiler:"
				+ "Holla, we don't have to create an INSTANCE to use this method ");

		System.out.println("static means -> NO instance OF A CLASS is needed");
	}

}
