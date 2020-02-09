package Lab_6;

import java.util.*;
import java.text.SimpleDateFormat;    
import java.util.Date;     


public class Lab_6_6{

    // void getdate(String year,String month,String day){

    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date in the format DD MM YYYY");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        System.out.println(formatter.format(date));   
        
        // String day = sc.nextLine();
        // String month = sc.nextLine();
        // String year = sc.nextLine();


        sc.close();
        

    }
}