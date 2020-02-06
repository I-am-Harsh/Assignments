package Lab_3;
import java.util.Scanner; 
  
class SecondSmallest 
{ 
    static void checkNumber(int arr[]) 
    { 
        int first, second, arr_size = arr.length; 
  
        
        if (arr_size < 2) 
        { 
            System.out.println(" Invalid Input "); 
            return; 
        } 
  
        first = second = Integer.MAX_VALUE; 
        for (int i = 0; i < arr_size ; i ++) 
        { 
          
            if (arr[i] < first) 
            { 
                second = first; 
                first = arr[i]; 
            } 
  
            else if (arr[i] < second && arr[i] != first) 
                second = arr[i]; 
        } 
        if (second == Integer.MAX_VALUE) 
            System.out.println("There is no second" + "smallest element"); 
        else
            System.out.println( "Second Smallest" + " element is " + second); 
    } 

    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int[] arr = new int[number];
        
        for(int i = 0 ; i < number; i++){
            arr[i] = sc.nextInt();
        }
        checkNumber(arr); 
    } 
} 