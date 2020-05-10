package lessons_homework.lesson_6.task_2;

// +
public class CarMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Transmission transmission = new Transmission();

        Car car = new Car(engine, transmission);
        car.onEngine();
        car.move();
        car.shifUp(); // а что если написать метод в этом классе, который бы принимал car и вызывал повысить передачу в цикле нужное кол-во раз
        car.shifUpRepeatedly(5);
        car.move();
        car.shiftDownRepeatedly(5);
        car.shifUp();
        car.shiftDown();
        car.speed();
        car.stop();
        car.speed();
        car.offEngine();
    }
}
