package org.opentutorials.javatutorials.scope;
 
public class ScopeDemo3 {
    static int i;
     
    static void a() {
    	//static int i = 0;	기존 i라는 객체가 존재
        int i = 0;
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
 
}