package org.opentutorials.javatutorials.variable;

public class IntergerDemo {
	
	public static void main(String[] args) {
		int a;
		a=1;
		System.out.println(a+1);//2
		
		a=2;
		System.out.println(a+1);//3
		
		
		double b;
		b=1.1;
		System.out.println(b+1.1);
		
		b=2.2;
		System.out.println(b+1.2f);
		
		//int c = 1.1; - 자료형이 맞지 않음.
		
		String first = "coding";
		System.out.println(first);
		
		String second;
		first = "coding";
		second = "everybody";
		System.out.println(first+second);	//codingeverybody
		System.out.println(b+second);		//2.2everybody
		
		System.out.println(100 + 10);
		System.out.println((100 + 10) / 10);
		System.out.println(((100 + 10) / 10) - 10);
		System.out.println((((100 + 10) / 10) - 10) * 10);
		
		int d = 100;
		System.out.println(d + 10);
		System.out.println((d+ 10) / 10);
		System.out.println(((d + 10) / 10) - 10);
		System.out.println((((d + 10) / 10) - 10) * 10);
		//100-> d로 만들어 중복을 제거 
		//버그 발생을 제한, 가독성 높임
		
	}
}
