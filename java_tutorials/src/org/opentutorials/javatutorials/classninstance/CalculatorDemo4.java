package org.opentutorials.javatutorials.classninstance;
 
class C1{
	
    static int static_variable = 1;	//클래스 변수
    int instance_variable = 2;		//인스턴스 변수
    
    static void M_static_V_static(){
    	System.out.println("M_static_V_static");
        System.out.println(static_variable);
    }
    static void M_static_V_instance(){
    	System.out.println("M_static_V_instance");
        // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다. 
        //System.out.println(instance_variable);
    }
    void M_instance_V_static(){
    	System.out.println("M_instance_V_static");
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
        System.out.println(static_variable);
    }
    void M_instance_V_instance(){
    	System.out.println("M_instance_V_instance");
        System.out.println(instance_variable);
    }
    
}
public class CalculatorDemo4 {  
    public static void main(String[] args) {
        C1 c = new C1();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
        
        System.out.println("==인스턴스 변수==");
        c.M_static_V_static();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 인스턴스 변수에 접근 -> 실패
        c.M_static_V_instance();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        c.M_instance_V_static();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공 
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        c.M_instance_V_instance();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공
        
        System.out.println();
        System.out.println("==클래스 변수==");
        C1.M_static_V_static();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        C1.M_static_V_instance();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.M_instance_V_static();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.M_instance_V_instance();
    }
 
}