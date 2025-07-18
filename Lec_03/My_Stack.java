package Lec_03;

public class My_Stack {
	private int [] arr;
	private int top;
	
	My_Stack(int n){
		arr=new int [n];
	}
	My_Stack(){
		arr=new int [5];
	}
	
	public void push(int n) throws Exception {
		if(this.isFull()) {
			throw new Exception("Stack is Full");
		}
		
		arr[top]=n;
		top++;
	}
	
	public int pop() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		top--;
		return arr[top];
	}
	
	public int peek() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[top-1];
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
