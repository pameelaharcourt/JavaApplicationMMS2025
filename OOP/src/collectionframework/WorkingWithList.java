
package collectionframework;

import java.util.List;
import java.util.ArrayList;

public class WorkingWithList {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        int counter = 0;
        
        // adding names to the objects
        names.add("Jack");
        names.add("Ben");
        names.add("Williams");
        names.add("Ben");
        
        names.remove("Ben");
        names.add("Pamela");
        
        
        for(String name : names) {
            System.out.printf("%-10s --- %d%n", name, counter);
            counter++;
            
        }
        
        
    
    }
    
    
}
