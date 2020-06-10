/**
 * 
 */
package breakContinue;



/**
 * @author DonCroW
 *
 */
public class Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		breakUsage();  // it will break at first odd iteration

	}
	
	public static void breakUsage() 
	{
		for(int i=0;i<=10;i++)
		{
			
			if((i%2)!=0) 
			{
				
				System.out.println(i); //code will go on even if the condition is 
				break;
			}
			
				
		}
		
	}

	
}
