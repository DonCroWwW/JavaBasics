/**
 * 
 */
package numericExpresionsAndOperators12;

/**
 * @author DonCroW
 *
 */
public class TernaryOperator extends MyOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myText="Is this that hard?";
		ternaryExample(myText); 
		defaultExample(myText);
	}
	
	
	public static void ternaryExample(String text) 
	{

		boolean hard = text.equals("C'mon is not that hard") ? true : false;
		System.out.println(hard);

	}
	
	public static void defaultExample(String text)
	
	{
		boolean hard;
		if(text.equals("C'mon is not that hard"))
		{
			hard=true;
		}
		else hard=false;
		System.out.println(hard);
	}
	
	
}