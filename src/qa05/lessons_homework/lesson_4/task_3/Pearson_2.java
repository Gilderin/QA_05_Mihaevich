package lessons_homework.lesson_4.task_3;

import lessons_homework.lesson_4.task_1.*;

public class Pearson_2 {
    public static void main(String[] args) {
        Pearson[] arrayPearson = new Pearson[3];
        arrayPearson[0] = new Pearson("hhh", 25);
        arrayPearson[1] = new Pearson("hhh", 25);
        arrayPearson[2] = new Pearson("ANDY", 27);
        for (int i = 0; i < arrayPearson.length; i++) {
            for (int j = i + 1; j < arrayPearson.length; j++) {
                System.out.println(arrayPearson[i].show() + "; " + arrayPearson[j].show() + "; Equals: " + arrayPearson[i].equals(arrayPearson[j]));
            }
        }

    }
}
