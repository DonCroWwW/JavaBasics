/**
 * 
 */
package foundation3;

/**
 * @author DonCroW
 *
 */
public class Fields {

	String thisField; //example of a string field
	int otherField;   //exemple of an int field (very impressive)


	public static void about()
	{
		System.out.println("A field is a propriety of a class");
		System.out.println("The diference between a field and a variable is that a field is declared inside of a class, while a variable is declared inside of a method");

	}

	
	public static void readOnlyFields()
	{
		System.out.println("To achieve read only fields in a class u need :");
		System.out.println("An abstract class");
		System.out.println("To set the field to private in your class");
		System.out.println("A non-static Contstructor who initialize the fields");
	}
}
