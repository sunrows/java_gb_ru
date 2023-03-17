package org.example.homework_5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class hw_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> line = new ArrayList<String>();

        String word = new String();
        int sumOfWordsCounts = 0;
        // Ниже код добавит в строку слова
        System.out.println(" Добавьте слова через Enter:");
        boolean flag = true;

        while (flag) {
            word = input.nextLine();
            line.add(word);
            if ("".equals(word)) {
                flag = false;
            }
        }

        System.out.println(" Ваши введенные строки:" + Arrays.toString(line.toArray()));
        // Сделаем lowercase list - Можно было прописать сразу в word и добавить в List но тогда при выводе в консоль
        // мы бы получили lowercase-ы
        List<String> lowerCaseOfLines = line.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // РОЗЫСК слова
        System.out.println(" Введите искомое слово: ");
        word = input.nextLine().toLowerCase();
        System.out.println(word);

        for (int i = 0; i < line.size(); i++) {

            if (word.equals(line.get(i))) {
                sumOfWordsCounts += 1;
            }

        }
        System.out.println("Слово, " + word + " встречается " + sumOfWordsCounts + " раз! ");


    }
}
