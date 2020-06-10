/**
 * 
 */
package lists;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
/**
 * @author DonCroW
 *
 */
public class MyList {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		sortUsingCollections();
		reverseUsingCollections();
//		simplyRemove(list); removing elements 1by1 starting with last position
//		convertArrayToList();
		
	}
	
	public static void about()
	{
//		System.out.println(list.toString());
//		System.out.println("does my list contains the object 3? : "+ list.contains(3));
// 		System.out.println(list.isEmpty()); // might be usefull
//   	list.clear will remove every element

	}
 
	public static List<Integer> initList() //returns an initialized list
	{
		List <Integer> newList= new ArrayList();
		newList.add(10);
		newList.add(5);
		newList.add(20);
		newList.add(15);
		System.out.println("Lista initializata este: "+newList.toString());
		return newList;
		
	}
	
	public static void simplyRemove(List l) //removes elements of a list 1 by 1
	{
		 System.out.println("Lista initiala: " +l.toString());
		while(!l.isEmpty())
		{
			l.remove(l.size()-1);
			System.out.println("Elementele ramase in lista: "+l.toString());
		}
		
		//could be replaced by list.clear
	}
	
	public static void convertArrayToList() //using the list interface for an array
	{
			System.out.println("Just use () instead of {} ");
			List <Integer> myList= 	Arrays.asList(1,3,2,312,3123,1,321,31);
			System.out.println(myList.toString());
			
	}
	
	public static void sortUsingCollections() // sorting a list using Collections
	{
		List<Integer> myList = new ArrayList();
		myList=initList();
		Collections.sort(myList);
		System.out.println("Lista ordonata este: " +myList.toString());
	}
	
	public static void reverseUsingCollections() //reverse a list using Collections
	{
	   List<Integer>myList= new ArrayList();
	   System.out.println("Lista originala este : "+myList.toString());
	   myList=initList();
	   Collections.reverse(myList);
	   System.out.println("Lista in ordine inversa este : "+myList.toString());
	   
	}
}
