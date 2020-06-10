/*
 * 
  A basic conversion from a list of lists into an array

  as an exercise you could try to convert it to 2d 	
 */
package lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author DonCroW
 *
 */
public class toArray extends ListOfLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List <List<Integer>> listOfLists = new ArrayList<List<Integer>>();//creating an instance of a listOfLists
		initializeListOfLists(listOfLists);		// init  calling supper class method
		printingList(listOfLists);				// a method to print elements of the lists 
		printArray(converting(listOfLists));    // printing the new array


	}

	public static void printArray(int a[])      //printing an array 
	{
		System.out.println("Elementele vectorului sunt: ");  
		for (int elementsOfA: a)						// crossing through each element of our vector
			System.out.print(elementsOfA+" ");
	}


	public static int[] converting(List<List<Integer>> l) //returning an array with the elements of the list passed 
	{	
		int totalSize = listOfListsSize(l);  //used not to get out of reach
		
		int newArray[] = new int[totalSize]; //max numbers of the new array elements is the combined size of the lists
		
		int i=0;  // used to count the current position of vector

		for (List<Integer> subList : l)  //for each subList
		{
			for ( Integer el : subList)  //for each element of the sublist
			{
				newArray[i]=el;			// the current element in our listOfLists is copyed into the array on position "i"
				i++;					// increasing the position in array to prevent overwriting
			}
		}

		return newArray;				//returning our array 
	}


	public static int listOfListsSize(List<List<Integer>> l) //crosing list and for each element we iterate our counter
	{	
		int size=0;

		for (List<Integer> subList : l)
		{
			for (Integer el : subList)
			{
				size++;
			}
		}
		return size;

	}
}
