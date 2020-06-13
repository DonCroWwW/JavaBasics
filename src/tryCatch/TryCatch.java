/*
 * 
 * More to be added on this topic 
 * 
 */
package tryCatch;

/**
 * @author DonCroW
 *
 */
public class TryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		basicExample();

	}
	public static void basicExample(){
		 int ore[] = {1, 2, 3, 4};
		 System.out.println(ore[0]);
		 try
		 {
			 System.out.println(ore[100]);               //it will return a compile error: out of bounds
		 } catch (Exception e)
		 {
			 System.out.println(e);
		 }
	}
	
}
