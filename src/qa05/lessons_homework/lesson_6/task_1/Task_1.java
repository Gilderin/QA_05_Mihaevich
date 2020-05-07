package lessons_homework.lesson_6.task_1;

import java.util.Arrays;

// форматируй код
public class Task_1 {
    public static void main(String[] args) {
        int[] array={1,2,3,5};
        getArray(array,0);
    }

    public static void getArray(int[] array,int i){
        if(i<array.length){
            getArray(array,i+1);
            System.out.println(array[i]);
        }
    }
}
