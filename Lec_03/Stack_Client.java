package Lec_03;

public class Stack_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		My_Stack st=new My_Stack();
		
		
		st.pop();
		st.push(0);
		st.push(1);
		st.push(2);
		
		st.display();
		
		
		while(!st.isEmpty()) {
			System.out.println(st.pop()); 
		}
	}

}
