package Lec_04;

public class My_Stack {
	protected int [] arr;
	protected int top;
	
	My_Stack(int n){
		arr=new int [n];
	}
	My_Stack(){
		arr=new int [5];
	}
	
	public void push(int n)  {
		try{
			if(this.isFull()) {
				throw new Exception("Stack is Full");
			}
			arr[top]=n;
			top++;			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
	
	public int pop()  {
		try {
			if(this.isEmpty()) {
				throw new Exception("Stack is Empty");
			}
			top--;
			return arr[top];			
		}
		catch(Exception e) {
			System.out.println(e);
			return Integer.MIN_VALUE;
			
		}
	}
	
	public int peek()  {
		try {
			if(this.isEmpty()) {
				throw new Exception("Stack is Empty");
			}
			return arr[top-1];			
		}
		catch(Exception e) {
			System.out.println(e);
			return Integer.MIN_VALUE;
		}
		
		
	}
	
	public int size() {
		return top;
	}
	
	public boolean isFull() {
		return top==arr.length;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public void display() {
		for(int i=0;i<top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
