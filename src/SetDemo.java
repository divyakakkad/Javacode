import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SetDemo {
	
	static void setdemo() {
		Set<String> s1=new HashSet<String>();
		s1.add("Apple");
		s1.add("Boy");
		s1.add("Cat");
		
		s1.add("Apple");
		
		
	
		for (String name : s1) {
			System.out.println(name);
		}
		
	}
	static void stackdemo() {
	Stack<String> st1=new Stack<String>();
	
	st1.push("A");
	st1.push("B");
	st1.push("c");
	st1.push("D");
	System.out.println(st1.pop());
	
	System.out.println(st1);
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setdemo();
		stackdemo();
		
		

	}

}
