package Lab_3;

import java.util.Scanner;
import java.util.Arrays;

public class Lab_3_2 {
    public static void getSorted(int arr[]){
        
        String number;
        String reversed = "";
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            number = Integer.toString(temp);
            for(int j = number.length() - 1; j >= 0 ; j--){
                reversed += number.charAt(j);  
            }
            arr[i] = Integer.parseInt(reversed);
            reversed = "";
        }
        
        Arrays.sort(arr);
        System.out.println("Sorted array is -->");
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        
        for(int i = 0 ; i < number; i++){
            arr[i] = sc.nextInt();
        }
        getSorted(arr);
        // int[] a = getSorted(arr);
        // for(int i = 0 ; i < number; i++){
        //     System.out.println(a[i]);
        // }
        // System.out.println(a.length);
        sc.close();
    }
}
