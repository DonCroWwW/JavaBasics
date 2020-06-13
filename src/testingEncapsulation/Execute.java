/**
 * 
 */
package testingEncapsulation;


/**
 * @author DonCroW
 *
 */
public class Execute {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

	  
	}

	public static void testingBothWays()
	{  
		System.out.println("Creating an object of a class  without using encapsulation: ");
		defaultCreateAndPrint();
		System.out.println("Creating an object of a class  using encapsulation: ");
		encapsulationCreateAndPrint();

	}

	public static void defaultCreateAndPrint()

	{
		PublicFieldsUser  myUser=createAnUser("GIGEL",16);
		printAnUser(myUser);
	}

	public static PublicFieldsUser createAnUser(String name, int age)
	{
		PublicFieldsUser user = new PublicFieldsUser();            
		user.name=name;  //in order for this to work fields of the class must be public
		user.age=age;
		return user;

	}
	
	public static void printAnUser(PublicFieldsUser a)

	{
		System.out.println("For the user: "+a);
		System.out.println("We have: \n Name: "+a.name.toString()+" \n Age: "+a.age);
	}

	public static void encapsulationCreateAndPrint()
	{
		int chosedAge=20; String chosedName ="Gigica";
		PrivateFieldsUser privateFieldsUser= new PrivateFieldsUser();
		privateFieldsUser.setAge(chosedAge);
		privateFieldsUser.setName(chosedName);
		System.out.println("For the user: " +privateFieldsUser);
		System.out.println("We have: \n Name: "+privateFieldsUser.getName()+" \n Age: "+privateFieldsUser.getAge());
		

	}
	public static void testingSettersAndGetters()
	{PublicFieldsUser myExUser = new PublicFieldsUser();            
	myExUser.name="name";  //in order for this to work fields of the class must be public
	myExUser.age=13;
	myExUser.name="31231";
	PrivateFieldsUser myEncapsulatedUser = new PrivateFieldsUser();
//	myEncapsulatedUser.name="name"; //error-> this field is not visible
	myEncapsulatedUser.setName("name"); //that is gonna work
		
	}

	public static void testingOverriding()
	{
		PrivateFieldsUser u = new PrivateFieldsUser();
		u.setInfo("Gigi", 13, true);
		System.out.println(u.toString());
	}
	
	public static void testingPassing()
	{	
		PrivateFieldsUser u = new PrivateFieldsUser();
		u.setInfo("Gigi", 13, true);
		int x=13;
		System.out.println(u.toString());
		System.out.println("Value of x is: "+x);
		for(int i=0;i<=1;i++)
		{
		u.incrementAge();
		System.out.println("Am incrementat u.age"+u.toString());
		System.out.println("Am incrementat valoarea lui:"+x);
		
		
		
		}
	}
	public static void increment(int n)
	{
		n++;
	}
}
