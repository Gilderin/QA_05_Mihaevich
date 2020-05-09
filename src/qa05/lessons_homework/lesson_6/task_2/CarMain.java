package lessons_homework.lesson_6.task_2;

// +
public class CarMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Transmission transmission = new Transmission();

        Car car = new Car(engine, transmission);
        car.onEngine();
        car.move();
        car.shifUp();
        car.shifUp();
        car.move();
        car.shifUp();
        car.shifUp();
        car.shifUp();
        car.shiftDown();
        car.speed();
        car.stop();
        car.speed();
        car.offEngine();
    }
}
