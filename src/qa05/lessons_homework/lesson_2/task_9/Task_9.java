package lessons_homework.lesson_2.task_9;

public class Task_9 {
    static String triangle = "";
    static int i, space = 4, star = 1;

    public static void main(String[] args) {
        int a = 0;
        System.out.println("          *     *              ");
        System.out.println("         **     **             ");
        System.out.println("        ***     ***            ");
        System.out.println("       ****     ****           ");
        System.out.println("                               ");
        System.out.println("       ****     ****           ");
        System.out.println("        ***     ***            ");
        System.out.println("         **     **             ");
        System.out.println("          *     *              ");
        //OR
        System.out.println("   ");
        for (i = 0; i <= 8; i++) {
            leftTriangles();
            triangle += "    ";
            rightTriangles();
            System.out.println(triangle);
            triangle = "";
        }
    }

    //  ну нееет, цикл же есть, он здесь как раз и нужен
    // Что будет если я захочу изменить размер треугольника? Заново переписывать так себе идея
    public static void rightTriangles() {
        if (i == 0 || i == 8) {
            space = 4;
            star = 1;
        } else if (i == 1 || i == 7) {
            space = 3;
            star = 2;
        } else if (i == 2 || i == 6) {
            space = 2;
            star = 3;
        } else if (i == 3 || i == 5) {
            space = 1;
            star = 4;
        } else if (i == 4) {
            space = -1;
            star = -1;
            triangle = "";
        }
        while (star > 0) {
            triangle += (char) 42;
            star--;
        }
        while (space > 0) {
            triangle += (char) 32;
            space--;
        }
    }

    public static void leftTriangles() {
        if (i == 0 || i == 8) {
            space = 4;
            star = 1;
        } else if (i == 1 || i == 7) {
            space = 3;
            star = 2;
        } else if (i == 2 || i == 6) {
            space = 2;
            star = 3;
        } else if (i == 3 || i == 5) {
            space = 1;
            star = 4;
        } else if (i == 4) {
            space = -1;
            star = -1;
            triangle = "";
        }
        while (space > 0) {
            triangle += (char) 32;
            space--;
        }
        while (star > 0) {
            triangle += (char) 42;
            star--;
        }
    }
}
