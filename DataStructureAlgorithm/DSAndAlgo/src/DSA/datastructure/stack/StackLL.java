package DSA.datastructure.stack;
import java.util.LinkedList;

public class StackLL {

	private int capacity = 5;
	private LinkedList<Object> stk = new LinkedList<>();
	
	
	public void push(Object o) throws Exception{
		
		if(stk.size()==capacity) throw new Exception();
		stk.add(o);
	}
	
	public Object pop() throws Exception{
		
		if(stk.size()==0) throw new Exception();
		return stk.remove(stk.size()-1);
	}
	
	public int size(){
		
		if(stk.size()==0) return 0;
		return stk.size();
	}
	
	public boolean isEmpty(){
		
		if(stk.size()==0) return true;
		return false;
	}
	public Object peek(){
		
		if(stk.size()==0) return 0;
		return stk.peekLast();
	}
	
	public static void main(String[] args) throws Exception {
		
		StackLL s = new StackLL();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		
		System.out.println(s);
		
		
	}

	@Override
	public String toString() {
		return ""+stk;
	}

}
