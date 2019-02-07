package org.opentutorials.javatutorials.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodDemo7 {

	public static String number(int init, int end){
		int i= init;
		String output = "";
		while (i<end) {
			output += i;
			i++;
		}
		
		
		
		return output;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = number(1, 5);
		System.out.println(result);
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			//C:\Users\DH\git\opentutorials_git_DH\java_tutorials
            
			out.write(result);
            out.close();
		} catch (IOException e) {
		}
	}

}
