package lessons_homework.lesson_4.task_1;

import java.util.Objects;

// Pearson -> Person
public class Pearson {
    private String name;
    private Integer age;

    // static поля идут раньше обычных
    private static String text = "Hello from static";

    public Pearson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // констурктор без аргументов должен идти первым
    public Pearson() {
        this("Andrey", 24);
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
        if (this == o) return true; // не забывай использовать {} после if
        if (o == null || getClass() != o.getClass()) return false; // не забывай использовать {} после if
        Pearson pearson = (Pearson) o;
        return Objects.equals(name, pearson.name) &&
                Objects.equals(age, pearson.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
