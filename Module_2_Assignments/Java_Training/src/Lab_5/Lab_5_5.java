package Lab_5;
import java.util.*;


class ageException extends Exception{
    /**
     *
     */
    // exception class
    private static final long serialVersionUID = 1L;

    public void age(String message) {
        System.out.println(message);
    }
}

public class Lab_5_5 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age");

        int age = sc.nextInt();
        sc.close();
        try{
            if(age <= 15){
                throw new ageException();
            }
            else{
                System.out.println("Welcome");
            }
        }
        catch (ageException err){
            err.age("Age cant be less than 15");
        }

        
    }
}
