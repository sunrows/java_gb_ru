/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */

package org.example.homework_2;

import java.util.Arrays;

public class hw3 {
    public static void main(String[] args) {
        int[] naturalNumbers = {12, 232, 43, 54, -62, 58, -99, 171, 7}; // Последовательность N чисел!
        System.out.println(Arrays.toString(naturalNumbers));
        int sumOfIndexesTwoFiguresInNumber = 0;
        for (int i=0; i<naturalNumbers.length; i++){
            if(naturalNumbers[i]/100 == 0){
                sumOfIndexesTwoFiguresInNumber += i;
            }
        }
        System.out.println(" Сумма индексов двухзначных элементов: " + sumOfIndexesTwoFiguresInNumber);
        for (int i=0; i<naturalNumbers.length; i++){
            if(naturalNumbers[i] < 0){
                naturalNumbers[i] = sumOfIndexesTwoFiguresInNumber;
            }
        }
        System.out.println(Arrays.toString(naturalNumbers));

    }
}
