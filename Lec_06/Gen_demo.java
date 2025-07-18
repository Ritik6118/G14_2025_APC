package Lec_06;

public class Gen_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer [] arr1= {1,2,3,4,5};
//		String [] arr2= {"abc","def","ghi","jkl","mno"};
//		Boolean [] arr3= {true,false,false,true,true};
////		System.out.println(arr1);
//		display(arr1);
//		display(arr2);
//		display(arr3);
		
		Integer a=127;
		Integer b=127;
		System.out.println(a==b);
		
	}
	public static <T> void display(T [] arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		
		for(T n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
//	public static void display(boolean [] arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
//	public static void display(String  [] arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}

}
