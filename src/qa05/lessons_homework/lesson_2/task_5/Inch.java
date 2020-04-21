package lessons_homework.lesson_2.task_5;

public class Inch {
    public static void main(String[] args) {
        double centimeters = 2.54;
        // магическое число 20 лучше в отдельную переменную
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " inches contains " + centimeters * i + " cm");
        }
    }
}
