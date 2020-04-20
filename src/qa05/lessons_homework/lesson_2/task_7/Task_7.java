package lessons_homework.lesson_2.task_7;

public class Task_7 {
    public static void main(String[] args) {
        int sumNumbers = 0;
        for (int i = 0; i < 99; i++) {
            if (i % 2 != 0) {
                sumNumbers += i;
            }
        }
        System.out.println("Sum of number = " + sumNumbers);
    }
}
