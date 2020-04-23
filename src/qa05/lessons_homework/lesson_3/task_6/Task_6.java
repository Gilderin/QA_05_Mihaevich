package lessons_homework.lesson_3.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sizeOfNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] % 2 == 0) {
                sizeOfNewArray++;
            }
        }
        // newArray -> evenArray
        int[] newArray = new int[sizeOfNewArray];
        //
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                for (int j = 0; j < newArray.length; j++) {
                    // вместо такой проверки, которая потенциально опасно введи курсор для второго массива, 
                    // который будешь увеличивать если вставляешь элемент
                    // вложенный цикл тогда скорее всего не понадобится
                    if (newArray[j] == 0) { 
                        newArray[j] = array[i];
                        break; // 
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }
}
