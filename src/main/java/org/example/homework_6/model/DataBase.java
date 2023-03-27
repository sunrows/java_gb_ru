package org.example.homework_6.model;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class DataBase {
    public static Set<Notebook> createBase(Integer number) {
        Set<Notebook> result = new LinkedHashSet<>();
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            int ramSize = (int) Math.pow(2, (1 + rand.nextInt(6)));
            int diskSize = 1 + rand.nextInt(4);
            String os = (rand.nextInt(2) == 0 ? "windows" : "linux");
            String color = getRandomColor();
            Notebook note = new Notebook("model_" + i, ramSize, diskSize, os, color);
            result.add(note);
        }
        return result;
    }

    private static String getRandomColor() {
        int i = new Random().nextInt(6);
        switch (i) {
            case 1 -> {
                return "red";
            }
            case 2 -> {
                return "blue";
            }
            case 3 -> {
                return "yellow";
            }
            case 4 -> {
                return "gold";
            }
            case 5 -> {
                return "purple";
            }
            default -> {
                return "black";
            }
        }
    }

    public static void printBase(Set<Notebook> base) {
        for (Notebook item : base) {
            System.out.println(item);
        }
    }
}
