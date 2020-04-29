package lessons_homework.lesson_3.task_8;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8v2 {
    public static Integer sizeButterfly;
    public static Integer counter;

    public static void main(String[] args) {
        int minSize=3;
        int maxSize=18;
        boolean wrongSize = true;
        int[][] butterfly;
        inputSize(wrongSize,minSize,maxSize);
        if(sizeButterfly%2==0){
            butterfly=new int[sizeButterfly][sizeButterfly];
        }
        else{
            butterfly=new int[sizeButterfly][sizeButterfly+1];
        }
        counter=1;
        if(sizeButterfly%2==0){
            evenSize(butterfly);
        }
        else {
            oddSize(butterfly);
        }
        for (int i = 0; i <butterfly.length ; i++) {
            System.out.println(Arrays.toString(butterfly[i]));
        }
    }
    public static void inputSize(boolean wrongSize, int minSize, int maxSize){
        Scanner scanner=new Scanner(System.in);
        while (wrongSize) {
            System.out.println("Please input size of butterfly(3-18):");
            sizeButterfly = scanner.nextInt();
            if (sizeButterfly < minSize | sizeButterfly > maxSize) {
                System.out.println("wrong size");
            } else {
                wrongSize = false;
            }
        }
    }

    public static void evenSize(int[][] butterfly){
        for (int i = 0; i <butterfly.length/2 ; i++) {
            topPart(butterfly,i);
        }
        for (int i = butterfly.length/2; i<butterfly.length ; i++) {
            bottomPart(butterfly,i);
        }
    }

    public static void oddSize(int[][] butterfly){
        for (int i = 0; i <=butterfly.length/2 ; i++) {
            topPart(butterfly,i);
        }
        for (int i = butterfly.length/2+1; i<butterfly.length ; i++) {
            bottomPart(butterfly,i);
        }
    }
    public static void topPart(int[][]butterfly,int i){
        for (int j = 0; j <=i ; j++) {
            if(sizeButterfly%2==0) {
                oddValue(butterfly, i, j);
            }else{
                evenValue(butterfly,i,j);
            }
        }
        counter=1;
    }
    public static void bottomPart(int[][]butterfly,int i){
        for (int j = 0; j <butterfly.length-i ; j++) {
            if(sizeButterfly%2==0) {
                oddValue(butterfly, i, j);
            }else{
                evenValue(butterfly,i,j);
            }
        }
        counter=1;
    }
    public static void evenValue(int[][] butterfly,int i,int j){
        butterfly[i][j]=counter;
        butterfly[i][butterfly.length-1-j]=counter;
        counter++;
    }

    public static void oddValue(int[][] butterfly,int i,int j){
        butterfly[i][j]=counter;
        butterfly[i][butterfly.length-j]=counter;
        counter++;
    }


}
