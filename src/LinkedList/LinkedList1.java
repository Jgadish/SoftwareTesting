package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList A = new LinkedList();
		
		A.add("jagadish");
		A.add("patil");
		A.add(1993);
		A.add('M');
		A.add("sangli");
		A.add("Job");
		
	LinkedList B = new LinkedList();
		B.add(100);
		B.add(200);
		B.add(300);
		B.add(400);
		
		
		//use addFirst Method
		A.addFirst("Jagadish@123");
		System.out.println(A);
		
		//addLast Method
		A.addLast("jaguar@123");
		System.out.println(A);
		
		//add The value to specific index no
		A.add(3, "AVIElectrinics");
		System.out.println(A);
		
		//Remove THe First value to 
		A.removeFirst();
		System.out.println(A);
		
		//RemoveLast value
		A.removeLast();
		System.out.println(A);
		
		//get the 1st value
		System.out.println(A.getFirst());
		
		//get the Last value
		System.out.println(A.getLast());
		
		//get the specific value
		System.out.println(A.get(3));
		
		
		//use isEmpty Method
		System.out.println(A.isEmpty());
		
		Object o =A.clone();
		System.out.println(o);
		
		
		A.addAll(B);
		System.out.println(A);
		A.retainAll(B);
		System.out.println(A);

		

	}

}
