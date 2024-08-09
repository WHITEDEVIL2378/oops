package Features;
abstract class TwoWheelers extends Details
{
	public int topSpeed()
	{
		return 150;
	}
	public int Mileage()
	{
		return 50;
	}
	public boolean selfStart()
	{
		return true;
	}
}
abstract class FourWheelers 
{
	public String Tyre()
	{
		return "Maxx";
	}
}
public class Car extends FourWheelers
{
	public String Mirror()
	{
		return "Rear Mirror";
	}
}
	
