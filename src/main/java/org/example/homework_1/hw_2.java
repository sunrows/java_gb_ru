/*
2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5

 */

package org.example.homework_1;

import java.util.Arrays;
import java.util.Scanner;

public class hw_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        int [] integerArrays = new int[10];
        System.out.println(" Введите числа нажатием ENTER: (не более 10 элементов.)");
       for (int i=0;i<integerArrays.length; i++) {
           integerArrays[i] = input.nextInt(); //Записываем данные клавиатуры на массив
        }
        input.close();

        System.out.println(Arrays.toString(integerArrays));
        int sum = 0;

        for (int i = 0; i < integerArrays.length; i++){

            if( integerArrays[i] < 0) {
                    sum += integerArrays[i-1];
            }
            if (integerArrays[i]==0){
                System.out.println(" Элемент: " + i + " является нулем!" );
                break;
            }
        }
        System.out.println("Сумма элементов содержащих после себя отрицательные значения: "+sum);






    }
}
