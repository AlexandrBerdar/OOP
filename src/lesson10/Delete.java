package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Delete {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 4, 5, 3, 5, 6};
        Map<Integer, Integer> map = new HashMap<>();

        for (int arrayElement : array) {
            Integer amount = map.get(arrayElement);
            if (amount == null) {
                map.put(arrayElement, 1);
            } else {
                map.put(arrayElement, null);
            }



                Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
                for (Map.Entry<Integer, Integer> entry : entries) {
                    if (entry.getValue() != null) {


                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }
        }
    }
}