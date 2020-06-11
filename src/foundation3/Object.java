/*
 * 
 */
package foundation3;

/**
 * @author DonCroW
 *
 */

public class Object {

	public static void main (String[] args)
	{
		Class myCreatedObject=createObj();
		testing(myCreatedObject);


	}


	public static void about()
	{
		System.out.println("An object is an instance of a class");
		System.out.println("EX: Dacia is an instance of a car");
		System.out.println("Ex2: Gigel is an instance of a man");

	}
	public static Class createObj()
	{
		Class objectOfClass = new Class();
		objectOfClass.name="An object create like CLASS BLUEPRINT";
		return objectOfClass;

	}
	public static void testing(Class objectToBeTested)
	{
		System.out.println(objectToBeTested.name);
		objectToBeTested.method();
		
	}
}
