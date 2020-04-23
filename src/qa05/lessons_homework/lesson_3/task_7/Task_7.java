package lessons_homework.lesson_3.task_7;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int arraySize = scanner.nextInt();
        int[] arrayAscending = new int[arraySize];
        int[] arrayDescending = new int[arraySize];
        for (int i = 0; i < arrayAscending.length; i++) {
            arrayAscending[i] = (int) (Math.random() * 100);
            arrayDescending[i] = arrayAscending[i];
        }
        System.out.println("Default array: "+Arrays.toString(arrayAscending));
        sort(arrayAscending, arrayDescending);
        System.out.println("Ascending sort: "+Arrays.toString(arrayAscending));
        System.out.println("Descending sort: "+Arrays.toString(arrayDescending));
    }

    // не стоит передавать два массива для сортировки. просто дважды вызови метод, возможно понадобится аргумент
    // который бы указывал ascending / descending
    public static void sort(int[] arrayA, int[] arrayD) {
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 1; i < arrayA.length; i++) {
                if (arrayA[i] < arrayA[i - 1]) {
                    sort(arrayA, i - 1, i);
                    needSort = true;
                }
                if (arrayD[i] > arrayD[i - 1]) {
                    sort(arrayD, i - 1, i);
                    needSort = true;
                }
            }
        }
    }

    // sort -> swap
    public static void sort(int[] array, int left, int right) {
        int tmpAscending = array[left];
        array[left] = array[right];
        array[right] = tmpAscending;
    }
}
