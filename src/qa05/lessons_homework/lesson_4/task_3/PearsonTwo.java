package lessons_homework.lesson_4.task_3;

import lessons_homework.lesson_4.task_1.*;

// Pearson_2 плохое название класса
public class PearsonTwo {
    private static Integer countEquals = 1;

    public static void main(String[] args) {
        Person[] arrayPerson = new Person[3];
        arrayPerson[0] = new Person("hhh", 25);
        arrayPerson[1] = new Person("hhh", 25);
        arrayPerson[2] = new Person("ANDY", 27);
        // логику по поиску в отдельный метод
        Equals(arrayPerson);
        System.out.println("Количество одинаковых объектов = " + countEquals);
    }

    public static void Equals(Person[] arrayPerson) {
        for (int i = 0; i < arrayPerson.length; i++) {
            for (int j = i + 1; j < arrayPerson.length; j++) {
                System.out.println(arrayPerson[i].show() + "; " + arrayPerson[j].show() + "; Equals: " + arrayPerson[i].equals(arrayPerson[j]));
                boolean equals = arrayPerson[i].equals(arrayPerson[j]);
                if (equals) {
                    countEquals++;
                }
            }
        }
    }
}
