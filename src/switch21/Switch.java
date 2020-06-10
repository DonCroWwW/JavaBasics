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
		String name ="gigel";
		Scanner myScanner= new Scanner(System.in);
		System.out.println("What's your name?");
		name=myScanner.nextLine();


		switch(name)
		{
		case "gigel" :
			System.out.println("In this case gigel is the name");
			break;
		case "gigica":
			System.out.println("yeah, it works");
			break;
		default :
			System.out.println("Hmm, this became interesting");
			break;
		}

	}

}
