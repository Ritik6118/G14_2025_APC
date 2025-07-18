package Lec_03;

public class Student {
	String name;
	int age;
	private int rollnumber;
	int knowledge;
	
	static int c=1;
	
	Student(){
		this.rollnumber=c;
		c++;		
	}
	
	Student(String name, int age, int knowledge){
		this.name=name;
		this.age=age;
		this.rollnumber=c;
		c++;
		this.knowledge=knowledge;
	}
	
	public void introduce() {
		System.out.println("hello my name is " +name+ " and my roll number is "
	+rollnumber);
	}
	
	public void study() {
		System.out.println(name +" is Studying....");
		knowledge+=20;
	}
	
//	teach
	public void teach(Student s) {
		System.out.println(this.name +" is teaching "+s.name+" .......");
		this.knowledge+=10;
		s.knowledge+=20;
	}
	
}
