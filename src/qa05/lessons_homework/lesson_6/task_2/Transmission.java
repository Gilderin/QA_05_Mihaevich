package lessons_homework.lesson_6.task_2;

// форматируй код
public class Transmission {

    private int transmission;

    public Transmission(){
        this.transmission=0; // поле типа int (примитив) по умолчанию будет 0, твоя строка лишняя
    }

    public void transmissionUp(){
        if(transmission<7) { // 7 в константу
            transmission++;
        }
    }

    public void transmissionDown(){
        if(transmission>0) { // 0 в константу
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
