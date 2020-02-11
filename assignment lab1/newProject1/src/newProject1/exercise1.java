package newProject1;

import java.util.Scanner;

public class exercise1 {
	static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3 == 0 || i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		int retvalue=calculateSum(n);
		System.out.println("Sum is : "+retvalue);
	}

}
