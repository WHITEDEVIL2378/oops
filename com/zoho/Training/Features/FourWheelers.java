package Features;
abstract class TwoWheelers extends Details implements Display
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
abstract class Car extends TwoWheelers
{
	public String Tyre()
	{
		return "Maxx";
	}
}
public class FourWheelers extends Car
{
	public String Mirror()
	{
		return "Rear Mirror";
	}
}
	
