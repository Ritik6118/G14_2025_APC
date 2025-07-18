package Lec_02;

import java.util.Arrays;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,3,4};
		int [] arr2= {5,6,7,8};
		
		swap(arr1,arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	private static void swap(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
//		int  [] temp=arr1;
//		arr1=arr2;
//		arr2=temp;
		
		for(int i=0;i<arr1.length;i++) {
			int temp=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=temp;
		}
	}

}
