/**
 * 
 */
package polyMorphism;

/**
 * @author DonCroW
 *
 */
public abstract class Animals {
	public String name;
	public int age;

	public  abstract String talk();

	public void setAge(int chosenAge)
	{
		this.age=chosenAge;
	}

	public void setName(String chosenName)
	{
		this.name=chosenName;
	}
	public int getAge()
	{
		return this.age;
	}

	public String getName()
	{
		return this.name;
	}

	public void couldPet()
	{
		System.out.println("I'm an animal, of course you could pet me");
	}
	
}