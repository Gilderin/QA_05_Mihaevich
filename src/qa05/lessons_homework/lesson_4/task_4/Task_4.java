package lessons_homework.lesson_4.task_4;

import lessons_homework.lesson_4.task_1.*;

public class Task_4 {
    public static void main(String[] args) {
        Pearson pearson = new Pearson();
        Pearson pearson_1 = new Pearson();
        Pearson pearson_2 = new Pearson();
        Pearson pearson_3 = new Pearson();
        System.out.println(pearson.showTextvalue());
        pearson_1.setText("Another value");
        System.out.println(pearson_1.showTextvalue());
        System.out.println(pearson_2.showTextvalue());
        System.out.println(pearson_3.showTextvalue());
    }
}
