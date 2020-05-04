package lessons_homework.lesson_5.task_2;

import java.util.Arrays;

public class MainWarehouse {
    public static void main(String[] args) {
        Integer[] arrayOne = {1, 2, 1};
        Warehouse warehouse = new Warehouse(arrayOne);
        arrayOne[0] = 666;
        System.out.println(warehouse);
        warehouse.next();
        Integer[] newArray = warehouse.getArray();
        System.out.println(Arrays.toString(newArray));
    }
}
