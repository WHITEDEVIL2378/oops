class Student
{
	private String name = "hari";
	private static int rollno;

	public void setName(String nam)
	{
		name = nam;
	}
	public String getName()
	{
		return name;
	}
	public void setRollno(int roll)
	{
		rollno = roll;
	}
	public static int getRollno()
	{
		return rollno;
	}
}
public class Test
{ 
	public static void main(String args[])
	{
		Student s = new Student();
		//s.setName("hari");
		s.setRollno(1223);
		System.out.println(s.getName() + " " + Student.getRollno());
	}
}
