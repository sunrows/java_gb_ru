package org.example.seminar_5;

import java.util.HashMap;
import java.util.Map;

public class classwork_1 {

    /**
     *1)Посчитать количество вхождений каждого символа в текст.
     */
    public static void main(String[] args) {
        Map<Character,Integer> mapCh = new HashMap<>();
        String str = "ewwe dqqweejbdqew jhbewqeqweqweqeewqwfe";
        for (int i = 0; i < str.length(); i++) {
            mapCh.putIfAbsent(str.charAt(i),1);
            mapCh.put(str.charAt(i),mapCh.get(str.charAt(i))+1);
//            if (!mapCh.containsKey(str.charAt(i))){
//                mapCh.put(str.charAt(i),1);
//            }else{
//                mapCh.put(str.charAt(i),mapCh.get(str.charAt(i))+1);
//            }
        }
        for (var entry:mapCh.entrySet()) {
            System.out.println(entry.getKey()+"  встретился - "+entry.getValue()+"  раз");
        }
    }

}
