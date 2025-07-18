package Lec_04;

public class Exception_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3};
		String s=null;
		try {
			System.out.println("hello");
//			s.toLowerCase();          // npe
//			System.out.println(3/0);  // ae
//			System.out.println(arr[4]);		// array index ob e	
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		catch(NullPointerException  e) {
//			System.out.println(e);
//			
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);			
//		}
		finally{
			System.out.println("finally block is running");
		}
		
		
		
	}

}
