package DSA.datastructure.stack;
import java.util.LinkedList;
import java.util.*;


public class StackQ {

	private int capacity = 4;
	private Queue<Object> stk = new ArrayDeque<>(capacity);
	
	
	
	public void push(Object o) throws Exception{
		
		if(stk.size()==capacity) throw new Exception();
		
		stk.add(o);
	}
	
	public Object pop() throws Exception{
		
		if(stk.size()==0) throw new Exception();
		
		Object o = stk.poll();
		return o;
	}
	
	public Object peek() throws Exception{
		
		if(stk.size()==0) throw new Exception();
		
		
		Object o1=null;
		for(Object o : stk)
			o1 = o; 
		return stk.remove( stk.size()-1);
		
	}
	
	public int size(){
		
		if(stk.size()==0) return 0;
		return stk.size();
	}
	
	public boolean isEmpty(){
		
		if(stk.size()==0) return true;
		return false;
	}

	
	public static void main(String[] args) throws Exception {

		StackQ s = new StackQ();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		//s.push(5);
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
		
	}



	@Override
	public String toString() {
		return  ""+stk ;
	}

}
