package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

	
		ArrayList A = new ArrayList();
		
		A.add("jagadish");
		A.add("patil");
		A.add(1993);
		A.add('M');
		A.add("sangli");
		A.add("Job");
		
		System.out.println(A);
		
		//Add New Object in the the ArrayList
		A.add("Selenium");
		System.out.println(A);
		
		//Add All Method
		ArrayList B = new ArrayList();
		B.add(100);
		B.add(200);
		B.add(300);
		B.add(400);
		
		A.addAll(B);//Here we add the add All the data from B to A ArrayList
		System.out.println(A);
		
		// RemoveAll Method
		A.removeAll(B);
		System.out.println(A);
		
		//Remove Method
		A.remove("jagadish");
		A.remove(0);//Here we also remove the value using the index
		System.out.println(A);
		
		//Is empty Method
		A.isEmpty();
		
		//size Method
		System.out.println(A.size());
		
		A.addAll(B);
		System.out.println(A.size());
		
		
		//Contsains Method
		System.out.println(A.contains(100));
		
		//ContainsAll Method
		System.out.println(A.contains(100));
		
		
		
//		for(int i=0;i<A.size();i++)
//			{
//				System.out.println(A.get(i));
//			}

		for(Object o:A)
			{
				System.out.println(o);
			}
		
		
		System.out.println(A.indexOf("Selenium"));
		
		   
		}



}
