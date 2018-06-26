package ArrayList;

import java.util.*;

class arraylist{
	public void arrayEx() {
		ArrayList<String> obj = new ArrayList<String>();

		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");
		  
		  

		  obj.get(3);
		  
		  /* Displaying array list elements */
		  System.out.println("Currently the array list has following elements:"+obj);

		  /*Add element at the given index*/
//		  obj.add(0, "Rahul");
//		  obj.add(1, "Justin");

		  /*Remove elements from array list like this*/
//		  obj.remove("Chaitanya");
//		  obj.remove("Harry");

//		  System.out.println("Current array list is:"+obj);

		  /*Remove element from the given index*/
//		  obj.remove(1);

		  System.out.println("Current array list is:"+obj);
	}
	public void numbers() {
		ArrayList<Integer> AL=new ArrayList<Integer>();
		for(int i=10;i>=1;i--) {
			System.out.println(i);
			AL.add(i);
		}
		  System.out.println("Current array list is:"+AL);
		  AL.sort(null);
		  System.out.println("Current array list is sorted:"+AL);
		  AL.remove(2);
		  System.out.println("Current array list is:"+AL);
		  AL.remove(Integer.valueOf(4));
		  System.out.println("Current array list is:"+AL);
	}

}

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylist ar=new arraylist();
		ar.numbers();

	}
}
