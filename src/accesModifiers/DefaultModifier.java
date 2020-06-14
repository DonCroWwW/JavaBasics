/**
 * 
 */
package accesModifiers;

/**
 * @author DonCroW
 *
 */
public class DefaultModifier extends foundation.AccesModifiers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scopeInJava();
		scopeOfDefault();
	}
	public static void scopeOfDefault ()
	{
		System.out.print(" \n \t\t DENY  ");  //GLOBAL
		System.out.print(" \t\t DENY   ");	  //PACKAGE
		System.out.print(" \t\t ALLOW");	  //CLASS
		System.out.print(" \t\t ALLOW   ");   //SUBCLASS
	}
}
