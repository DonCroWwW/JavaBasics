/**
 * 
 */
package accesModifiers;

/**
 * @author DonCroW
 *
 */
public class PrivateModifier extends foundation.AccesModifiers{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scopeInJava();
		scopeOfPrivate();
	}
	public static void scopeOfPrivate ()
	{
		System.out.print(" \n \t\t DENY  ");	//GLOBAL
		System.out.print(" \t\t DENY  ");	    //PACKAGE
		System.out.print(" \t\t ALLOW");		//CLASS
		System.out.print(" \t\t DENY  ");		//SUBCLASS
	}

}


