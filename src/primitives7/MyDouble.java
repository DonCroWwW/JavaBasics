/**
 * 
 */
package primitives7;

/**
 * @author DonCroW
 *
 */
public class MyDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    about();
	    System.out.println("Some usefull think is that double has 2 infinty value and a NaN which stands for >> Not a NUMBER< ");
	    System.out.println( Double.POSITIVE_INFINITY +" " + Double.NEGATIVE_INFINITY + " " +Double.NaN);
	    System.out.println("Nan could be usefull if we wanna make the square root of a negative number for example ");

	}

	 public static void about()
		{
			
			System.out.println("the default value for a float is 0.0");
			System.out.println("the size of a float is " + Double.SIZE +"bits \n or "+Double.BYTES+"bytes, if you need it in bytes");
			System.out.println("Precision up to 16 digits"); 
		}
}
