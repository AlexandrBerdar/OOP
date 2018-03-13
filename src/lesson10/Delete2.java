package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Delete2 {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 4, 5, 3, 5, 6};
        Map<Integer, Integer> map = new HashMap<>();

        int counter = 0;
        boolean f = true;
        for(int i=0; i<array.length;i++) {
            f = map.containsKey(array[i]);
            if(f == false)
            {map.put(array[i],0);}
        }
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : set)
            System.out.println(entry.getKey());
    }
}