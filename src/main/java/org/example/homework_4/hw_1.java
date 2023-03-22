package org.example.homework_4;

import java.util.LinkedList;

/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 */


public class hw_1 {

    public static void main(String[] args) {
        LinkedList inputList = new LinkedList<>();
        for (int i = 0; i < 10; i++) inputList.add(i);

        System.out.println(inputList);
        LinkedList revers = reverseList(inputList);
        System.out.println(revers);
    }

    private static LinkedList reverseList(LinkedList inputList) {
        LinkedList result = new LinkedList();
        while (inputList.size() > 0) {
            result.addFirst(inputList.pop());
        }
        return result;
    }

}
