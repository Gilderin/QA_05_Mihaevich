package lessons_homework.lesson_6.task_2;

// форматируй код
public class Engine {
    private boolean isOn;

    public Engine() {
        this.isOn=false; // поле типа boolean (примитив) по умолчанию будет false, твоя строка лишняя
    }

    public boolean turnOnEngine() {
        if (isOn) {
            return isOn;
        }else{
            isOn = true;
            return isOn;
        }
    }

    public boolean turnOffEngine() {
        if (isOn) {
            isOn = false;
            return isOn;
        }else{
            return isOn;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
