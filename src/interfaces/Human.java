/**
 * 
 */
package interfaces;

/**
 * @author DonCroW
 *
 */
public class Human implements Talk{
	public String name;
	
	public void sayHello()
	{
		System.out.println("I'm a simple human being, i see pets, i love pets");

	}
	
	
	public Human(String chosenName)
	{
		this.name=chosenName;
	}
	
}
