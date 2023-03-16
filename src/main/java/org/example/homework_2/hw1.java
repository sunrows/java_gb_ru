/**
 * Задачу (0) смотрите в Seminar_2!
 * Задача (1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */


package org.example.homework_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class hw1 {
    public static void main(String[] args) {


        int[] naturalNumbers = {12, 23, 43, 54, 62, 22, 45, 71, 7}; // Последовательность N чисел!

        /*
        можем конечно делить число, найти чтобы она делилась на саму себя через цикл, но нашел
        информацию что уже поиск таких чисел реализован в Тесте Рабина миллера!
         */
        int sumOfProbableNumbers = 0;

        ArrayList<Integer> probableNumbers = new ArrayList<>(); // для вывода простых чисел

        for (int i = 0; i < naturalNumbers.length; i++) {
            // ниже код идет по тесту Рабина
            Integer integer = naturalNumbers[i];
            BigInteger bigInteger = BigInteger.valueOf(integer);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));

            if (probablePrime) {
                sumOfProbableNumbers += naturalNumbers[i];
                probableNumbers.add(naturalNumbers[i]);
            }


        }
        System.out.println(" Массив введенный:" + Arrays.toString(naturalNumbers));
        System.out.println(" Простые числа в массиве: " + probableNumbers);
        System.out.println(" Сумма простых чисел: " + sumOfProbableNumbers);


    }

}
