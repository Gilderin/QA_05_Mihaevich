package lessons_homework.lesson_6.task_2;

public class Car {
    private Engine engine;
    private Transmission transmission;
    private int minShift = 0;
    private int maxShift = 7;

    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public void onEngine() {
        if (engine.isOn()) {
            System.out.println("Engine is alredy ON");
        } else {
            engine.turnOnEngine();
        }
    }

    public void offEngine() {
        if (engine.isOn()) {
            engine.turnOffEngine();
        } else {
            System.out.println("Engine is alredy OFF");
        }
    }

    public void shifUp() {
        transmission.transmissionUp();
    }

    public void shifUpRepeatedly(int iterations) {
        for (int i = 0; i < iterations; i++) {
            if (transmission.getTransmission() < maxShift) {
                transmission.transmissionUp();
            } else {
                break;
            }
        }
    }

    public void shiftDown() {
        transmission.transmissionDown();
    }

    public void shiftDownRepeatedly(int iterations) {
        for (int i = 0; i < iterations; i++) {
            if (transmission.getTransmission() > minShift) {
                transmission.transmissionDown();
            } else {
                break;
            }
        }
    }

    public boolean engineStatus() {
        return engine.isOn();
    }

    public void move() {
        if (engine.isOn() && transmission.getTransmission() > 0) {
            System.out.println("Speed=" + transmission.getTransmission() * 20 + " mi/h"); // 20 + "" зачем + ""?
        } else {
            System.out.println("Car is not move");
        }
    }

    public void stop() {
        transmission.setTransmission(0);
    }

    public void speed() {
        if (engine.isOn()) {
            System.out.println("Speed=" + transmission.getTransmission() * 20 + " mi/h"); // 20 + "" зачем + ""?
        } else {
            System.out.println("Engine is not ON");
        }
    }
}
