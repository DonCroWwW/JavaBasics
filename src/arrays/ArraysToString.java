/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author Legion
 *
 */
public class ArraysToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
			int[]ani = {1,2,3,4};
			System.out.println(Arrays.toString(ani));
//		matrice2(); // aifsare matrice cu numar inegal de coloane


	}

	public static void matrice()
	{

		int[][]altiAni = {{1,2,1,4},{2,1,3,1},{3,1,3,2}};
		System.out.println(Arrays.deepToString(altiAni));


		for(int i=0;i<altiAni.length;i++)
		{
			for(int j=0;j<altiAni.length;j++)
			{
				if (altiAni[i][j]==1)
				{
					System.out.println("Pe pozitia "+i+j+"Se gaseste valoarea 1");
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

