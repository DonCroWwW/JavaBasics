/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author DonCroW
 *
 */
public class MyMethods 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

			aFill();
		//		arraysAsList();
		//		arraysEquals();
		//	
		int c[]= {1,2,3,4};
		int d[]= {1,2,3,4};
		int e[]= {1,2,5,4};


//			aEquals();
		//		System.out.println(checkEq(c,d));
//		System.out.println(checkEq(c,e));


	}

	public static void aEquals()
	{
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		System.out.println("Zonele de memorie alocate pentru a si b sunt: " +a+" "+b);

		if(a==b)
		{
			System.out.println("a=b");
		}
		else System.out.println("Arrays equality can't be checked using if");
		if(a.equals(b))
		{
			System.out.println("a=b");
		}
		else System.out.println("Arrays equality can't be checked using .equals method");
		
		System.out.println("Can we use Arrays.equals to check if 2 arrays are equals? "+Arrays.equals(a, b));
	}


	public static boolean checkEq(int a[],int b[])
	{

		if (a.length!=b.length) return false;
		else 
		{for(int i=0;i<a.length;i++)
			if(a[i]!=b[i])
			{System.out.println("Valorile de pe pozitia "+i+" Nu sunt egale");
			return false;		
			}
			else System.out.println("Valorile de pe pozitia "+i+" sunt egale");
		

		}
		return true;

	}
	
	public static void aFill()
	{
		int a[]= new int[10];
		Arrays.fill(a, 11110);
		System.out.println(Arrays.toString(a));
	}

}




