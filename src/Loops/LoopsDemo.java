package Loops;
import java.util.Arrays;
public class LoopsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {4,5,8,6,8,7};
//		System.out.println(arr.length);
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		for(int a:arr)  {
//			System.out.println(a);
//		}
		int x=0;
		while (x<arr.length) {
			//First if example
//			if (x==1) {
//				System.out.println(arr[x]);		}		
//			//block 2
//			else if (x==3) {
//				System.out.println(arr[x]);	}		 
//			//block 3
//			else if (x==5) {
//				System.out.println(arr[x]);}
//			else {
//				System.out.println("not a prinatble indexed value");
//			}
//			x=x+1;
			if (x==1||x==3||x==5) 
				System.out.println(arr[x]);		
			else 
				System.out.println("not a prinatble indexed value");
			x=x+1;
			}}}
