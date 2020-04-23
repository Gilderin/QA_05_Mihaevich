package lessons_homework.lesson_2.task_7;

public class Task_7 {
    public static void main(String[] args) {
        // тоже самое что и в Task_6, не оптимально
        int sumNumbers = 0;
        for (int i = 0; i < 99; i++) {
            if (i % 2 != 0) {
                sumNumbers += i;
            }
        }
        System.out.println("Sum of number = " + sumNumbers);
    }
}
