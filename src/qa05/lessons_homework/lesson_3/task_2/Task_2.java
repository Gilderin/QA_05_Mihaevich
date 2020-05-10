package lessons_homework.lesson_3.task_2;

// старайся выносить части кода в отдельные методы
public class Task_2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("Elenemt " + i + " of array = " + array[i]);
        }
        double averageOfSum = 0;
        for (int i = 0; i < array.length; i++) {
            averageOfSum += array[i];
        }
        averageOfSum = averageOfSum / array.length; // а если деление будет с остатком? получишь некорректное среднее
        System.out.println("Average = " + averageOfSum);
    }
}
