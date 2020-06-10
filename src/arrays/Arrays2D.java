/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author DonCroW
 *
 */
public class Arrays2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
			int[]ani = {1,2,3,4};
			System.out.println(Arrays.toString(ani));
			array2D(3); // prints the row and column of the chosen value in our 2Darray
//		matrice2(); // aifsare matrice cu numar inegal de coloane


	}

	public static void array2D(int chosenValue) //it also works with 2dArrays  with deepToString instead of toString
	{

		int[][]altiAni = {{1,2,1,4},{2,1,3,1},{3,1,3,2}};  //Init a 2d Array
		System.out.println(Arrays.deepToString(altiAni));  

		
		// Let's see if we can find the row and column for a chosen value        
		for(int i=0;i<altiAni.length;i++)
		{
			for(int j=0;j<altiAni.length;j++)
			{
				if (altiAni[i][j]==chosenValue)										 
				{
					System.out.println("We have 1 on row: "+i+" column :"+j);
				}

			}
		}


	}


	public static void matrice2()
	{
		int a[][]=  {
						{1,2,3},
						{1,2},
						{1,3,4,5,6,7,8,9},
					};
		
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
				
			System.out.println();
		}
		

	}

}

