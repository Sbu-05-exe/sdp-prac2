package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static Boolean Task5(List<Integer> T) {
        List<Integer> test  = new ArrayList<Integer>();
        int len = T.size();
        for (int i = 0; i < len; i++) {
            test.add(T.get(i));
        }
        Collections.sort(T); 
        for (int i = 0; i < len; i++) {
            if (T.get(i) != test.get(i)) {
                return false;
            }
        }
        return true; 
    }
    
}
