package lessons_homework.lesson_8.task_8;

import java.util.HashSet;
import java.util.Set;

/ форматируй код
public class Task_8 {
    public static void main(String[] args) {
        Shop sexShop=new Shop("AlexBachurinShop",1);
        Shop iventShop=new Shop();
        Shop productShop=new Shop();
        Shop productShopOne=new Shop();
        Set<Shop> shops = new HashSet<>();
        shops.add(sexShop);
        shops.add(iventShop);
        shops.add(productShop);
        shops.add(productShopOne);
        System.out.println(shops);
    }
}
