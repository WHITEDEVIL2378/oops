class Student
{
	private String name ;
	private int rollno;

	public void setName(String name)
	{
		e.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setRollno(int roll)
	{
		e.rollno = roll;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void student()
	{
		Student e = new Student();
	}
}
public class Test
{ 
	public static void main(String args[])
	{
		Student s = new Student();
		s.setName("hari");
		s.setRollno(1223);
		System.out.println(s.getName() + " " + s.getRollno());
		//System.out.println(this.name);
	}
}

