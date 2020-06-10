/**
 * 
 */
package random;
import java.util.Random;
/**
 * @author Legion
 *
 */
public class MyRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random myRandomObject= new Random();

		int n=myRandomObject.nextInt(10);
		System.out.println(n);
		int k=0;
		for(int i=0; i<=9;i++)
		{
			if(i==n)
			{
				System.out.println("Am gasit random numarul: "+n);
			// 	break;
			}
			k++;
			System.out.println("Am facut "+k+" iteratii");
			
			
			
		}
		
		
	}

}
