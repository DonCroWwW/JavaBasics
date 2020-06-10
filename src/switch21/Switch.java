/**
 * 
 */
package switch21;

import java.util.Scanner;

/**
 * @author DonCroW
 *
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findGigel();

	}
	
	public static void findGigel()
	{
		String name ="gigel";
		Scanner myScanner= new Scanner(System.in);
		System.out.println("What's your name?");
		name=myScanner.nextLine();


		switch(name)
		{
		case "gigel" :
			System.out.println("gigel, i was looking after you for a while");
			break;
		case "gigica":
			System.out.println("gigica, how u seen gigel?");
			break;
		default :
			System.out.println("Hmm, seems like you are not the person i was looking for");
			break;
		}
	}

}
