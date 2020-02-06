package Lab_6;

import java.util.*;
import java.util.regex.*;  

public class Lab_6_7{

   
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);

        String name = sc.nextLine();
        sc.close();

        if(Pattern.matches("[a-z]{8,}_job",name)){
            System.out.println("Ok");
        }
        else{
            System.out.println("LoL nO");
        }
    }
}