package org.example.homework_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List inputList = List.of(1, 3, 3, 4, 4);
        HashSet noDouble = new HashSet<>(inputList); //избавляемся от дублей
        List noDouble2 = new ArrayList(noDouble);
        List res = getAnswer(noDouble2);
        System.out.println(res);
    }

    public static List getAnswer(List inputList){
        int size = inputList.size();
        List exList = new ArrayList();
        List resIndexes = getPermutations(size, exList); //сначала получаем перестановку для индексов
        List res = new ArrayList<>();
        for (Object item : resIndexes){ //теперь уже подставляем изначальные значения
            List newList = new ArrayList<>();
            for(Object value : (Collection) item){
                newList.add(inputList.get((Integer) value));
            }
            res.add(newList);
        }
        return res;
    }

    private static List getPermutations(int size, List exList) {


        List res = new ArrayList();
        for (int i = 0; i < size; i++) {
            if (!exList.contains(i)) {
                List newExList = new ArrayList(exList);
                newExList.add(i);
                if (newExList.size() == size) {
                    res.add(i);
                    return res;
                }
                List lastList = getPermutations(size, newExList);
                for (int j = 0; j < lastList.size(); j++) {
                    List newList = new ArrayList();
                    newList.add(i);
                    List lastList2 = convertToCollection(lastList.get(j));
                    newList.addAll(lastList2);
                    res.add(newList);
                }

            }
        }
        return res;

    }

    private static List convertToCollection(Object o) {
        String type = o.getClass().getName();
        List res;
        if(type == "java.lang.Integer"){
            res = List.of(o);
        }
        else {
            res = new ArrayList((Collection) o);
        }
        return res;
    }


}
