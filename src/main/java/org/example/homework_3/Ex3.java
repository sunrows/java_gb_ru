package org.example.homework_3;

import org.example.homework_3.model.Books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        Books book1 = new Books("книга Пушкина", "Пушкин",100,1900,1500);
        Books book2 = new Books("книга Лермонтова", "Лермонтов",100,1950,17);
        Books book3 = new Books("книга Ахматовой", "Ахматова",100,2010,17);
        Books book4 = new Books("книга Куприна", "Куприн",100,2010,37);
        Books book5 = new Books("книга Толстого", "Толстой",100,2015,47);
        Books book6 = new Books("книга Достоевского", "Достоевский",100,2020,46);

        List<Books> listBooks = new ArrayList<>();
        listBooks.add(book1);
        listBooks.add(book2);
        listBooks.add(book3);
        listBooks.add(book4);
        listBooks.add(book5);
        listBooks.add(book6);

        List<String> result = new ArrayList<>();
        for(Books book : listBooks){
            if(isSimple(book.getPageCount())
                    & (book.getAuthor().contains("А") | book.getAuthor().contains("а"))
                    & book.getYear() >= 2010
            ){
                result.add(book.getName());
            }
        }
        System.out.println(result);
    }

    public static boolean isSimple(int a) {
        Double sq = Math.sqrt(a);
        for (int i = 2; i <= sq.intValue(); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }


}
