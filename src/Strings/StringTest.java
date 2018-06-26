package Strings;

public class StringTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		o/p : Ankit is name My
		String a="My name is ankit";
		String b="ANKIT";
		System.out.println(a.length());
		System.out.println("length of my string is"+a.length());
//		a.equalsIgnoreCase(b);
		System.out.println(a.charAt(0));
		System.out.println(a.substring(4,a.length()));
		
		String [] arr=a.split(" ");
		System.out.println(arr.length);
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
