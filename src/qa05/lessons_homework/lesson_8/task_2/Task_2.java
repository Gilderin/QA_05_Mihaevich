package lessons_homework.lesson_8.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements = addList(elements);
        System.out.println(elements);
        elements = removeElements(elements);
        System.out.println(elements);
    }

    public static ArrayList<Integer> addList(ArrayList<Integer> elements) {
        for (int i = 1; i <= 100; i++) {
            elements.add(0, i);
        }
        return elements;
    }

    public static ArrayList<Integer> removeElements(ArrayList<Integer> elements) {
        Iterator<Integer> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        return elements;
    }
}
