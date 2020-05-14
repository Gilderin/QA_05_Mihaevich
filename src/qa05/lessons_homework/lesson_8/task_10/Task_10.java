package lessons_homework.lesson_8.task_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_10 {
    public static void main(String[] args) {
        Fruits banana=new Fruits();
        Fruits apple=new Fruits("apple",1.2);
        Fruits pineapple=new Fruits("pineapple",24.0);
        Fruits kiwi=new Fruits("kiwi",30.0);
        Fruits orange=new Fruits("orange",23.0);
        List<Fruits> sclad=new ArrayList<>();
        sclad.add(banana);
        sclad.add(kiwi);
        sclad.add(apple);
        sclad.add(banana);
        sclad.add(pineapple);
        sclad.add(apple);
        sclad.add(orange);
        System.out.println(sclad);
        Map sss=new HashMap();
        sss.put(1,sclad);
        System.out.println(sss);
    }
}
