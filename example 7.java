working of a HashSet

import java.util.*;
  
public class Main {
    
    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<String>();
  
        hs.add("you");
        hs.add("are");
        hs.add("looking");
        hs.add("Very");
        hs.add("pretty");
  
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}v