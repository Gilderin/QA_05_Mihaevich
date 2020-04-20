package lessons_homework.lesson_2.task_3;

public class Maths {
    public static void main(String[] args) {
        int arithmeticsProgression = 1;
        int arithmeticsCounter = 1;
        for (int i = 1; i < 257; i++) {
            arithmeticsCounter = arithmeticsCounter * 2;
            arithmeticsProgression += arithmeticsCounter;
            i = arithmeticsCounter;
        }
        System.out.println(arithmeticsProgression);
    }
}
