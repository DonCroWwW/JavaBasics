/**
 * 
 */
package lists;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author DonCroW
 *
 */
public class ListOfLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		listOfLists();
	}
	public static void listOfLists()
	{
		List <List<Integer>> listOfLists = new ArrayList<List<Integer>>() ;
		initializeListOfLists(listOfLists);			
		crossingList(listOfLists);
		printingList(listOfLists);
	}
	
	public static void initializeListOfLists (List<List<Integer>> l)
	{
	l.add(Arrays.asList(1,2,3));
	l.add(Arrays.asList(1,2,3,4));
		
	}
	public static void printingList(List<List<Integer>> l)

	{	System.out.println("Listele sunt: ");
		System.out.println(l.toString());
	}
	
	public static void crossingList(List<List<Integer>> l )
	{
		for ( List <Integer> headOfTheList : l)    //headOfTheList is the first element from each list, the pointer storage in the "l" list
		{
			for  (Integer a :headOfTheList)
			{
			
				System.out.print(a+" urmatorul element este ");
			
			}
			System.out.println();
		}
 		
	}
}



