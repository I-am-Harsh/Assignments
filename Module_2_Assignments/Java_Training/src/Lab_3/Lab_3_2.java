package Lab_3;

import java.util.Scanner; 

public class Lab_3_2{
    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        String[] arr = new String[number];
        
        for(int i = 0 ; i < number; i++){
            arr[i] = sc.next();
        }
        int capital = 0;
        if(number % 2 == 0){
            capital = number / 2;
        }
        else{
            capital = number / 2 + 1;
        }
        System.out.println("Capital : " + capital);

        for(int i = 0; i < number; i++){
            for(int j = i+1; j < number; j++){
                if(arr[i].compareTo(arr[j]) > 0){
                        System.out.println(i);
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    System.out.println("y");
                }
            }
        }
        for(int i = 0; i < number; i++){
            if(i < capital)
                System.out.print(arr[i].toUpperCase() + " ");
            else
                System.out.print(arr[i] + " ");
        }
        
        sc.close();
         
    } 
} 