package Lab_1;

import java.util.Scanner;

public class lab_1_4 {
    public static boolean checkNumber(int num) {

        int num1 = num;
        boolean ans = false;
        while(num1 % 2 == 0 && num1 != 0 ){
            num1 = num1 / 2;
            System.out.println(num1);
        }

        if(num1 == 1){
            return ans = true;
        }
        else{
            return ans;
        }
		
	} 



	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		
        System.out.println(checkNumber(a));
        
        sc.close();

		 

	}
}
