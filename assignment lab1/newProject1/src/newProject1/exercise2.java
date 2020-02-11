package newProject1;

import java.util.Scanner;

public class exercise2 {
	static int calculateDifference(int n)
	{
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1+=Math.pow(i, 2);
			sum2+=i;
		}
		int diff=sum1-sum2;
		return diff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		int retdiff=calculateDifference(n);
		System.out.println("Difference is : "+retdiff);
	}

}
