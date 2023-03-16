package org.example.seminar_2.cw4;

import org.example.seminar_2.cw4.model.Vector;

/*
Проектирование и создание класса, описывающего вектор
Задача: создаем класс, который описывает вектор (в трехмерном пространстве)





Создаем класс -> создаем переменные класса ->
создаем полный и пустой конструктор ->
гетеры и сеттеры-> переопределяем toString()

 */
public class classwork_4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0 , 1.0);
        Vector vector2 = new Vector(1.0, 2.0 , 1.0);
        System.out.println(vector1.toString());
        System.out.println(vector2.toString());
        System.out.println("Длина вектора = " + vector1.lengthvector());
        System.out.println(" Скалярное произведение = "+ vector1.scalarMulti(vector2));
        System.out.println(" Векторное произведение = " + vector1.vectorMulti(vector2));
        System.out.println(" Косинус угла = " + vector1.cosVector(vector2));
        //System.out.println(" Сумма и разность на homework2! ");  ДЗ!
        System.out.println(" Сумма векторов:" + vector1.sumVector(vector2));
        System.out.println(" Разность векторов: " + vector1.difVector(vector2));

    }
}
