package lesson10;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,352,4,234};
        Map<Integer, Integer> map = new HashMap<>();
        for (int arrayElement:array) {
            Integer amount = map.get(arrayElement);
            if (amount == null){
                map.put(arrayElement, 1);
            }else {
                map.put(arrayElement, amount + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

    }
}

