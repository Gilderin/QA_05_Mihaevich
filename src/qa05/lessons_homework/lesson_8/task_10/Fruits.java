package lessons_homework.lesson_8.task_10;

import java.math.BigDecimal;

public class Fruits {
    private String name;
    private BigDecimal weight;

    public Fruits(String name, BigDecimal weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
