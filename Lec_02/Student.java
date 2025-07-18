package Lec_02;

public class Student {
	String name;
	int age;
	int rollnumber;
	int knowledge;
	
	Student(){
		
	}
	
	Student(String name, int age, int rollnumber, int knowledge){
		this.name=name;
		this.age=age;
		this.rollnumber=rollnumber;
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
	
	
}
