/**
 * 
 */
package interfaces;

/**
 * @author DonCroW
 *
 */
public class Dog  extends Animals implements Talk {
	public void sayHello()
	{	System.out.println("My name is : "+name);
		System.out.println("Hi, I'm usually not using words, but i'm loyal and also your best freinds");
	}
	
	public Dog(String chosenName)
	{
		this.name=chosenName;
	}
}
