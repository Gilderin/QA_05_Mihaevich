package lessons_homework.lesson_7.task_9;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        // создание массива в отдельный метод
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива:");
            array[i] = scan.next();
        }
        int minSizeToPtrint = 5; 
        int countPrintElements = 0;
        // эту логику тоже в отдельный метод
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > minSizeToPtrint) {
                if (countPrintElements == 0) {
                    System.out.println("Список элементов массива строк подходящих по условию задачи:");
                }
                System.out.println((countPrintElements + 1) + ") " + array[i].toString());
                countPrintElements++;
            }
        }
        if (countPrintElements == 0) {
            System.out.println("В массиве не содержалость строк с удовлетворяющими параметрами"); // есть опечатка
        }
    }
}
