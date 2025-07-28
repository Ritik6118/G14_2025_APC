package Lec_12;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<Integer> set=new TreeSet<>();
//		set.add(1);
//		set.add(9);
//		set.add(2);
//		set.add(8);
//		set.add(3);
//		set.add(7);
//		System.out.println(set);
		
		Student s1=new Student(18,1,"kartik",400);
		Student s2=new Student(20,3,"tarun",300);
		Student s3=new Student(21,2,"rohit",320);
		Student s4=new Student(17,4,"abhishek",420);
		
		TreeSet<Student> set=new TreeSet<>(new Student_comparator());
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set);
	}
	

}

class Student_comparator implements Comparator<Student>{


	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollnumber-o2.rollnumber;
	}
	
}


class Student{
	String name;
	int age;
	int rollnumber;
	int marks;
	Student(int a,int r,String n,int m){
		name=n;
		age=a;
		rollnumber=r;
		marks=m;
	}
	Student(){
		
	}
	
	
	@Override 
	public String toString() {
		return name;
	}
}
//class Student implements Comparable<Student>{
//	String name;
//	int age;
//	int rollnumber;
//	int marks;
//	Student(int a,int r,String n,int m){
//		name=n;
//		age=a;
//		rollnumber=r;
//		marks=m;
//	}
//	Student(){
//		
//	}
//	@Override
//	public int compareTo(Student s1) {
//		// TODO Auto-generated method stub
//		return this.marks-s1.marks;
//	}
//	
//	@Override 
//	public String toString() {
//		return name;
//	}
//}

