package org.opentutorials.javatutorials.numberString;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("숫자와 문자");
		
		System.out.println("================");
		System.out.println("숫자");
		System.out.println("1.정수연산 = "+(1+2));
		System.out.println("2.실수연산 = "+(1.5+2.5));
		System.out.println("3.곱셈 연산 = "+ (2*5));
		System.out.println("4.나누기 연산 = "+ (6/2)+"\n\n");
		
		System.out.println("================");
		System.out.println("문자");
		System.out.println('생');		//문자는 ''
		//System.out.println('생황코딩'); 	
		//문자형식에서 문자열을 삽입하면 에러가 발생한다.
		System.out.println("생");		
		System.out.println("생활코딩");	//문자열 ""
		
		
		System.out.println("1"+"1"); 	//문자열에 해당
		System.out.println(1+1);  		//숫자에 해당
		
		
		System.out.println("'안녕하세요'");	//''(따옴표)를 출력
		System.out.println("최대한 : \"안녕하세요\"");	
		//이스케이프 : \(역슬래시) 사용하여 "가 구분자 역활 -> 단순 문자로 활용 
		System.out.println("HTML\nCSS\nJavascript\n");
		//\n을 이용하여 개행 작업
		
		
		
	}

}
