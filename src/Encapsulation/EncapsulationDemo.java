package Encapsulation;
 class EncapsulationDemo1 {

    private int empAge;

    //Getter and Setter methods
    protected int getEmpAge(){
        return empAge;
    }
    protected void setEmpAge(int newValue){
        empAge = newValue;
    }
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo1 obj = new EncapsulationDemo1();
         obj.setEmpAge(32);
         System.out.println("Employee Age: " + obj.getEmpAge());
	}
}
