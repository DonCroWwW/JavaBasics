/**
 * 
 */
package accesModifiers;

/**
 * @author DonCroW
 *
 */
public class ProtectedModifier extends foundation3.AccesModifiers{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scopeInJava();
		scopeOfProtected();
	}
	public static void scopeOfProtected ()
	{
		System.out.print(" \n \t\t DENY  ");	//GLOBAL
		System.out.print(" \t\t ALLOW  ");		//PACKAGE
		System.out.print(" \t\t ALLOW");		//CLASS
		System.out.print(" \t\t ALLOW   ");		//SUBLCASS
	}
}
