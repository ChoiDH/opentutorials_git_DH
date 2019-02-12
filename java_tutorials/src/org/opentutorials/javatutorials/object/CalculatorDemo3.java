package org.opentutorials.javatutorials.object;

public class CalculatorDemo3 {
	
	public static void avg(int num1, int num2){
		System.out.println((num1+num2)/2);
	}
	
	public static void sum(int num1, int num2){
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		int left, right;
		
		left = 10;
		right = 20;
        sum(left, right);
        avg(left, right);
        
        
        left = 20;
		right = 40;
        sum(left, right);
        avg(left, right);
        
	}

}
