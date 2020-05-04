package lessons_homework.lesson_5.task_3;

public class TownHouse implements ParametersOfHouses {
    private Integer countFloors;
    private Integer countPeople;
    private Boolean isOn;

    public TownHouse() {
        this.countFloors = 5;
        this.countPeople = 15;
        this.isOn = true;
    }

    public TownHouse(int countFloors, int countPeople, boolean isOn) {
        this.countFloors = 5;
        this.countPeople = 15;
        this.isOn = true;
    }

    @Override
    public void countOfFloors() {
        System.out.println("Count of floors = " + countFloors);
    }

    @Override
    public boolean turnOnHeating() {
        if (isOn) {
            System.out.println("");
        } else {
            System.out.println("");
        }
        return isOn;
    }

    @Override
    public void countOfResident() {
        System.out.println("Count of resident = " + countPeople);
    }

    @Override
    public String toString() {
        return "\n\nType of House=Vacation;\n" + "Count of floors = " + countFloors + "\n" + "Count of residents = " + countPeople + "\n" + "Turn on heating: " + isOn;
    }
}
