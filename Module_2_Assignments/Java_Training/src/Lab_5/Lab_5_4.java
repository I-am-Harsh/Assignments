package Lab_5;
import java.util.*;



class nameException extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void name(String message) {
        System.out.println(message);
    }
}



public class Lab_5_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = sc.nextLine();
        sc.close();

        // System.out.println("Enter your last name");

        // String lastName = sc.nextL();
        String lastName = "";

        try {
            if (firstName.isEmpty() || lastName.isEmpty()) {
                throw new nameException();
            } else {
                System.out.println("Validated");
            }
            
        }

        catch(nameException e ) {
            e.name("name cant be empty");
        }

        
    }


}
