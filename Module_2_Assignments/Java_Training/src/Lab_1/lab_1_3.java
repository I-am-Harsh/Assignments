package Lab_1;

import java.util.Scanner;

public class lab_1_3 {
    public static boolean checkNumber(int num) {


       boolean flag = false;
        
        
       //3
       int currentDigit = num % 10;
       num = num/10;
        
       //4
       while(num>0){
           //5
           if(currentDigit <= num % 10){
               flag = true;
               break;
           }
           currentDigit = num % 10;
           num = num/10;
        }

        return flag;

		
	} 



	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		
		System.out.println(checkNumber(a));

		 
        sc.close();
	}
}
