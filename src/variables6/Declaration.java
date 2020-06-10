/**
 * 
 */
package variables6;

/**
 * @author Legion
 *
 */
public class Declaration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		variableCreation();
		about();
		String x="main method x has not the value of x used in our example method ";
		System.out.println(x);
		scopeEx();
		notWorkingEx();

	}
    public static void about()
    {
    	System.out.println("Why is so important the declaration part? can't we just declare&initialize the variable whenever we need");
    	System.out.println("Actually is not quite that simple, variable have a scope, and where we declare it influence where we can use it");
    	
    }
	public static void variableCreation()
	{
		System.out.println("A variable is created in 2 steps \n Step1: Declaration of the variable \n Step2: Initialization of the variable");
		System.out.println("Basic example: int x; x=1;");
	}
	
	public static void scopeEx()
	{
		int x=5;
		System.out.println("In this method x has the value : "+x);
	}
	
	public static void notWorkingEx()
	{
		if(3>2)
		{
			int x=5;
		}
		// x++;
		System.out.println("That's not gonna work since x is declared inside the curly braces");
		System.out.println("Solution: declare the variable inside method, not curly braces");
		
	}
}
