package lessons_homework.lesson_5.task_3;

public class VacationHome implements ParametersOfHouses {
    private Integer countFloors;
    private Integer countPeople;
    private Boolean isOn;

    public VacationHome() {
        // this(1,2,false);
        this.countFloors = 1;
        this.countPeople = 2;
        this.isOn = false;
    }

    public VacationHome(int countFloors, int countPeople, boolean isOn) {
        this.countFloors = countFloors;
        this.countPeople = countPeople;
        this.isOn = isOn;
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
        System.out.println("Count of resident = " + countFloors);
    }

    @Override
    public String toString() {
        return "\n\nType of House=Vacation;\n" + "Count of floors = " + countFloors + "\n" + "Count of residents = " + countPeople + "\n" + "Turn on heating: " + isOn;
    }
}
