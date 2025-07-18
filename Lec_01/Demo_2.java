package Lec_01;

import java.util.Arrays;

public class Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4};
		
		swap(arr[0],arr[1]);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=i;
		i=j;
		j=temp;
	}

}
