package org.example.seminar_6.model_cw_4;

public class Kelvin implements Converter{
    @Override
    public Double convert(double inputvalue) {
        return inputvalue + 273.15;
    }
}
