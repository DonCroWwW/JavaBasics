/**
 * 
 */
package variables6;
import java.util.Scanner;

/**
 * @author DonCroW
 *
 */
public class Variables 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		about();
//	 	ex1(); // basic exemple why we need variables
//		ex2(); // arguments vs variable
//		ex3(); // diferent ways to initialize a string
//      ex4(); //final added to a variables make that a constant

	}
	public static void about()
	{
	System.out.println("Variables allow us to store information in some name so we can reffer to them latter");
	System.out.println("Variables-stores some values,while expressions- evaluates to a value, like concatenation of strings+text Arguments, ex2");
	System.out.println("The +  used to concatenate between strings is AN OPERATOR \n What does an OPERATOR DO? \n he work on operands"
			+ " 2strings in these example to PRODUCE A VALUE, just like in example 2");
	
	System.out.println("A LITERAL is the value of a variable, for exemple >>ANA<< >>Maria<< are literals of the variable name");
	System.out.println("A variable could also be initialized with an expresion(a combine of 2 literals, or 1 literal with 1 variable) using + if it's a string for example");
	
	
	
	}

    public static void ex1()
    {  
    	// basic exemple why we need variables
    	
    	
    	System.out.println("ex1");
    	int a=31131;
    	long mare=3123123;
    	long maiMare=a*mare;
    	System.out.println("Imagine having to remember the result of "+a+'*'+mare+" which is: "+maiMare+"Instead of store it in a variable");
    }

    public static void ex2()
    {
    	System.out.println("ex2");
//testing some variable
// arguments vs variable
    	
    	String myString= new String();
    	myString="I'm a variable storing a string"; 
    	System.out.println("You can print a text as an argument \n Or you can do it by using a variable :"+myString);
    	
    }

    public static void ex3()
    
    {
    	// easier way to declare a variable
    	
    	System.out.println("Since your most used way to declare a variable is by declaring TYPE + NAME and AFTER THAT to assign NAME to value \n"
    			+ "it may be time to start using the >>>easier<< way");
    	
    	// classic
    	String myString = new String();	
   	    myString="metoda clasica";
   	    
   	    
    	String myNewString= "metoda usoara";
    	
    	System.out.println("There is basically no difference between "+myString+" and "+myNewString);
    	
    	
    	
    }
    
    public static void ex4()
    {
		System.out.println("What if we want a variable that can not be changed? like PI or e? \n we just add final to the declaration of it");
		final double PI=3.14159;
		System.out.println("Good to use when we have a global variable that don't need to be changed");
    }
}

