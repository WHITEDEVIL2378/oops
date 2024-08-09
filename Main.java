abstract class Student{
	abstract int mark();
	abstract char grade();
	}
class Boy extends Student{	
	private String name;
	public Boy(String name){
		this.name = name;
	}
	strictfp int mark(){
		return 23;
	}
	public char grade(){
		return 'A';
	}
	public String name(){
		return name;
	}
}
class Girl extends Student{
	public int mark(){
		return 24;
	}
	public char grade(){
		return 'D';
	}
}
class Standard{
	public void classroom(Student s){
	if(s instanceof Boy)
		System.out.println(((Boy)(s)).name());
		System.out.println(s.mark());
		System.out.println(s.grade());
	}	
}	
class Main{
	public static void main(String args[]){
		Standard w = new Standard();
		Student b = new Boy("hari");
		w.classroom(b);
		Girl g = new Girl();
		w.classroom(g);
	}
}
