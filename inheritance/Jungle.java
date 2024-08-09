class Animal
{
	private String name;
	private int age;
	private String spieces;
	public void setName(String name){
		this.name = name;
	}
	public void setAge(byte age){
		this.age = age;
	}
	public void setSpieces(String spieces){
		this.spieces = spieces;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getSpieces(){
		return spieces;
	}
}
class Dog extends Animal
{
	private String breed;
	public String colour;
	public Dog (){
	
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public void setColour(String colour){
		this.colour = colour;
	} 
	public String getBreed(){
		return breed ;
	}
	public  String getColour(){
		return colour;
	}
}
class Cat extends Dog
{
	private String colour;
	private int NumOfLives;
	public Cat(String colour,int NumOfLives)
	{
		this.colour = colour;
		this.NumOfLives = NumOfLives;
	}
	public int getNumOfLives(){
		return NumOfLives ;
	}
	public  String getColour(){
		return colour;
	}
}
class Pet
{
	public static void petanimals(Animal a)
	{
		System.out.println(a.getAge());
		System.out.println(((Dog)(a)).getBreed());
		System.out.println(a.getName());
	}	
}
public class Jungle
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.setName("Dabbar");
		d.setAge((byte) 3);
		d.setSpieces("Animals");
		//System.out.print(d.getName() + " " + d.getAge() + " " + d.getSpieces());
		//System.out.println();
		Cat c = new Cat("white",7);
		c.setBreed("Labrador");
		c.setColour("Brown");    // checks for the setColor in this method
		System.out.print(c.getColour() + " " + d.getBreed() + " " + c.getNumOfLives()+ " " + d.getColour());
		//Pet p = new Pet();
		//p.petanimals(d);
		//p.petanimals(c);
	}
}	
		
