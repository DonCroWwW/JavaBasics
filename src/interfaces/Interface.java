/**
 * difference between interface and classes
 * 
 */
package interfaces;

import java.util.*;

/**
 * @author DonCroW
 *
 */
public class Interface {

	public static void main(String args[])
	{
		List<Talk> hollaAtMe = new ArrayList<Talk>();
		Cat myCat=new Cat("Jasmina",12);
		Dog myDog=new Dog("Spike");
		Human me=new Human("Pet Lover");
		hollaAtMe.add(myCat);
		hollaAtMe.add(myDog);
		hollaAtMe.add(me);
		
		for (Talk el : hollaAtMe)
		{
			el.sayHello();
		}
	}
	
	public static void about()
	{

		System.out.println("They define particullary behavior of a class: walk, talk, eat, etc");
		System.out.println("A class IMPLEMENTS an interface, while a class extends another class");
		System.out.println("When a class implements an interface, it MUST IMPLEMENT the INTERFACE METHODS");
	}
	
}
