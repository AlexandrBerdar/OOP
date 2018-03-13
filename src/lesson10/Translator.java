package lesson10;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Translator {

    public static void main(String[] args) throws Exception {


        Map<String, String> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        map.put("Hello","Привет");
        map.put("Pleas","Пожалуйста");
        map.put("Good", "Хорошо");
        map.put("Why","Почему");
        map.put("I","Я");
        map.put("We","Мы");
        map.put("Pig","Свинья");

        System.out.println("Введите слово");

        String trans = reader.readLine();
        String value = map.get(trans);


        System.out.println(value);
    }
}
