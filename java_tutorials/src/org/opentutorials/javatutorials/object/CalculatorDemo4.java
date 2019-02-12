package org.opentutorials.javatutorials.object;

class Calculator{
	int left, right;
	
	public void Setting(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void Sum(){
		System.out.println(left+right);
	}
	
	public void Avg(){
		System.out.println((left+right)/2);
	}
	
}

public class CalculatorDemo4 {

	public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.left = 10;
        cal1.right = 20;
        cal1.Sum();
        cal1.Avg();
        
        Calculator cal2 = new Calculator();
        cal2.left = 20;
        cal2.right = 40;
        cal2.Sum();
        cal2.Avg();
	}

}
