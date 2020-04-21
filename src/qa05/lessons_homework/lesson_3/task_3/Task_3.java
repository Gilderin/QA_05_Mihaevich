package lessons_homework.lesson_3.task_3;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("Elenemt " + i + " of array = " + array[i]);
        }
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2!=0){
                array[i]=0;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Elenemt " + i + " of  new array = " + array[i]);
        }
    }
}
