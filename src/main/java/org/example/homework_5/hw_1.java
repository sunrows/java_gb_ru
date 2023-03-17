package org.example.homework_5;
/**
 * 1)Посчитать количество вхождений каждого слова в текст.
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class hw_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = new String();
        String words = new String();
        System.out.println(" Добавьте слова через Enter:");
        boolean flag = true;
        while (flag) {

            words = input.nextLine();
            line += " " + words;

            if ("".equals(words)) {
                flag = false;
            }
        }
        System.out.println(" Ваши введенные строки:" + line);
        line = line.toLowerCase();

        Map<String, Integer> wordsCount = new TreeMap<>(); // ОДИН из подвидов Hashmap
        /*
        for(<Тип элемента> <Имя переменной, куда будет записан очередной элемент> : <Название массива>) {
	        // Тело цикла
            }
         */
        /*
        Регулярные выражения
         */
        for (String word : line.split("\\s+")) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        System.out.println(" Встречались несколько раз: ");
        for (String word : wordsCount.keySet()) {
            if (wordsCount.get(word) > 1) {
                System.out.print(word + ": " + wordsCount.get(word) + " раза.");
            }
            System.out.println();
        }
    }


}





