package Lec_02;

public class ClassRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("nitesh",24,1,80);
		Student s2=new Student("pratiyush",24,2,90);
		Student s3=new Student();
		s3.name="aman";
		s3.age=23;
		s3.rollnumber=3;
		s3.knowledge=40;
		s1.introduce();
		System.out.println(s1.knowledge);
		s1.study();
		System.out.println(s1.knowledge);
	}

}
