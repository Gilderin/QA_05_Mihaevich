package lessons_homework.lesson_8.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/ форматируй уод 
public class Task_4 {
    public static void main(String[] args) {
        List<String> collectionOne=new ArrayList<>();
        List<String> collectionTwo= Arrays.asList("One","Andrey","nik","click");
        collectionOne.add("Two");
        collectionOne.add("Andrey");
        collectionOne.add("clicks");
        collectionOne.add("One");
        collectionOne.add("Bla Bla Bla");
       
       System.out.println(collectionOne);
        
        collectionOne.retainAll(collectionTwo);
        
        System.out.println(collectionOne);
    }
}
