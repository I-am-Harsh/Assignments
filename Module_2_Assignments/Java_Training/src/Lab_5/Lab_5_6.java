package Lab_5;

// import Lab_5.exception.*;
import com.cg.eis.exception.*;



public class Lab_5_6 {
    public static void main(String args[]){
        int salary = 100;

        try{
            if(salary < 3000){
                throw new EmployeeException();
            }
            else{
                System.out.println("Passed");
            }
        }
        catch(EmployeeException e){
            e.lowSal();
        }
    }
}
