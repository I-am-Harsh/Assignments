package Lab_7;


import java.util.*;

public class Lab_7_2{

   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        
        char arr[] = new char[number];
        int occur[] = new int[26];

        for(int i = 0; i < number; i++){
            arr[i] = sc.next().charAt(0);
            occur[(int) arr[i] - 97] += 1;
        };

        System.out.println(occur[0]);
        sc.close();

        HashMap<Character, Integer> hMap = new HashMap<Character,Integer>();
        for(int j = 0; j < 26; j++){
            if(occur[j] != 0)
                hMap.put((char)(97 + j),occur[j]);
        }

        System.out.println(hMap);
    }
}