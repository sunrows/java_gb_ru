package org.example.homework_3;

import org.example.homework_3.model.Goods;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 * название которых содержит «высший».
 */
public class Ex1 {
    public static void main(String[] args) {
        Goods good1 = new Goods("товар1", 10, 1, 10, "россия");
        Goods good2 = new Goods("товар1", 20, 2, 100, "США");
        Goods good3 = new Goods("товар1", 30, 3, 1000, "США");
        Goods good4 = new Goods("товар1", 40, 1, 20, "Аргентина");
        Goods good5 = new Goods("товар1", 50, 2, 200, "россия");
        Goods good6 = new Goods("товар1", 60, 3, 2000, "россия");

        List<Goods> listGoods = new ArrayList<>();
        listGoods.add(good1);
        listGoods.add(good2);
        listGoods.add(good3);
        listGoods.add(good4);
        listGoods.add(good5);
        listGoods.add(good6);

        int maxPrice = 0;
        for (Goods good : listGoods) {
            if (good.getName().contains("высший")
                    & (good.getSort() == 1 | good.getSort() == 2)
                    & good.getPrice() > maxPrice) {
                maxPrice = good.getPrice();
            }
        }
        System.out.println("maxPrice: " + maxPrice);
    }
}
