package org.opentutorials.javatutorials.array;

import java.util.Iterator;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = {"최진혁","최유빈","한이람"};
		for (String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}
		
		//java 5.0부터 도입된 기능이다.
	}

}
