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
