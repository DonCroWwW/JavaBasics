/**
 * 
 */
package enumEration;

/**
 * @author DonCroW
 *
 */
public class Enum {
	
	
	
	public static void main(String[] args)
	{
		Member newMember = new Member();
		newMember.name="GIGEL";
		newMember.subscription=newMember.subscription.SILVER;
		System.out.println(newMember.name+" has a subscription type of: "+newMember.subscription);
	}
	
	
	public static void about()
	{
		System.out.println("We can create a new field with enum, fields which could have certain values that we assign");
	}
	
	
}
