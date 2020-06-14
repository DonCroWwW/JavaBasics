/*
 *  folder to be added
 * 
 */
package inputAndOutput;
import java.util.Scanner;
/**
 * @author DonCroW
 *
 */
public class Input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// keyboardInput();
		// askEx();
		// scannerEx();
		// usingByteEx();
		// inputCast(); // ?/

	}
	public static void keyboardInput()
	{
		System.out.println("In Java we need to import <<java.util.Scanner>> in order to input values from the keyboard");

		System.out.println("Test our method by typing something here: ");

		Scanner myKeyboardScanner = new Scanner(System.in);

		String text = myKeyboardScanner.nextLine();

		System.out.println(text);


		// we can not use import, but instead we should use java.util.Scanner any time we reffer to Scanner type
		// the format of creating an instance is : type identifier(name) = new type(); 
		//Scanner= blueprint, just like a class
		//System.in = where we are getting our imput from( keyboard/console)

	}


	public static void askEx()
	{
		Scanner myScanner= new Scanner(System.in);
		System.out.println("Type your name here:  ");

		String yourName = myScanner.nextLine();

		System.out.println("Your name is "+yourName);

	}

	public static void scannerEx()
	{
		System.out.println("The way we input values is very important, in that way we tell the computer what operations he needs to do");

		Scanner myScanner= new Scanner(System.in);

		String string1= new String("this is your string");
		
		int inputX;

		System.out.println("Enter the value for your string: ");
		
		String inputString=myScanner.next();

		System.out.println("Enter the value for your int");
		
		inputX=myScanner.nextInt();

		System.out.println("Good Job! \n Now, it's important for you to know that you have to specify the data type of your inputs "
				+ "\n Why is that? \n Well, let's see, if you want to use the operator + with your inputs you will get different results"
				+ "\n That's the result if you +(concatanate) your string:" + string1 +inputString 
				+ "And there is your number multiplied by itself: "+inputX*inputX);

	}


	public static void usingByteEx()
	{
		Scanner myScanner= new Scanner(System.in);
		byte baza10=myScanner.nextByte(5);
		byte baza2=myScanner.nextByte(4);
		byte asciiCharacter= myScanner.nextByte();

		System.out.println(baza10+' ' + baza2 +' '+asciiCharacter );


	}


	public static void inputCast()
	{
		System.out.println("Storing an int in a double for some unkown reasons :D ");

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter an int as input");
		double x = myScanner.nextInt();
		System.out.println("There is your input as double: "+x);

		System.out.println("What is the other way around? if we have a double, but we only need the main(int) value? ");

		//	 int y= myScanner.nextDouble();
		System.out.println("That's gonna throw an exception, since the zie of an int is 16, but the size of a double is 64 "
				+ "\n Solution? We just force the initialization to an int USING A CAST"
				+ "\n Enter a double: "); 
		int y=(int)myScanner.nextDouble();
		System.out.println("The main size of your double number: "+y );
	}
}




