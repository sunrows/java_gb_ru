package org.example.seminar_2.cw3;

/*
Дана массив целых чисел, найти количество пар соседних элементов где первый элемент вдвое больше второго.
 */
public class classwork_3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 5, 7, 3, 9, 4, 2, 1}));
    }

    public static int solution(int[] inputArr) {
        int count = 0;
        for (int i = 1; i < inputArr.length; i++) {

            if (inputArr[i - 1] == inputArr[i] * 2) {
                count++;
            }

        }
        return count;
    }
}
