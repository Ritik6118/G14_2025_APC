package Lec_07;

public class Abstraction_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abst_Class obj=new Abst_Class();
//		Abst_Class obj=new Conc_Class();
		Conc_Class obj=new Conc_Class();
		obj.fun2();
		obj.fun1();
		obj.fun3();
		obj.fun5();
		obj.fun6();
		System.out.println(obj.a);
		System.out.println(obj.a_I);
		System.out.println(obj.b);
	}
	
//	this is fun2 from conc class
//	hello from fun 1 of abst class
//	10
//	0


}
