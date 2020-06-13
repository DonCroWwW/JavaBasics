/**
 * 
 */
package readOnlyFields;

/**
 * @author DonCroW
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Admin a = new Admin("gigel",13);
		//		a.name  not avaible due to private acces modifier
		a.getInfo();
	}

}
