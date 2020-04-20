package lessons_homework.lesson_2.task_4;

public class Task_4 {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]), b = Integer.valueOf(args[1]), multiplicationResult = 0;
        do {
            multiplicationResult += a;
            b--;
        } while (b > 0);
        System.out.println("Multiplication result = " + multiplicationResult);
    }
}
