package org.example.seminar_5;

import java.util.HashMap;
import java.util.Map;

/**
Написать перевод римских цифр в арабские
 I             1
 V             5
 X             10
 L             50
 C             100
 D             500
 M             1000
 */
public class classwork_3 {
    public static void main(String[] args) {
        Map <Character, Integer> transMap= new HashMap<>();
        transMap.put('I',1);
        transMap.put('V',5);
        transMap.put('X',10);
        transMap.put('L',50);
        transMap.put('C',100);
        transMap.put('D',500);
        transMap.put('M',1000);

        String s1 = "LVIIV";
        int sum = transMap.get(s1.charAt(s1.length()-1));
        for (int i = 0; i < s1.length()-1; i++) {
            if(transMap.get(s1.charAt(i))<transMap.get(s1.charAt(i+1))){
                sum -= transMap.get(s1.charAt(i));
            }else{
                sum += transMap.get(s1.charAt(i));
            }


        }
        System.out.println("Сумма:"+sum);

    }
}



