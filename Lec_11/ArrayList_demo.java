package Lec_11;

import java.util.ArrayList;

public class ArrayList_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li =new ArrayList();
		li.add(1);
		li.add("String  ");
		li.add(true);
		System.out.println(li);
		Student s1=new Student("abcd");
		Student s2=new Student("efgh");
		Student s3=new Student("ijkl");
		System.out.println(s1.hashCode()+" "+s1.hashCode()%5);
		System.out.println(s2.hashCode()+" "+s2.hashCode()%5);
		System.out.println(s3.hashCode()+" "+s3.hashCode()%5);
		System.out.println(s1.hashCode()+" "+s1.hashCode()%5);
		System.out.println(s2.hashCode()+" "+s2.hashCode()%5);
		System.out.println(s3.hashCode()+" "+s3.hashCode()%5);
		
		
	}
	

}

class Student {
	String name;
	Student(String n){
		name =n;
	}
}
