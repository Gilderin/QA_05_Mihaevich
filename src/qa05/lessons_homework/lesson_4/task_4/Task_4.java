package lessons_homework.lesson_4.task_4;

import lessons_homework.lesson_4.task_1.*;

public class Task_4 {
    public static void main(String[] args) {
        Person person = new Person();
        Person personOne = new Person();
        Person personTwo = new Person();
        Person personThree = new Person();
        System.out.println(person.showTextvalue());
        personOne.setText("Another value");
        System.out.println(personOne.showTextvalue());
        System.out.println(personTwo.showTextvalue());
        System.out.println(personThree.showTextvalue());
    }
}
