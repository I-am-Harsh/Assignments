package project1;

import java.util.Scanner;

public class FinallyExample {
	void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age");
		try
		{
			age=sc.nextInt();
			name=sc.next();
			System.out.println(name+" "+age);
		}
		catch(ArithmeticException e)
		{
			
		}
	}

	public static void main(String[] args) {
		
	}
}
