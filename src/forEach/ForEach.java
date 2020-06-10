/**
 * 
 */
package forEach;
import java.util.*;

/**
 * @author DonCroW
 *
 */
public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List <Integer> listWithElements = Arrays.asList(1,23,4,5,6);
		
		exempleUsingForEach(listWithElements);// it will receive a list and it will print number of elemnts of that list

		


	}
	
	public static void exempleUsingForEach(List<Integer>l)
	{
		
		int count=0;
		System.out.println(l.toString());
		for (int element: l)
		{
			count++;

		}
		System.out.println("Our list contains "+count+" elements");
	}
	
	
}






