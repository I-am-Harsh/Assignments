package Lab_6;

import java.util.*;


public class Lab_6_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        sc.close();
        for(int i = 0; i < word.length() - 2; i++){
            int temp1 = word.charAt(i);
            int temp2 = word.charAt(i+1);
            if(temp2 < temp1){
                System.out.println("This is not a positive string");
                break;
            }
            System.out.println("Tis positive");

        }

    }
}