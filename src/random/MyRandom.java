/**
 * 
 */
package random;
import java.util.Random;
/**
 * @author DonCroW
 *
 */
public class MyRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random myRandomObject= new Random();  												  //instantiate
		int maxValue =20;																   	  //setting the max value for my random
		int n=myRandomObject.nextInt(maxValue);     										  //create "n" as my random Int
		System.out.println("\t"+n+" has been generated random from 0 to"+maxValue);			  //printing the random number
		findRandom(n);  // O(n) loop to find our random


	}

	public static void findRandom(int n)
	{ 
		for(int i=0; i<=n;i++)											//we use a loop from 0 to the current number	
		{
			if(i==n) 													//if the curent iteration is equal to our random number
			{
				System.out.println("Your random number is: "+n);		//print text

			}
			else System.out.println("Your number is greater then: " +i); //otherwise we print text

		}
	}

}
