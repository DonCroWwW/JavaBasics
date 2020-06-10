/**
 * 
 */
package arrays;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author DonCroW
 *
 */
public class IntArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//creatingArrays();
		keyboardInputForArrays();
	}	
	public static void creatingArrays()
	{
			
//		int[] cifre = new int[10] ;
//		 System.out.println(cifre.length);
//		 
//		 for(int i=0;i<cifre.length-1;i++)
//		 {
//			 cifre[i]=i;
//		 }
//		 
//		 for(int i=0;i<cifre.length;i++)
//			 System.out.println("Te aflii pe pozitia " +i+" in vecctorul tau, iar valoarea stocata pe aceasta poztie este : "+cifre[i]);
		
		
		 
		 int ore[] = {1, 2, 3, 4};
		 System.out.println(ore[0]);
		
		
	}

	
	public static void keyboardInputForArrays()
	{
		int valori[] = new int[5];
		
		Scanner tast = new Scanner(System.in);
		int i;
		for(i=0;i<valori.length;i++)
		{
			System.out.println("Intoruceti valorea pt pozitia: "+i);
			valori[i]= tast.nextInt();
			
		}
		
		
				
		
	}
}
