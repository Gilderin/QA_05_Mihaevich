package lessons_homework.lesson_8.task_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task_6 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int countElements = 100_000;
        for (int i = 0; i < countElements; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long testArrayTime = testListRemoveElements(arrayList);
        long testLinkedTime = testListRemoveElements(linkedList);
        System.out.println("Test time remove Array List element: " + testArrayTime);
        System.out.println("Test time remove Linked List element: " + testLinkedTime);

    }

    public static Long testListRemoveElements(List list) {
        long start = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            iterator.remove();
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
