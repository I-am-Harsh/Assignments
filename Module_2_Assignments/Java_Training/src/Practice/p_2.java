package Practice;

import java.util.*;
public class p_2 {
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    public static void main(String args[]){
        // get 4 employee name and add in map then print data

        Scanner sc = new Scanner(System.in);

        int employee_number = sc.nextInt();
        // sc.next();

        HashMap<String,Double> hm1 = new HashMap<String,Double>();
        for(int i = 0; i < employee_number; i++){
            String name = sc.next();
            double sal = sc.nextInt();
            hm1.put(name, sal);
        }

        // sort


        for (Map.Entry<String, Double> en : hm1.entrySet()) { 
            System.out.println("Name = " + en.getKey() +  ", Salary = " + en.getValue()); 
        } 
        sc.close();
    }
}
