/**
 * 
 */
package arrays;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * @author DonCroW
 *
 */
public class ArrayToList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String a[]= {"Ana","are","adas","sda","sdada"};
		List<String> testA = Arrays.asList(a);
		about();
		
		ArrayList<Integer> myArrayList = new ArrayList <Integer> ();
		myArrayList.add(3);
		myArrayList.add(4);
		myArrayList.add(5);
		myArrayList.add(7);
		
		
		System.out.println(myArrayList.toString());
		System.out.println(myArrayList.get(1));
		myArrayList.set(1,10);	
		System.out.println(myArrayList.get(1));
		myArrayList.add(1, 111);
		System.out.println(myArrayList.get(1));
		System.out.println(myArrayList.get(2));
	}
	
	
	
	
	public static void about()
	{
		System.out.println("The pattern for an ArrayList creation is: \"ArrayList <type> name = new ArrayList <type>() \" ");
		System.out.println("The catchy part is that ArrayList type must have an OBJECT as a type, and not a primitive type");
	}
	
}
