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
		int count=0;
		System.out.println(listWithElements.toString());
		for (int element: listWithElements)
		{
			count++;

		}
		System.out.println("lista are "+count+" elemente");
		System.out.println(listWithElements.toString());


	}
}






