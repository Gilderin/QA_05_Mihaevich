package lessons_homework.lesson_4.task_1;

import java.util.Objects;

// Pearson -> Person
public class Person {
    // static поля идут раньше обычных
    private static String text = "Hello from static";
    private String name;
    private Integer age;



    // констурктор без аргументов должен идти первым
    public Person() {
        this("Andrey", 24);
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String show() {
        return "Name = '" + name + "' Age = '" + age + "'";
    }

    public String showTextvalue() {
        return "Text value = " + text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true; // не забывай использовать {} после if
        }
        if (o == null || getClass() != o.getClass()) {
            return false; // не забывай использовать {} после if
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
