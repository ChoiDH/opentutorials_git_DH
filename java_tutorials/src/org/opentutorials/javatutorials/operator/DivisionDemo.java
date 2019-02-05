package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		float c = 10.0f;
		float d = 3.0f;
		
		float e = a;
		float f = b;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(a/d);
		//엄시적 형변환이 됨.
		
		System.out.println(e/f);
		
	}
}
