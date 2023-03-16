package org.example.seminar_2.cw1;

import java.util.Scanner;

/*
Возвести в степень число!
 */
public class classwork_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(pow(x,n));
    }

    private static double pow(double x, int n) {
        double result = 1.0;
        if (n<0) {
            x = 1/x;
            n = -n;

        }
        for (int i = 0; i < n; i++) {
            result *= x;

        }

        return result;
    }


}
