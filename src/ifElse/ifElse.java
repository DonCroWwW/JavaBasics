/**
 * 
 */
package ifElse;

/**
 * @author DonCroW
 *
 */
public class ifElse {

	
	public static void main(String[]args)
	{
		caseSensitive();
}
	
	
	public static void caseSensitive()
	{
		String a= "ana";
		String b= "Ana";
		if(a.equals(b))
		{
			System.out.println("The 1stevaluated expreison is not case sensitive");
		}
		else System.out.println("The 1stevaluated expresion is case sensitive!");
		
		
		
		
		
		if(a.toLowerCase().equals(b.toLowerCase()))
		{
			System.out.println("The 2nd evaluated expreison is not case sensitive");
		}
		else System.out.println("The 2nd evaluated expresion is case sensitive!");
		
		
		
	}
}

