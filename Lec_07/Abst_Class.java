package Lec_07;

public abstract  class Abst_Class extends Abst_Class_Second {
	
	
	int a=10;
	int b;
	@Override
	public void fun3() {
		System.out.println("this is fun 3 from abst class second that is implemented in abst class");
	}
	
	public void fun1() {
		System.out.println("hello from fun 1 of abst class");
	}
	public abstract void fun2();
	
}
