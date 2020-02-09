package Lab_7;


import java.util.*;

public class Lab_7_3{

   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
       
        HashMap<Integer, Integer> hMap = new HashMap<Integer,Integer>();
        for(int j = 0; j < number; j++){
            int values = sc.nextInt();
            hMap.put(values, values * values);
        }

        System.out.println(hMap);
        sc.close();



    }
}