/**
 * 
 */
package polyMorphism;

import java.util.ArrayList;
import java.util.*;

import testingEncapsulation.PrivateFieldsUser;

/**
 * @author DonCroW
 *
 */
public class PolyMorphism {



	public static void main (String[] args)
	{

			exPolyMorphism();
		   


	}
	
	public static void exPolyMorphism()
	{


		List<Animals> myPets= new ArrayList<Animals>(); //creating a list of animals using an array and Lists as an interface
		Cats myCat= new Cats();							// creating myCat according to Cats template
		myCat.setAge(3);								// setting my cat age using a setter declared in class : Animals
		myCat.setName("PisicutaPisPisPis");				// setting my cat name using a setter declared in class: Animals
		Dogs myDog= new Dogs();							
		myDog.setAge(7);								
		myDog.setName("LovelyDog");						
		myPets.add(myCat);								// I just add my cat into my pet list
		myPets.add(myDog);								
		
		
		for(Animals pet: myPets)					//for each element from myPets list ( currently have 2 elemnts: dogs and cats in this order)
		{
			System.out.println("My name is : "+ pet.getName()+" I'm "+pet.getAge()+" years old"); 
			pet.couldPet();
			System.out.println(pet.talk());
			
		}
	}

	public static void basicTest()
	{
		Cats myCat= new Cats();
		Dogs myDog= new Dogs();
		System.out.println(myDog.talk());
		myDog.couldPet();
		System.out.println(myCat.talk());
		myCat.couldPet();
	}


	public static void about()
	{
		System.out.println("In general :Morph is reffer to a form ( class)");
		System.out.println("PolyMorph is reffer to something with more forms ( classes)"); //you can think at morphling from dota2 as an ex
		System.out.println("\t In java, Poly Morphism allows us to treat AN OBJECT as different TYPES OF OBJECTS"
				+ "An object could have more types(classes) for ex: a black cat is: an animal->a cat -> a black cat");



	}
}
