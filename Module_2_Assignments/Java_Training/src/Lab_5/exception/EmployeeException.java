package Lab_5.exception;

public class EmployeeException extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void lowSal() {
        System.out.println("Salary is below 3000");
    }
}
