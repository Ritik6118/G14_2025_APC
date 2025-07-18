package Lec_10;

public class BinarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(binarysearch(arr,12));
	}

	private static int binarysearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				lo=mid+1;              // discarding left half
			}
			else {
				hi=mid-1;              // discarding right half
			}
		}
		return -1;
	}

}
