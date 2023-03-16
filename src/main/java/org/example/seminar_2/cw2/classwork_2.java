/*
Дана последовательность из N целых чисел, Найти сумму чисел, оканчивающихся на 5, перед котрыми идет четное число!
 */
package org.example.seminar_2.cw2;
import java.util.Arrays;

public class classwork_2 {
    public static void main(String[] args) {
        int [] myarray = {12,22,45,50,20,5,12,32,43,72};
        System.out.println(Arrays.toString(myarray));
        System.out.println("Индексы чисел у которых, число делится на 5 без остатка и перед ним стоят четные:\n ");
        double sum = 0;
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i]%10 == 5 && myarray[i-1]%2 == 0) {

                System.out.printf(i+"   ");
                sum += myarray[i];
            }

        }
        System.out.println(" Сумма таких элементов: " + sum);
    }
}
