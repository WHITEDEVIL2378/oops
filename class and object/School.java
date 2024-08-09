import java.util.Scanner;
class Student
{
	static int num;
	private String name ;
	private byte age;
	private char grade;
	
	//setting and getting values using setters and getters
	public void setName(String name){
		this.name = name;
	}
	public void setAge(byte age){
		this.age = age;
	}
	public void setGrade(char grade){
		this.grade = grade;
	}
	
	//setting values using the constructor
	/*Student(String name, byte age, char grade)
	{
		this.name = name;
		this.age = age;
		this.grade = grade;
	}*/
	public String getName(){
		return name;
	}
	public byte getAge(){
		return age;
	}
	public char getGrade(){
		return grade;
	}	
}
public class School
{
	static int StudentId = 0;
	public static void main(String args[])
	{
	   //Student s = new Student("hari",(byte) 21,'B'); //passing values to the constructor
	   //Student s = new Student(args[0],Byte.parseByte(args[1]),'B');  // getting values form command line arguments
	   Student h[] = new Student [2];	
	   for(int i = 0;i<=1;i++)
	   {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String k = sc.nextLine();
		s.setName(k);
		System.out.println("Enter the age");
		int a  = sc.nextInt();
		s.setAge((byte) a);
		System.out.println("Enter the grade");
		char g = sc.next().charAt(0);
		s.setGrade(g);
		h[i] = s;
		StudentId++;
	   }
	   String s = "g";
	   String d = "f";
	   s.equals(d);
	   Object
	   
	   System.out.println(StudentId + " " + h[1].getGrade() + Student.num);
	   /*Student details = h[0].split(" ");
	   for(Student s:details)
	   {
	   	System.out.print(s);
		
        }*/
     }
}
