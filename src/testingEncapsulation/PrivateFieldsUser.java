/**
 * 
 */
package testingEncapsulation;

/**
 * @author DonCroW
 *
 */
public class PrivateFieldsUser extends User{
	private String name;
	private int age;
	private boolean sex;



	public  void setName(String chosenName)
	{
		this.name=chosenName;

	}
	public String getName()
	{
		return  this.name;
	}

	public void setAge(int chosenAge)
	{
		this.age=chosenAge;
	}

	public int getAge()
	{
		return this.age;
	}
	public void setSex(boolean b)
	{
		this.sex=b;
	}
	public String getSex()
	{
		if(this.sex==true)
			return "Male";
		else return "Female";
	}
	
	
	public void getInfo()
	{
		System.out.println(this.getName()+" "+this.getAge()+" "+this.getSex());
	}
	
}
