package Loops;
public class Loops {
	public void forloopExample() {
		String abc="132dfsdfdg";
	int[] array=new int[] {1,2,3,4};
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=4;
		arr[2]=6;
		arr[3]=7;
		arr[4]=8;
		System.out.println(arr.length+" : length of array");
		System.out.println("0 to n array");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("n to 0 array");
		for(int j=arr.length-1;j<=0;j--) {	
			System.out.println(arr[j]);
		}}
	public void whileLoopexample() {
		int x=0;
		System.out.println("Into while");
		while(x<=4) {
		System.out.println(x);
		x=x+1;	
		System.out.println("Value of x: "+x);
		}
		System.out.println("Out of loop");
		}
	
	public void dowhileloop() {
		int x=0;
		System.out.println("Into while");
		do {
		System.out.println(x);
		x=x+1;	
		if(x!=5) {
		System.out.println("Value of x: "+x);
		}
		}
		while(x<=4);	
		System.out.println("Out of loop");
	}
	public void enhancedforexample() {
		String array[]= {"Ankit","Ashwin","Nikhil"};
		for(String x:array) {
			System.out.println(x);
		}	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops l=new Loops();
//		l.forloopExample();
//		l.whileLoopexample();
	l.dowhileloop();
//		l.enhancedforexample();
      }}