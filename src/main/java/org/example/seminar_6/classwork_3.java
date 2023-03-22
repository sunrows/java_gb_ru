package org.example.seminar_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class classwork_3 {
//    Найти пересечения слов в массивах и указать их общее количество.
//    Пример:
//    Mas1= [“qwe”,”asd”,”qwe”,”x”]
//    Mas2=[“qwe”,”v”]
//    Результат:
//    qwe=3

    public static void main(String[] args) {
        List<String> inputArray1 = new ArrayList<>(List.of("qwe","asd","zxc", "v", "v"));
        List<String> inputArray2 = new ArrayList<>(List.of("qwe","v"));

        Set<String> cross = new HashSet<>(inputArray1);
        List<String> all = new ArrayList<>(inputArray1);
        all.addAll(inputArray2);
        cross.retainAll(inputArray2);

        for(String item : cross){
            int count = 0;
            for (String allItem : all){
                if(item.equals(allItem)) count++;
            }
            System.out.println(item + " " + count);
        }
    }
}

