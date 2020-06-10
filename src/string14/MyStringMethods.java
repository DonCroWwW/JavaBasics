/**
 * 
 */
package string14;

import java.util.Scanner;

/**
 * @author DonCroW
 *
 */
public class MyStringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//createString();
		//about();
		//charAt();
		//specialCharacters();
		//easierConcatenate();
		//formatEx();
		//contains();
		//indexOf(); // lastIndexOf
		//manipulateString(); //lower/upper/trim
		//equals();
		//guess();
		//comparasion();
		interning(); //!!!!
		
	}


	public static void createString ()
	{ 
		System.out.println("How we creat a string?");
		String name1= "gigel";
		int i=132;
		String name2= new String("Gigelinho");
		// it works the same way since the constructor is gonna work "behind the scenes"
		System.out.println("When we create a string, we create an object, an instance of a class ");

		System.out.println(name1.concat(name2));
		System.out.println(String.valueOf(i));
	}

	public static void about()
	{

		System.out.println("String is not a primitive, it is a class \n a primitive is char, which can hold only 1 character ");
		System.out.println("String class has some static methods-> which we can call without creating an object like valueOf"
				+ "\n But it also have some instance methods, which we can call AFTER we create an instance(object) like name.CONCAT");
	}

	public static void charAt()
	{
		String a="abcdefghij"; 
		int i=a.length()-1;
		while(i>=0)
		{
			System.out.println(a.charAt(i));
			--i;
		}

	}

	public static void specialCharacters()
	{
		System.out.println("Since you allready had a problem with \\n now u are able to use it "
				+ " \n also u can use: \' and \" to quotation marks"
				+ " \n \\ for backslash"
				+ " \n \b for backspace "
				+ " \n \r to carriage return"
				+ "	\n \f formfeed?? ");
	}

	public static void easierConcatenate() 
	{
		String a = "apples";
		System.out.println(a);
		a += " and bananas";
		System.out.println(a);
		//also works with:
		System.out.println(a.concat(" and oranges"));
		System.out.println("Difference is that \"a+=\" formats the string while \"a.concat\" is not formating the string " );

	}

	public static void formatEx()
	{


		String name1="gigel ";
		String name2="sandel";
		String y= String.format("My name is: %s %s" , name1, name2);
		System.out.println(y);


	}

	public static void 	contains()
	{
		String name = "Ana";
		String prop = "Ana are mere";
		boolean a= prop.contains(" ");
		System.out.println(a);
	}

	public static void  indexOf() {
		String a="lala ana n-are mere";
		String b="ana";
		int c= a.indexOf('a');
		System.out.println("first pozition we found is " +c);
		//indexOf is an overloaded method ( it has more parameters, but only some of them are requiered to work, it has more than needed->overload
		int e=a.indexOf('a',8); // 8 is the starting position( from 0 to string.lenghth() -1; )
		// if i need the secccond apparence of a character we could asswell just 
		//					start shearching from the pos where we find the first apperence +1, it makes sense, right?
		int f=a.indexOf('a',a.indexOf('a')+1);

		System.out.println("first pozition of \'a\' starting with poz 8-1 is: "+e+"  seccond pozition of a is : "+f);


		//		int d= a.lastIndexOf("ana");
		//		System.out.println(d);
		//works with char and string, when u use string, u need to be carefull about the length of the string u need to find;
	}

	public static void manipulateString()
	{

		//String myText="       AsEaRa,    ErAm La GaRa       ";
		//System.out.println(myText.toLowerCase());
		//System.out.println(myText.toUpperCase());
		//System.out.println(myText.strip()); // removes the first and the last spaces including spaces/tabs and new line 

		String myNewText="0123456789";
		System.out.println("My initial string is "+myNewText);
		String mySubText=myNewText.substring(3);
		System.out.println("\t My text starting from pos3 is : " +mySubText);
		String mySubText2=myNewText.substring(3,7);
		System.out.println("It includes the first argument position(pos4 which is 3)"
				+"\n \t \t"+mySubText2+
				"\nBut it doesen't include the last argument position(pos7 which is 7)");
	}

	public static void equals()
	{
		String a= "Ana";
		String b= "ANA";
		String c= "Nana";
		String d= "NANA";
		String e= "ANNA";
		System.out.println(d.equals(e));
		System.out.println(a.toUpperCase().equals(b));
	}


	public static void guess()
	{
	 String word="mu";
	 Scanner myScanner= new Scanner(System.in);
	 String typedWord;
	 int count=0;;
	 boolean ok=true;
	 
	 while(ok)
	 {	
		 
		 if(count>-1)
		 { System.out.println("The world u are looking for has "+word.length()+" letters");
		 }
		 if ((count>5&(word.length()>2)))
		 {
			System.out.println("The 2rd letter u are looking for is: "+word.charAt(1));
			
		 } 
		 if ((count>10)&(word.length()>3))
		 {
			 System.out.println("The 3rd letter u are looking for is "+word.charAt(2));
		 }
		 if (count>15)
		 {
			 System.out.println("\t U SUCK!! The word u were trying to guess is : " +word );
			 ok=false;
		 }
		 
		 
		 
		 System.out.println("Try to guess the world: ");
		 typedWord= myScanner.nextLine();
		 count++;
	 if(word.equals(typedWord))
	 {
		 System.out.println("\t\t Congrats, you guessed the word, impressive");
		 ok=false;
	 }
	
	 
	 
	 
	}
}

	
	public static void comparasion()
	{
	 // it's ussually made by the opeartor " == "
	 // but, since for a="ana" and b="ana" a=b, for objects it won't work, since an object has more methods/property/fields 	
	System.out.println("Carefull! since STRING is not a primitive, a STRING is storaged as an object, which is stored by a pointer"
			+ "That means that when u are gonna compare an A string to B string using "==" it will return false, since it will compare the memory reference"
			+ "And not the actuall value of the String, which is compared by .equals ");	
	
	
	 
		
	}

	public static void interning()
	{
		String a = "ana";
		String b = "ana";
		System.out.println(a==b);
		System.out.println("Why? since a,b are strings, stored by reference and not by value(primitives");
		System.out.println("Java is seeing that those literals have the same value and to save memory it allocates memory once and reference both"
				+ "to that reference, so if  we have 10000k strings with the same literal it may save us some space, but it may not allways work that way"
				+ "by default it should be false, but  it;s actually going  to be true");
	}
}

