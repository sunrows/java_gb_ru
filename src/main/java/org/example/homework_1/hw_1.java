/*
Reverse Words in a String
 */


package org.example.homework_1;
import java.util.regex.Pattern;
public class hw_1 {

    public static void main(String[] args)
    {
        String s1 = "Привет моя свобода и заключение в мир иной!";
        System.out.println(reverseWords(s1));

        String s2 = "Мавзунахон жена Пайрава";
        System.out.println(reverseWords(s2));
    }

    static String reverseWords(String str)
    {
        // сделаем поисковыми!
        Pattern pattern = Pattern.compile("\\s");

        // Вырезка слов из строки
        String[] temp = pattern.split(str);
        String result = "";

        // проходимся по словам
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
}