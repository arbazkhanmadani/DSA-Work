package DSA.datastructure.stack;

import java.util.Arrays;

public class StackA {

	private Object[] stk = new Object[5];
	private int size = -1;
	
	
	public void push(Object o) throws Exception{
		
		if(size==stk.length)throw new Exception();
		
		stk[++size] = o;
		
	}
	
	public Object pop() throws Exception{
		
		if(size==0) throw new Exception();
		
		--size;
		Object o = stk[size];
		
		return o;
	}
	
	public void display() {
		
		System.out.print("[");	
		for(int i = 0; i<=size; i++){
			System.out.print(stk[i]+", ");
		}
		System.out.println("]");	
		
	}
	
	public Object peek(){
		return stk[size];
	}
	
	public boolean isEmpty(){
		
		if(size!=0) return false;
		return true;
	}
	
	public static void main(String[] args) throws Exception {

		StackA s = new StackA();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		//System.out.println(s+" Before pop");
		
		s.display();
		System.out.println(s.size);
		
		Object o = s.pop();
		System.out.println(o);
		

		//System.out.println(s+" After pop");
		s.display();
		
		System.out.println("Peek value "+s.peek());
		System.out.println(s.isEmpty());
		
		s.pop();s.pop();s.pop();
		System.out.println(s.isEmpty());
		
	}

	@Override
	public String toString() {
		return Arrays.toString(stk);
	}

}
