package org.opentutorials.javatutorials.Inheritance.example3;
 
class Calculator {
    int left, right;
     
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
    	super(left, right);
    	//this.left = left;
        //this.right = right;
    	
    	//상위클래스에서와 같은 생성자 코드가 중복
    	//하위클래스 생성자가 상위클래스 생성자를 호출하여 사용할때 super()를 사용
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}