package Practice;
import java.io.*; 
import java.util.*; 
  
class arraylist 
{ 
    public static void main(String[] args) throws IOException 
    { 
        // size of ArrayList 
        int n = 5; 
  
        //declaring ArrayList with initial size n 
        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
  
        // Appending the new element at the end of the list 
        for (int i=1; i<=n; i++) 
            arrli.add(i); 
  
        // Printing elements 
        System.out.println(arrli); 
  
        // Remove element at index 3 
        arrli.remove(3); 
  
        // Displaying ArrayList after deletion 
        System.out.println(arrli); 
  
        // Printing elements one by one 
        for (int i=0; i<arrli.size(); i++) 
            System.out.print(arrli.get(i)+" "); 






        // iterator example



        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
        list.add("Ravi");//Adding object in arraylist  
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
        //Traversing list through Iterator  
        Iterator<String> itr=list.iterator();  
        while(itr.hasNext())  
            System.out.println(itr.next());  




        // for each

        ArrayList<String> al=new ArrayList<String>();  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        //Traversing list through for-each loop  
        for(String obj:al)  
            System.out.println(obj);
            
        






            ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
            list.add("Ravi");//Adding object in arraylist  
            list.add("Vijay");  
            list.add("Ravi");  
            list.add("Ajay");  
             
            System.out.println("Traversing list through List Iterator:");  
            //Here, element iterates in reverse order  
               ListIterator<String> list1=list.listIterator(list.size());  
               while(list1.hasPrevious())  
               {  
                   String str=list1.previous();  
                   System.out.println(str);  
               }  
         System.out.println("Traversing list through for loop:");  
            for(int i=0;i<list.size();i++)  
            {  
             System.out.println(list.get(i));     
            }  
               
         System.out.println("Traversing list through forEach() method:");  
         //The forEach() method is a new feature, introduced in Java 8.  
             list.forEach(a->{ //Here, we are using lambda expression  
                 System.out.println(a);  
               });  
                 
             System.out.println("Traversing list through forEachRemaining() method:");  
               Iterator<String> itr1=list.iterator();  
               itr1.forEachRemaining(a-> //Here, we are using lambda expression  
               {  
             System.out.println(a);  
               });  

               al.set(1,"Gaurav");  
    } 
} 




// to remove use .remove() with index number or 