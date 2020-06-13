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


	public void setInfo(String chosenName, int chosenAge,boolean chosenSex)
	{
		setName(chosenName);
		setAge(chosenAge);
		setSex(chosenSex);
	}
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
	@Override
	public String toString() {
		return "PrivateFieldsUser: Name="+ getName() + " Age=" + getAge() + " Sex=" + getSex();
	}

	public  void incrementAge()
	{ this.age++;
		
	}
	
	
}
