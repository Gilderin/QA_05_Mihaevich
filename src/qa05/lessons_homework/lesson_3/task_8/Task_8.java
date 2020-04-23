package lessons_homework.lesson_3.task_8;

import java.util.Arrays;
import java.util.Scanner;

// выглядит довольно сложно, но работает, подумай как можно упростить
// повыноси части кода в отдельные методы
public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wrongSize = true;
        int sizeButterfly = 0;
        while (wrongSize) {
            System.out.println("Please input size of butterfly(3-18):");
            sizeButterfly = scanner.nextInt();
            
           // 3, 18 - в переменные
            if (sizeButterfly < 3 | sizeButterfly > 18) {
                System.out.println("wrong size");
            } else {
                wrongSize = false;
            }
        }
        String[] leftWing = new String[sizeButterfly];
        String[] rightWing = new String[sizeButterfly];
        String butterfly = "";
        String spaces = "";
        if (sizeButterfly % 2 == 0) {
            sizeEven(leftWing, rightWing, butterfly, sizeButterfly, spaces);
        } else {
            sizeOdd(leftWing, rightWing, butterfly, sizeButterfly, spaces);
        }
        for (int i = 0; i < leftWing.length; i++) {
            System.out.println(leftWing[i] + rightWing[i]);
        }
    }

    public static void sizeEven(String[] leftWing, String[] rightWing, String butterfly, int sizeButterfly, String spaces) {
        for (int i = 1; i <= leftWing.length / 2; i++) {
            butterfly += String.valueOf(i);
            for (int j = 0; j <= leftWing.length / 2; j++) {
                if (leftWing[j] == null) {
                    leftWing[j] = butterfly;
                    break;
                }
            }
        }
        for (int i = leftWing.length / 2; i < leftWing.length; i++) {
            if (i == leftWing.length / 2) {
                leftWing[i] = butterfly;
            } else {
                butterfly = butterfly.substring(0, butterfly.length() - 1);
                leftWing[i] = butterfly;
            }
        }
        for (int i = 0; i < sizeButterfly - 2; i++) {
            spaces += " ";
        }
        butterfly = "";
        for (int i = 1; i <= rightWing.length / 2; i++) {
            butterfly += String.valueOf(i);
            for (int j = 0; j <= rightWing.length / 2; j++) {
                if (rightWing[j] == null) {
                    rightWing[j] = spaces + new StringBuffer(butterfly).reverse().toString();
                    if (rightWing.length / 2 != i)
                        spaces = spaces.substring(2);
                    break;
                }
            }
        }
        for (int i = rightWing.length / 2; i < rightWing.length; i++) {
            if (i == rightWing.length / 2) {
                rightWing[i] = new StringBuffer(butterfly).reverse().toString();
            } else {
                spaces += "  ";
                butterfly = butterfly.substring(0, butterfly.length() - 1);
                rightWing[i] = spaces + new StringBuffer(butterfly).reverse().toString();
            }
        }
    }

    public static void sizeOdd(String[] leftWing, String[] rightWing, String butterfly, int sizeButterfly, String spaces) {

        for (int i = 1; i <= leftWing.length / 2 + 1; i++) {
            butterfly += String.valueOf(i);
            for (int j = 0; j <= leftWing.length / 2 + 1; j++) {
                if (leftWing[j] == null) {
                    leftWing[j] = butterfly;
                    break;
                }
            }
        }
        for (int i = leftWing.length / 2 + 1; i < leftWing.length; i++) {
            butterfly = butterfly.substring(0, butterfly.length() - 1);
            leftWing[i] = butterfly;
        }
        for (int i = 0; i < sizeButterfly - 1; i++) {
            spaces += " ";
        }
        butterfly = "";
        for (int i = 1; i <= rightWing.length / 2 + 1; i++) {
            butterfly += String.valueOf(i);
            for (int j = 0; j <= rightWing.length / 2 + 1; j++) {
                if (rightWing[j] == null) {
                    rightWing[j] = spaces + new StringBuffer(butterfly).reverse().toString();
                    if (rightWing.length / 2 != j)
                        spaces = spaces.substring(2);
                    break;
                }
            }
        }
        for (int i = rightWing.length / 2 + 1; i < rightWing.length; i++) {
            spaces += "  ";
            butterfly = butterfly.substring(0, butterfly.length() - 1);
            rightWing[i] = spaces + new StringBuffer(butterfly).reverse().toString();
        }
    }
}
