/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.List;

import testingEncapsulation.PrivateFieldsUser;

/**
 * @author DonCroW
 *
 */
public class ArrayListCustoms {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		loopMethod();
	}
	public static void workingMethod() //creating a list of type PrivateFieldsUser
	{
		PrivateFieldsUser user1= new PrivateFieldsUser();
		 user1.setAge(13);
		 user1.setName("Gigel");
		 user1.setSex(true);
		 user1.getInfo();
		 
		 PrivateFieldsUser user2= new PrivateFieldsUser();
		 user2.setAge(233);
		 user2.setName("Gigelica");
		 user2.setSex(false);
		 user2.getInfo();
		 
		 
		 PrivateFieldsUser user3= new PrivateFieldsUser();
		 user3.setAge(311);
		 user3.setName("Gigelicutza");
		 user3.setSex(false);
		 user3.getInfo();
		 
		 List<PrivateFieldsUser> listOfUsers = new ArrayList<PrivateFieldsUser>();
		 listOfUsers.add(user1);
		 listOfUsers.add(user2);
		 listOfUsers.add(user3);
		 System.out.println(listOfUsers.get(2).getAge());
		 
	}

	public static void loopMethod()   //creating a list of type PrivateFieldsUser using a list
	{
		List<PrivateFieldsUser> myList= new ArrayList<PrivateFieldsUser>(); //i created a list of type PrivateFieldsUser
																			// i would need some values for my fields, so i will use some arrays
		String[] names = {"Ana", "AltaAna", "Bala"};
		Integer[] ages= {20,21,21};
		Boolean[] sex= {false,true,false};
		for(int i=0;i<names.length;i++)
		{
			PrivateFieldsUser user= new PrivateFieldsUser();
			user.setAge(ages[i]);
			user.setSex(sex[i]);
			user.setName(names[i]);
			myList.add(user);
//			user.getInfo();   //just to display the diferences
//			doubleAge(user);  // using a method which takes List of costum types as arguent
//			user.getInfo();

		}		
		search(myList,"Ana",20);	
	}
	
	public static void doubleAge(PrivateFieldsUser u) //  a method which takes List of costum types as arguent
	{
		u.setAge(u.getAge()*2);

	}
	
	public static void search(List<PrivateFieldsUser> listOfUsers,String name,int age)
	{

		for (int i=0;i<listOfUsers.size();i++)
		{
			if((listOfUsers.get(i).getName()).equals(name)&&(listOfUsers.get(i).getAge()==age))
				listOfUsers.get(i).getInfo();	
				
		
		}

		
    }
}
