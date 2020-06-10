/**
 * 
 */
package numericExpresionsAndOperators12;

/**
 * @author Legion
 *
 */
public class MyOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		about();
		incrementationEx();//difference between x++ and ++x;1
		ex2();// short verison of x=x*5 is x*=5;

	}

	public static void about()
	{
		System.out.println("The basic operators are: +  -  : * %	\n but there are more");
		System.out.println("There are some unary operators such as cast-> double() / (float)"
				+ "and there are some binary operator like math.powr(a,b) ");
		System.out.println("The precedence is from left to right, which means that if we have 3 % 2 * 2 it will make them in order of oppearance");
		System.out.println(35%14*8);


	}

	public static void incrementationEx() {
		int x=2;
		int y=2;
		while(x<100) {
			x=x*2;
			System.out.print("x=");
			System.out.println(x);
		}
		while(y<100)
		{
			y*=2;	
			System.out.print("y=");
			System.out.println(y);
		}
	}
	
	
	public static void ex2() {
		System.out.println("It may save you some time");
		int x=5;
		x=x*7;
		int y=5;
		y*=7;
		System.out.println(x+" "+ y);
		
	}
}
