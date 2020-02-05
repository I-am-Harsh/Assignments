package project1;

import java.util.Scanner;

class MyException extends RuntimeException
{
	MyException()
	{
		super("Invalid age");
	}
}

public class customException {
	void compute()
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
		try
		{
			if(age<=0)
				throw new MyException();
			System.out.println("Age : "+age);
		}
		catch(MyException e)
		{
			System.out.println(e);
			System.out.println("Age cannot be negative or 0");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customException ce=new customException();
		ce.compute();
	}

}
