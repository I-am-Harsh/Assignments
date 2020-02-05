package Lab_1;

import java.util.Scanner;



public class lab_1_2 {
	// calculateDiff program


	public static int  calculateSum(int a) {

        int total_sum = 0;
        int sum_total = 0;
        // sum of squares
		for(int i = 1; i < a; i++){			
            total_sum += (i * i);
			
        }

        for(int i = 1; i < a; i++){			
            sum_total += i;

            sum_total = sum_total * sum_total;
			
        }


        

		return (total_sum - sum_total);
	} 



	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		
		System.out.println(calculateSum(a));

        sc.close();

	}
}
