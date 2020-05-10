package lessons_homework.lesson_6.task_2;

// форматируй код
public class Transmission {

    private int transmission;
    private int maxShift = 7;

    public Transmission() {
    }

    public void transmissionUp() {
        if (transmission < maxShift) {
            transmission++;
        }
    }

    public void transmissionDown() {
        if (transmission > maxShift) {
            transmission--;
        }
    }

    public int getTransmission() {
        return transmission;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }
}
