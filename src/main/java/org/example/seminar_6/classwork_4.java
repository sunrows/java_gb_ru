package org.example.seminar_6;

import org.example.seminar_6.model_cw_4.Fahrenheit;
import org.example.seminar_6.model_cw_4.Kelvin;

//4)Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты.
// У классов наследников необходимо переопределить метод
// интерфейса, для валидного перевода величин.
// Метод для конвертации назовите "convertValue".
public class classwork_4 {

    public static void main(String[] args) {
    Double t_Celsius = 10.0;
    Double t_Fahrenheit = new Fahrenheit().convert(t_Celsius);
        System.out.println(t_Fahrenheit);
        Double t_Kelvin = new Kelvin().convert(-273.0);
        System.out.println(t_Kelvin);

    }
}
