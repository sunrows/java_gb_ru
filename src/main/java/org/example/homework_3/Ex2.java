package org.example.homework_3;

import org.example.homework_3.model.Goods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {
        Goods good1 = new Goods("товар1", 10, 1, 10, "россия");
        Goods good2 = new Goods("товар2", 20, 2, 100, "США");
        Goods good3 = new Goods("товар3", 30, 3, 1000, "США");
        Goods good4 = new Goods("товар4", 40, 1, 20, "Аргентина");
        Goods good5 = new Goods("товар5", 20, 2, 200, "россия");
        Goods good6 = new Goods("товар6", 60, 3, 2000, "россия");

        List<Goods> listGoods = new ArrayList<>();
        listGoods.add(good1);
        listGoods.add(good2);
        listGoods.add(good3);
        listGoods.add(good4);
        listGoods.add(good5);
        listGoods.add(good6);

        Scanner sc = new Scanner(System.in);
        int searchSort = sc.nextInt();
        List<String> result = new ArrayList<>();
        int minPrice = -1;
        for(Goods good : listGoods){
            if (good.getSort() == searchSort){
                if(minPrice == -1) minPrice = good.getPrice();

                if(good.getPrice() < minPrice){
                    minPrice = good.getPrice();
                    result.clear();
                    result.add(good.getName());
                } else if (good.getPrice() == minPrice) {
                    result.add(good.getName());
                }
            }
        }
        System.out.println(result);
    }
}
