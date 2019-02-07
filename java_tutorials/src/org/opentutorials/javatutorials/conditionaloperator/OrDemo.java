package org.opentutorials.javatutorials.conditionaloperator;

public class OrDemo {

	 public static void main(String[] args) {
	        String id = "egoing";
	        String password = "111111";
	        if ((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi"))
	        		&& password.equals("111111")) {
	            System.out.println("right");
	        } else {
	            System.out.println("wrong");
	        }
	    }

}
