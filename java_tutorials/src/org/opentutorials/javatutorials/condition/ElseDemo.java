package org.opentutorials.javatutorials.condition;

public class ElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);	//해당문만 실행
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
		
		System.out.println("=========================");
		if(false){
		    System.out.println(1);
		} else if(false) {
		    System.out.println(2);
		} else if(true) {
		    System.out.println(3);	
		} else {
		    System.out.println(4);
		}
		
		
		System.out.println("=========================");
		if(false){
		    System.out.println(1);
		} else if(false) {
		    System.out.println(2);
		} else if(false) {
		    System.out.println(3);
		} else {
		    System.out.println(4);
		}
	}

}
