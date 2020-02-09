package Practice;

import java.util.*;
public class p_1 {
    public static void main(String args[]){
        // get 4 employee name and add in map then print data

        Scanner sc = new Scanner(System.in);

        int employee_number = sc.nextInt();
        // sc.next();

        Map<Integer, String> map = new HashMap<Integer, String>();
        for(int i = 0; i < employee_number; i++){
            String name = sc.next();
            map.put(i, name);
        }
        System.out.println(map);
        sc.close();
    }
}
