package lessons_homework.lesson_8.task_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int count = 100_000;
        arrayList = addElements(count, arrayList);
        linkedList = addElements(count, linkedList);
        long testArrayTime = testListRemoveElements(arrayList);
        long testLinkedTime = testListRemoveElements(linkedList);
        System.out.println("Test time remove Array List element: " + testArrayTime);
        System.out.println("Test time remove Linked List element: " + testLinkedTime);

    }

    public static List<Integer> addElements(int count, List<Integer> list) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        return list;
    }

    public static Long testListRemoveElements(List<Integer> list) {
        long start = System.currentTimeMillis();
        remove(list);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static void remove(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
    }
}
