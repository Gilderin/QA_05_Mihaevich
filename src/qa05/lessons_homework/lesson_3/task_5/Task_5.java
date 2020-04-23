package lessons_homework.lesson_3.task_5;

import com.sun.jdi.Value;

import java.util.Arrays;

// +
public class Task_5 {
    public static void main(String[] args) {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Old array = " + Arrays.toString(array));
        invert(array);
        System.out.println("New array = " + Arrays.toString(array));
    }

    public static void invert(int[] array) {
        for (int i = 1; i <= array.length / 2; i++) {
            swap(array, i);
        }
    }

    public static void swap(int[] array, int index) {
        int tmp = array[index - 1];
        array[index - 1] = array[array.length - index];
        array[array.length - index] = tmp;
    }
}
