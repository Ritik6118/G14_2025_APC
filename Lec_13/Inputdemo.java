package Lec_13;

import java.util.Scanner;

public class Inputdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
////		System.out.println(a+" "+b);
//		int c=0;
//		while(a>0) {
//			int n=a%10;
//			if(n==b) {
//				c++;
//			}
//			a=a/10;
//		}
//		System.out.println(c);
		
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		findpair(arr,t);
		
	}

	public static void findpair(int[] arr, int t) {
		// TODO Auto-generated method stub
		
	}

}
