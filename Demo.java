abstract class Example{
	abstract void add();
	abstract void sub();
}
interface maths{
	void mul();
	void div();
}
interface phy{
	void mul();
}
/*abstract class Homework extends Example{
	void add(){
		System.out.println("Addition");
	}
}
class TodayHW extends Homework{
	void sub(){
		System.out.println("Subtraction");
	}
}*/
abstract class TmrHW implements maths,phy{
	public void mul(){
		System.out.println("Multiplication");
	}
}
class Work extends TmrHW{
	public void div(){
		System.out.println("Division");
	}
}
class Demo{
	public static void main(String args[]){
		new Work().mul();
	}
}  
	
	
	
