package lessons_homework.lesson_8.task_5;

import java.util.*;

public class Task_5 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int count = 100_000;
        arrayList = addElements(count, arrayList);
        linkedList = addElements(count, linkedList);
        long testArrayTime = testListRemoveElements(count, arrayList);
        long testLinkedTime = testListRemoveElements(count, linkedList);
        System.out.println("Test time remove Array List element: " + testArrayTime);
        System.out.println("Test time remove Linked List element: " + testLinkedTime);
    }

    public static List<Integer> addElements(int count, List<Integer> list) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        return list;
    }

    public static Long testListRemoveElements(Integer count, List<Integer> list) {
        long start = System.currentTimeMillis();
        remove(list);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static void remove(List<Integer> list) {
        int size=list.size();
        for (int i = 0; i < size; i++) {
            int removeIndex = list.size() / 2;
            list.remove(removeIndex);
        }
    }
}
