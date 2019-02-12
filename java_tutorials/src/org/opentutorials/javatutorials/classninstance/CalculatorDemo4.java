package org.opentutorials.javatutorials.classninstance;
 
class C1{
	
    static int static_variable = 1;	//Ŭ���� ����
    int instance_variable = 2;		//�ν��Ͻ� ����
    
    static void M_static_V_static(){
    	System.out.println("M_static_V_static");
        System.out.println(static_variable);
    }
    static void M_static_V_instance(){
    	System.out.println("M_static_V_instance");
        // Ŭ���� �޼ҵ忡���� �ν��Ͻ� ������ ���� �� �� ����. 
        //System.out.println(instance_variable);
    }
    void M_instance_V_static(){
    	System.out.println("M_instance_V_static");
        // �ν��Ͻ� �޼ҵ忡���� Ŭ���� ������ ���� �� �� �ִ�.
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
        // �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
        // �ν��Ͻ� �޼ҵ尡 ���� ������ ���� -> ����
        
        System.out.println("==�ν��Ͻ� ����==");
        c.M_static_V_static();
        // �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
        // ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        c.M_static_V_instance();
        // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        // �ν��Ͻ� �޼ҵ尡 Ŭ���� ������ ���� -> ����
        c.M_instance_V_static();
        // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ���� 
        // �ν��Ͻ� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        c.M_instance_V_instance();
        // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
        // Ŭ���� �޼ҵ尡 Ŭ���� ������ ���� -> ����
        
        System.out.println();
        System.out.println("==Ŭ���� ����==");
        C1.M_static_V_static();
        // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
        // Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        C1.M_static_V_instance();
        // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        //C1.M_instance_V_static();
        // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        //C1.M_instance_V_instance();
    }
 
}