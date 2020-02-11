package newProject1;

import java.util.Scanner;

public class exercise3 {
	static boolean checkNumber(int n)
	{
		int max=10;
		while(n!=0)
		{
			int r=n%10;
			if(r>max)
				return false;
			
			max=r;
			n=n/10;
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
			System.out.println("Number is increasing");
		else
			System.out.println("Number is not increasing");
	}

}
