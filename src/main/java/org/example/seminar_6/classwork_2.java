package org.example.seminar_6;
// Найти пересечение чисел
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class classwork_2 {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,5,6,7));
        Set<Integer> cross = new HashSet<>(s1);
        cross.retainAll(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(cross);
    }
}
