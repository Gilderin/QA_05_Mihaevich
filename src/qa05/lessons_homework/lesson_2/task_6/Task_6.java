package lessons_homework.lesson_2.task_6;

public class Task_6 {
    public static void main(String[] args) {
        int numbers = 2;
        do {
            if (numbers % 2 == 0) {
                System.out.println("Even number: " + numbers);
            }
            numbers++;
            //  технически верно, но можно просто сделать numbers+2, перед этим проверив что число четное
            // так будет гораздо меньше итераций
        } while (numbers <= 100);
    }
}

