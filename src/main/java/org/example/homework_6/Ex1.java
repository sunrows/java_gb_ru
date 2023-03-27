package org.example.homework_6;

import org.example.homework_6.model.Notebook;
import org.example.homework_6.model.UserFilter;

import java.util.Set;

import static org.example.homework_6.model.DataBase.createBase;

/**
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
 * и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
 * фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Ex1 {
    public static void main(String[] args) {
        Set<Notebook> base = createBase(40);
        System.out.printf("Имеется %d ноутбуки!%n",base.size());
        UserFilter filter = new UserFilter(base);
        while (filter.isUserHere()) {
            filter.askFilter();
        }
    }


}
