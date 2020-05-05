package lessons_homework.lesson_5.task_1;

public class Laptop implements Computer {

    private boolean isOn;

    @Override
    public boolean computerOn() {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
        return isOn;
    }

    @Override
    public void computerOff() {
        if (isOn) {
            System.out.println("Laptop is On");
        } else {
            System.out.println("Laptop is Off");
        }
    }

    @Override
    public void resetComputer() {
        System.out.println("Laptop reboots");
    }

// пустая строка не нужна
}
