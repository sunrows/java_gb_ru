package org.example.seminar_6.model_cw_4;

public class Fahrenheit implements Converter{
    @Override
    public Double convert(double inputvalue) {
        return inputvalue * 9/5 + 32;
    }
}
