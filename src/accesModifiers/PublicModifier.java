/**
 * 
 */
package accesModifiers;

/**
 * @author DonCroW
 *
 */
public class PublicModifier extends foundation3.AccesModifiers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scopeInJava();
		scopeOfPublic();
	}
	public static void scopeOfPublic ()
	{
		System.out.print(" \n \t\t ALLOW ");	//GLOBAL
		System.out.print(" \t\t ALLOW  ");		//PACKAGE
		System.out.print(" \t\t ALLOW");		//CLASS
		System.out.print(" \t\t ALLOW   ");		//SUBLCASS
	}

}
