/**
 * 
 */
package variables6;

/**
 * @author DonCroW
 *
 */
public class Initialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Declaration.variableCreation();
		reinitiliaztionEx();
		System.out.println("What if we want a variable that can not be changed? like PI or e? \n we just add final to the declaration of it");
		final double PI=3.14159;
		System.out.println("Good to use when we have a global variable that don't need to be changed");
		final double PIPI=3.141590000;
		
		
		
		

	}
	
	public static void reinitiliaztionEx() {
		int x=0;
		while(x<5)
		{
			System.out.println(x);
			x++;
			System.out.println("A variable could be reinitialize as many times as we like");
		}
	}

}
