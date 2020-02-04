package project1;
import java.util.*;

public class throwException {

	void compute()
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
		try
		{
			if(age<=0)
				throw new ArithmeticException();
			System.out.println("Age : "+age);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Age cannot be negative or 0");
		}
	}
	public static void main(String[] args) {
		throwException th=new throwException();
		th.compute();
	}
}
