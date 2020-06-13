/**
 * 
 */
package passing;
import testingEncapsulation.PrivateFieldsUser;
/**
 * @author DonCroW
 *
 */
public class Refference {



	public static void about()
	{
		System.out.println("A refference is reffered to a certain memory container allocated for an object");
	}

	
	public static void refferencePassing(PrivateFieldsUser myUser)
	{
		System.out.println("This method is called by passing a user refference");
		System.out.println("From that usage memory container(refference) we are able to acces different fields/properties of that object");
	    myUser.getInfo();  // will return info about our user
	    
	
	}

}
