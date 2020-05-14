package lessons_homework.lesson_8.task_5;

import java.util.*;

public class Task_5 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int countElements = 100_000;
        for (int i = 0; i < countElements; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long testArrayTime = testListRemoveElements(countElements, arrayList);
        long testLinkedTime = testListRemoveElements(countElements, linkedList);
        System.out.println("Test time remove Array List element: " + testArrayTime);
        System.out.println("Test time remove Linked List element: " + testLinkedTime);
    }

    public static Long testListRemoveElements(Integer countElements, List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < countElements; i++) {
            int removeIndex = list.size() / 2;
            list.remove(removeIndex);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
