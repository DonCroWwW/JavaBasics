/**
 * 
 */
package operators;

/**
 * @author Legion
 *
 */
public class TernaryOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String text="Is this that hard?";
		
		boolean hard = text.equals("C'mon is not that hard") ? true : false;
		System.out.println(hard);
		
//		translation:
//		boolean hard;
//		if(text.equals("C'mon is not that hard"))
//		{
//			hard=true;
//		}
//		else hard=false;
		
		
		
	}

}
