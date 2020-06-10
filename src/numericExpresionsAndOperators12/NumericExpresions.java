/*
 * more like a cast that a numericExpresions, but it has some sense so i will leave it like that for the mometn
 * 
 */
package numericExpresionsAndOperators12;

/**
 * @author DonCroW
 *
 */
public class NumericExpresions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ex1();//evaluation of expresion is made before casting

	}

	public  static void ex1()
	{
		System.out.println("Let's say we wanna divide 5 by 2 ");
		double rez= 5/2;
		System.out.println(rez+" yeah, not quite what we expected, because it uses INT division 5, 2 are int ");
		// double rez2=double(5/2); not gonna work
		System.out.println("what's the corect form of it?");
		int a=5;
		double b = a/2;
		System.out.println("What  else can we do?");
		double rez1= 5.0/2;  // that will do, we force the 5 to a double, in that way now it uses DOUBLE division
		System.out.println(rez1);
	}
	
	
	
}
