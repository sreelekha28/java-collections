working of a LinkedHashSet

import java.util.*;
  
public class Main {
    
    public static void main(String args[])
    {

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
  
        lhs.add("you");
        lhs.add("are");
        lhs.add("looking");
        lhs.add("very");
        lhs.add("pretty");
  
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}