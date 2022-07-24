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

    /*  take numbers from list, round them up the next 
        hundred and insert them into a new list and return it */
    public static ArrayList Task6 (ArrayList<Integer> list){
        ArrayList newList = new ArrayList<Integer>();
        int i = 0;
        while (i < list.size()){
            int num = list.get(i);
            int checkHundred = num % 100; //returns 0 if it was a multiple of 100
            if (checkHundred == 0){
                newList.add(num);
            } else if (num < 100) {
                newList.add(100);   // numbers below 100 will have 100 to a multiple 
            } else{
                int roundUp = num / 100;
                roundUp = roundUp * 100 + 100;
                newList.add(roundUp);
            }           
            i++;
        }
        return newList;
    }
}
