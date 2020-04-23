package lessons_homework.lesson_3.task_4;

import java.util.Arrays;

// +
public class Task_4 {
    public static void main(String[] args) {
        int multiplicationTable[][] = new int[9][9];
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(Arrays.toString(multiplicationTable[i]));
        }
    }
}
