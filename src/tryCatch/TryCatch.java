/**
 * 
 */
package tryCatch;

/**
 * @author Legion
 *
 */
public class TryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int ore[] = {1, 2, 3, 4};
		 System.out.println(ore[0]);
		 try
		 {
			 System.out.println(ore[100]);
		 } catch (Exception e)
		 {
			 System.out.println(e);
		 }

	}

}
