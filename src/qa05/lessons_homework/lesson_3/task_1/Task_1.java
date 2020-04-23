package lessons_homework.lesson_3.task_1;

import java.util.Scanner;

//по коду все хорошо, попробуй выносить в отдельные методы логические блоки кода,
// например, заполнение массива или еще что-нибудь. 
public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int maxValue = 0;
        int minValue = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input " + i + " element of array:");
            array[i] = scanner.nextInt();
        }
        minValue = array[0];
        maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (minValue > array[i]) {
                minValue = array[i];
            }
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println("Sum of array = " + sum);
        System.out.println("Max value of array = " + maxValue);
        System.out.println("Min value of array = " + minValue);
    }
}
