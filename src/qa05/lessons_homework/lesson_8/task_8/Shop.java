package lessons_homework.lesson_8.task_8;

import java.util.Objects;

public class Shop {
    private String name;
    private Integer id;

    public Shop() {
        this("100 melochey", 1);
    }

    public Shop(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }
}
