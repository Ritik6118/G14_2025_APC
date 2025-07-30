package Lec_15;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Lambda_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,2));
//		System.out.println((1,2)->return a+b);
	//	inter i=new inter() {
	//		
	//		@Override
	//		public int sum(int a, int b) {
	//			// TODO Auto-generated method stub
	//			return a+b;
	//		}
	//	};
		
		inter sum =(a,b)-> a+b;
		inter sub =(a,b)-> a-b;
		inter mul =(a,b)-> a*b;
		inter div =(a,b)-> a/b;
		
		System.out.println(sum.fun(1, 2));
		System.out.println(sub.fun(1, 2));
		System.out.println(mul.fun(1, 2));
		System.out.println(div.fun(1, 2));
		
		Predicate<Integer> p=(a)->a%2==0;  //gives test method that takes a single generic param and gives boolean o/p
		System.out.println(p.test(5));
		System.out.println(p.test(6));
		
		Consumer<Integer> c=(a)->System.out.println(a); // gives accept method that takes a single generic param and gives nothing retunr type is void
		c.accept(5);
		
		BiConsumer<Integer, String> bc=(a,b)->System.out.println(a+b);
		bc.accept(23, "ritik");
		
		Function<String , Integer> f= (s)->{
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					count++;
				}
			}
			return count;
		};
		
		System.out.println(f.apply("ritik"));
		
//		BiFunction<T, U, R>  // t-> input param 1 type u->input prarm 2 type r->output type
		
//		Supplier<T>  // dosent takes any input but can gives output of T type
		
		Comparator<Student> comp=(a,b)->a.age-b.age;
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	
	
	
	
	
}

@FunctionalInterface
interface inter{	
	public int fun(int a,int b);
//	public void sum2(int a,int b);
	
}

class Student {
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
