/**
 * 
 */
package readOnlyFields;

/**
 * @author DonCroW
 *
 */
public abstract  class User {

    private String name;
    private int age;
    
    public User(String chosenName,int chosenAge)
	{
		this.name=chosenName;
		this.age=chosenAge;
		
	}
    
    public void getInfo ()
    { 
    	System.out.println(this.name+" "+this.age);
    
    }
    
    
	
}
