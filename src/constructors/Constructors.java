/**
 * 
 */
package constructors;

/**
 * @author DonCroW
 *
 */
public class Constructors {

	
	public static void about()
	{
		System.out.println("A constructor is pretty much just like a method, It's something we invoke");
		System.out.println("The major difference is that a constructor don't have a return type(or return type ofc)");
		System.out.println("Other major diference is that a constructor is ivoked/called with a NEW keyword");
		System.out.println("\t A constructor name must have the same name as the class he's in");
		System.out.println("The role of the consturctor is that we could instanti the object with certain values");
		System.out.println("\t When we create a custom constructor we won't be able to acces the default constructor"
				+ "\n Maybe we have a scenario when  an object  has to be initialized with values "
				+ "\n We can allways >>put back<< the default constructor by creating the default constr:  public CLASS NAME () {}");
	}
	
	
	public static void main(String[] args)
	{
		Water myAqua=new Water("Borsec");
		System.out.println(myAqua.name);    //normally i would use private and a getter, but that's just an example
		Water myWater=new Water("RomanianBottleOfWater",13);
		System.out.println(myWater.name+" has this capacity: "+myWater.capacity);
	}
	
	public static void aboutDefaultConstructor()
	{
		System.out.println("Might be usefull when we have a scenario where an object of a class doesen't have a field that must be initialized");
	}
}
