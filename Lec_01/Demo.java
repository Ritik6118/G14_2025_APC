package Lec_01;

public class Demo {

	static int x=0;
	static int y=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		swap(x,y);
		swap();
		System.out.println(x+" "+y);
		
	}

	private static void swap() {
		int temp=x;
		x=y;
		y=temp;
		// TODO Auto-generated method stub
		
	}

	private static void swap(int x, int y) {
		// TODO Auto-generated method stub
		int temp=x;
		x=y;
		y=temp;
//		System.out.println(x+" "+y);
	}

	private static void fun(int x, int y) {
		// TODO Auto-generated method stub
		x=100;
		System.out.println(x);
	}

	private static void sum(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x+y);
	}

}
