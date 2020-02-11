package newProject1;

import java.util.Scanner;

public class exercise4 {
	static boolean checkNumber(int n)
	{
		while (n != 1) 
        { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		boolean retval=checkNumber(n);
		if(retval)
			System.out.println("Number is a power of 2");
		else
			System.out.println("Number is not a power of 2");
	}

}
