package lessons_homework.lesson_8.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        List<String> inviteList=new ArrayList<>();
        inviteList.add("Nikolay");
        inviteList.add("Alex");
        inviteList.add("Lida");
        Scanner scaner=new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name=scaner.next();
        if(inviteList.contains(name)){
            System.out.println("Вы приглашены на вечеринку. Проходите");
        }else{
            System.out.println("Имени нет в списке. Катись колобком");
        }
    }
}
