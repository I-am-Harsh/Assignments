package Lab_1;

import java.util.Scanner;

public class Lab_1_1 {
	// calculateSum program


	public static int  calculateSum(int a) {

		int total = 0;
		for(int i = 0; i < a; i++){
			if(a % 3 == 0 || a % 5 == 0){
				total += i;
			}
		}

		return total;
	} 



	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		
		System.out.println(calculateSum(a));
		sc.close();
		 

	}
}
