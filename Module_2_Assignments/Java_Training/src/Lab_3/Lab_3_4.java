package Lab_3;

import java.util.*;

public class Lab_3_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        char[] arr = new char[number];
        int[] occur = new int[26];
        for(int i = 0; i < number ; i++){
            arr[i] = sc.next().charAt(0);
            occur[(int)arr[i] - 97] ++;
        }

        System.out.println("Occurence is as follows ");

        for(int i = 0; i < 26; i++){
            if(occur[i] != 0){
                System.out.println("Charcter : " + (char)(97+i) + "Count : " + occur[i]);
            }
        }
        sc.close();
    }
}