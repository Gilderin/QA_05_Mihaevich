package lessons_homework.lesson_2.task_2;

public class Amoeba {
    public static void main(String[] args) {
        int countAmoebas = 1;
        for (int i = 1; i < 25; i++) {
            if (i % 3 == 0) {
                countAmoebas = countAmoebas * 2;
                System.out.println("Count of amoeba after " + i + " hours = " + countAmoebas);
            }
        }
    }
}
