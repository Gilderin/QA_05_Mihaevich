package lessons_homework.lesson_8.task_10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_10 {
    public static void main(String[] args) {
        Fruits banana = new Fruits("banana", BigDecimal.valueOf(1.2));
        Fruits apple = new Fruits("apple", BigDecimal.valueOf(24));
        Fruits pineapple = new Fruits("pineapple", BigDecimal.valueOf(54));
        Fruits kiwi = new Fruits("kiwi", BigDecimal.valueOf(9.2));
        Fruits orange = new Fruits("orange", BigDecimal.valueOf(1.8));
        List<Fruits> warehouse = new ArrayList<>();

        warehouse.add(banana);
        warehouse.add(kiwi);
        warehouse.add(kiwi);
        warehouse.add(apple);
        warehouse.add(banana);
        warehouse.add(pineapple);
        warehouse.add(apple);
        warehouse.add(orange);
        warehouse.add(kiwi);
        System.out.println(warehouse);

        Map<String, BigDecimal> accountingJournal = fruitsWeight(warehouse);
        System.out.println(accountingJournal);
    }

    public static Map<String, BigDecimal> fruitsWeight(List<Fruits> warehouse) {
        Map<String, BigDecimal> accountingJournal = new HashMap<>();
        for (int i = 0; i < warehouse.size(); i++) {
            Fruits fruit = warehouse.get(i);
            BigDecimal weight = accountingJournal.get(fruit.getName());
            / этот иф в отдельный метод
            if (weight == null) {
                accountingJournal.put(fruit.getName(), fruit.getWeight());
            } else {
                accountingJournal.put(
                        fruit.getName(), weight.add(fruit.getWeight())
                );
            }
        }
        return accountingJournal;
    }
}
