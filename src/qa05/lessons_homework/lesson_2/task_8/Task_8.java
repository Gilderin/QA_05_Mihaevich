package lessons_homework.lesson_2.task_8;

public class Task_8 {
    public static void main(String[] args) {
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int sumNumbers = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEvenNumbers += i;
            } else {
                sumOddNumbers += i;
            }
            sumNumbers += i;
        }
        System.out.println("Sum of even numbers = " + sumEvenNumbers);
        System.out.println("Sum of odd numbers = " + sumOddNumbers);
        System.out.println("Sum of numbers = " + sumNumbers);
    }
}
