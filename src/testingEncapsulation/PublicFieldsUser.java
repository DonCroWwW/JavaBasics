/**
 * 
 */
package testingEncapsulation;

/**
 * @author DonCroW
 *
 */
public class PublicFieldsUser extends User {

	public String name;
	public int age;
	public boolean sex; // true for man   false for women

	public  void about()
	{
		System.out.println("About a public fields User");
	}
}
