/**
Rectangle class, phase 1
Under construction!
*/

public class Rectangle
{
	private double length;
	private double width;

	/**
	The setLength method stores a value in the
	length field.
	@param len The value to store in length.
	*/
	public void setLength(double len)
	{
		length = len;
	}

	/**
	The getLength method returns a Rectangle object's length.
	@return The value in the length field.
	*/
	public double getLength()
	{
		return length;
	}

	/**
	The getArea method returns a Rectangle object's area.
	@return The product of length times width.
	*/
	public double getArea()
	{
		return length * width;
	}

}