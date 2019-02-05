package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		
		i++;
		System.out.println(i);
		
		++i;
		System.out.println(i);
		
		System.out.println(i++);	//print 후 연산
		System.out.println(++i);
		
		System.out.println(i);
		
		System.out.println("연산자 우션순위 ="+(4-3*6));
	}

}
