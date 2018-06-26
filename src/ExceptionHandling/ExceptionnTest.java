package ExceptionHandling;
public class ExceptionnTest {
int i=100;
	public void exception() {
		try {	
			int a[]=new int[2];
			System.out.println("msg 1");
			i=10;
			System.out.println(a[3]);	
//			if email format!=a@b.com
			throw new NullPointerException("this is a test array out of bound exception");
//			System.out.println("msg 2");
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Exception:"+e.getMessage());
//		}
//		catch(NullPointerException e) {
//			System.out.println("Exception null:"+e.getMessage());
//		}
		catch(Exception e) {
			System.out.println("Exception generic:"+e.getMessage());
		}
		finally {
			i=100;
			System.out.println("finally executed");
			System.out.println(i);
		}}
public void exceptionthrows() throws IllegalAccessException {	
		throw new IllegalAccessException("this is a test array out of bound exception");
	}
	public void tryexception() throws IllegalAccessException {
			exceptionthrows();
		}
	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
ExceptionnTest et=new ExceptionnTest();
et.exceptionthrows();
	}}