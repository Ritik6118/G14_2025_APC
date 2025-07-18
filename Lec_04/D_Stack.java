package Lec_04;

public class D_Stack extends My_Stack {
	
	@Override
	public void push(int n) {
		super.arr[super.top]=n;
		super.top++;
		if(super.isFull()) {
			int [] arr=new int [super.arr.length*2];
			for(int i=0;i<super.arr.length;i++) {
				arr[i]=super.arr[i];
			}
			super.arr=arr;
		}
	}
	
}
