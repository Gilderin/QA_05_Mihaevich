package lessons_homework.lesson_2.task_1;

public class Sportsman {
    public static void main(String[] args) {
        double firstDistans = 10;
        double allDistans = 0;
        for (int i = 0; i < 7; i++) {
            if (i != 0) {
                allDistans += firstDistans + ((allDistans / 100) * 10);
            } else {
                allDistans += firstDistans;
            }
        }
        System.out.println("The all distance after 7 days = " + allDistans + " km");
    }
}
