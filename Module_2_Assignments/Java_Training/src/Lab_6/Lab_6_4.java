package Lab_6;

import java.io.*;
import java.util.Scanner;

public class Lab_6_4 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine().trim();
		

		File file = new File(fileName);
		if(!file.exists()){
			System.out.println("The file doesn't exists");
		}
		else{
			System.out.println("Java file read : " + file.canRead());
			System.out.println("Java file canWrite : " + file.canWrite());
			System.out.println("Java file  : " + file.length());
		}
		sc.close();

	}

}
