/**
 * 
 */
package keywords;

/**
 * @author DonCroW
 *
 */
public class Execute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static void  testingStatic()
	{
		Static.staticMethod();
//		Static.nonStaticMethod;  // it's out of the class scope, Class.NonStaticMethod can't be chose from class methods
		Static myStaticObject= new Static();
		myStaticObject.staticMethod(); // i can call this NON STATIC METHOD from an object of my class
		myStaticObject.nonStaticMethod();// now I can call the NON STATIC METHOD from an object of my class
		
		
	}
}
