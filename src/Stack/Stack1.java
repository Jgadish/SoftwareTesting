package Stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(100);
		s.push("jagadish");
		s.push("Jaguar");
		s.push(1993);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.search("jagadish"));

	}

}
