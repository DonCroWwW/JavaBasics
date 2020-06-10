/*
 * max,compare, valueOf, parseInt
 * 
 */
package numericMethods13;


/**
 * @author DonCroW
 *
 */
public class IntegerMethods extends foundation3.Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		about();
//		maxEx(); //basic way to use max;
//		compareEx();
//		valueOfEx(); // difference betwwen valueofEx > OBJECT< and parseOfEx > PRIMITIVE<


	}
	
	public static void maxEx()
	{	
		System.out.println("That's a static method-> we can call it on the Integer/Double class "
				+ "\n  we don't have to create an instance of that class in order to use it");
		// if it wasn't static we should have done like : Integer myInteger=23; myInteger.max(a,b) 
		int a=5; 
		int b=6;
		System.out.println(Integer.max(a, b));
		double c=13.45;
		double d=141.60;
		System.out.println(Double.max(c, d));
	}

	
	
	public static void  compareEx(){
		System.out.println("by default eq=0, higher =1, lower=-1");
		int x=4;
		int y=4;
		System.out.println(Integer.compare(x, y)+"     in this case x is: " +x +" and y is : " + y);
		
	}
	
	
	
	public static void valueOfEx()
	{
		String numar= "12121";
		System.out.println(Integer.valueOf(numar));
		System.out.println(Integer.parseInt(numar));
		System.out.println("it has the same value, but the difference is that valueOf is an object and parseInt is a primitive");
		Integer myInteger=Integer.valueOf(numar);
		int a =Integer.parseInt(numar);
		
		System.out.println("The object: " + myInteger +"  The primitive " + a);
		
	}
}
