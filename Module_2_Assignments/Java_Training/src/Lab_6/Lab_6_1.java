package Lab_6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab_6_1 {

	public static void main(String[] args) {
	
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers with gap : ");
		String s = sc.nextLine();
		sc.close();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens()){
			String temp = st.nextToken();
			sum += Integer.parseInt(temp);
		}
		System.out.println("The sum is : " + sum);
	}

}
