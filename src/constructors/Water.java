/**
 * 
 */
package constructors;

/**
 * @author DonCroW
 *
 */
public class Water {

	public String name;
	public int capacity;
	public Water(String brandOfWater)
	{
		this.name=brandOfWater;
	}
	
	public Water() {} //DEFAULT constructor
	
	public Water(String brandOfWater, int capacityOfMyBrand)
	{
		this.name=brandOfWater;
		this.capacity=capacityOfMyBrand;
	}
}
