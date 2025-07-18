package Lec_04;

public class Exception_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun1();
		System.out.println("hello from main after fun 1");
		
	}
	private static void fun1() {
		// TODO Auto-generated method stub
		try {
			fun2();			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("hello from fun 1 after fun 2");
	}

	private static void fun2() {
		// TODO Auto-generated method stub
		fun3();
		System.out.println("hello from fun 2 after fun 3");
	}

	private static void fun3() {
		// TODO Auto-generated method stub
		System.out.println(5/0);		
		System.out.println("hello from fun 3 after exception");
	}

}
