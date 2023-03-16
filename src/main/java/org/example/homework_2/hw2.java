package org.example.homework_2;


import java.util.Arrays;

/*

Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

 */
public class hw2 {

    public static void main(String[] args) {
        int up = 0;
        int down = 0;

        int[] naturalNumbers = {12, 23, 43, 54, 62, 58, 99, 171, 227}; // Последовательность N чисел!
        //System.out.println(Arrays.toString(naturalNumbers));
        for (int i = 0; i < naturalNumbers.length-1; i++) {
            if(naturalNumbers[i]<naturalNumbers[i+1]){
                up +=1;
            } else if (naturalNumbers[i]>naturalNumbers[i+1]) {
                down+=1;

            }
        }
        if(up !=0 && down == 0){
            System.out.println(Arrays.toString(naturalNumbers) + " является возрастающим.");

        }
        else{
            System.out.println(Arrays.toString(naturalNumbers) + " является НЕвозрастающим.");
        }

    }
}
