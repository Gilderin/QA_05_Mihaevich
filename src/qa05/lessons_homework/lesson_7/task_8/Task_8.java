package lessons_homework.lesson_7.task_8;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество машин на складе: ");
        int size = scan.nextInt();
        String[] array = new String[size];
        int a = 1;
        int b = 4;
        for (int i = 0; i < array.length; i++) {
            int random = a + (int) (Math.random() * b);
            if (random == 1) {
                array[i] = "1.4";
            }
            if (random == 2) {
                array[i] = "2.0T";
            }
            if (random == 3) {
                array[i] = "1.8";
            }
            if (random == 4) {
                array[i] = "1.8T";
            }
        }
        System.out.println("Входной массив данных о маторах: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == "1.4") {
                array[i] = "2.0T";
            }
            if (array[i] == "1.8") {
                array[i] = "1.8T";
            }
        }
        System.out.println("Исправленный массив данных о маторах: " + Arrays.toString(array));
    }
}
