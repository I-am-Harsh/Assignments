package Lab_5;

import java.util.Scanner;


public class Lab_5_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		sc.close();
		System.out.println(input.toLowerCase());
		if(input.toLowerCase().equals("red"))
			System.out.println("STOP");

		else if(input.equalsIgnoreCase("green"))
			System.out.println("Go");

		else if(input.toLowerCase().equals("yellow"))
			System.out.println("Wait");
		else{
			System.out.println("The input doesnt match anything");
		}
	}

}
