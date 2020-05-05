package lessons_homework.lesson_5.task_2;

import java.util.Arrays;

public class MainWarehouse {
    public static void main(String[] args) {
        Integer[] arrayOne = {1, 2, 1}; // так себе название переменной
        Warehouse warehouse = new Warehouse(arrayOne);
        arrayOne[0] = 666;
        System.out.println(warehouse);
        warehouse.next();
        Integer[] newArray = warehouse.getArray();
        /* а теперь след строкой
        newArray[0] = 333;
        проверяй
        */
        System.out.println(Arrays.toString(newArray));
    }
}
