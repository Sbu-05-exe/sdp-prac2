package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {

    }

    public int Task1(List<Integer> a, List<Integer> b) {

        int result = 0;
        for (int i = 0; i < b.size() - 1; i++) {

            int index = b.get(i);

            // b.get(index);

            if (index < a.size() - 1 && index >= 0) {
                result = result + a.get(index);
            }

        };

        return result;
    }
}
