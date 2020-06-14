/**
 * 
 */
package interfaces;

/**
 * @author DonCroW
 *
 */
public class Cat extends Animals implements Talk {


	public void sayHello()
	{
		System.out.println("My name is: "+name);
		System.out.println("Meaow, love me");
	}
	
	public Cat(String chosenName, int chosenAge)
	{
		this.name=chosenName;
		this.age=chosenAge;
	}
	
}
