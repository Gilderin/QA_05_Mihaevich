package lessons_homework.lesson_7.task_6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// форматируй код
public class Task_6 {
    public static void main(String[] args) {
        // было бы здорово создание массива вынести в отдельный метод
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + i + " элемент массива:");
            array[i] = scan.next();
        }
        int j = 0;
        int sizeNewarray = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkWithRegExp(array[i])) {
                sizeNewarray++;
            }
        }
        // думаю тоже в отдельный метод стоит вынести
        String[] newArray = new String[sizeNewarray];
        for (int i = 0; i < array.length; i++) {
            if (checkWithRegExp(array[i])) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static boolean checkWithRegExp(String arrayElement) {
        Pattern p = Pattern.compile("^[w].*", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(arrayElement);
        return m.matches();
    }
}
