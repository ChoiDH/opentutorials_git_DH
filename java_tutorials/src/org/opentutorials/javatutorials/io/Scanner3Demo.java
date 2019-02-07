package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("out.txt");
		
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 1000);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
