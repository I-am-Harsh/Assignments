package Practice;


import java.util.*;

class passMatch extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    // public void passMatch(String message){
    //     System.out.println(message);
    // }

    // match function
    public void match() {
        System.out.println("The password didnt match");
    }

    
}

public class passException{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String password = sc.next();
        String rePassword = sc.next();
        sc.close(); 

        try{
            if(password.equals(rePassword)){
                System.out.println("Matched");
            }
            else{
                throw new passMatch();            
            }

        }
        // catch(Exception e){
        //     // first way
        //     // System.out.println("Password didn't match");

        //     // second way
        //     passMatch gg = new passMatch();
        //     gg.match();
        // }



        // third way
        catch(passMatch e){
            e.match();
        }
    }
}