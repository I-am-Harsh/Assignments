package Lab_6;

import java.time.*;
import java.util.*;

public class Lab_6_6 {  
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in the format DD MM YYYY and press enter after each input");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        LocalDate pdate = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        sc.close();
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
  }
}