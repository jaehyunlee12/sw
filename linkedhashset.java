package exceptiondemo;
import java.util.*;
import java.util.List;
public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set1.add("George"); set1.add("Jim");set1.add("John");
        set1.add("Blake"); set1.add("Kevin"); set1.add("Michael");
        set2.add("George"); set2.add("Katie"); set2.add("Kevin");
        set2.add("Michelle"); set2.add("Ryan"); 
        System.out.println(set1);System.out.println(set2);
        LinkedHashSet<String> cloned_set1 = new LinkedHashSet<>();
        LinkedHashSet<String> cloned_set2 = new LinkedHashSet<>();
        cloned_set1 = (LinkedHashSet<String>)set1.clone();
        cloned_set2 = (LinkedHashSet<String>)set2.clone();
        System.out.println("Union of set1 and set2 : ");
        set1.addAll(set2);
        System.out.println(set1);
        set1.clear();
        set1.addAll(cloned_set1);
    
        
        System.out.println("\nDifference of set1 and set2 : ");
        set1.removeAll(set2);
        System.out.println("set1 : "+set1);
        set1.clear();
        set1.addAll(cloned_set1);
     
        
        set2.removeAll(set1); 
        System.out.println("set2 : "+set2);
        set2.clear();
        set2.addAll(cloned_set2);
       
       
        
        System.out.println("\nIntersection of set1 and set2 : ");
        set1.retainAll(set2);
        System.out.println(set1);
	}
}
