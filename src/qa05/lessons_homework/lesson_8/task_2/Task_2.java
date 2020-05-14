package lessons_homework.lesson_8.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> elements=new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            elements.add(0,i);
        }
        System.out.println(elements);
        Iterator<Integer> iterator=elements.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(elements);
    }
}
