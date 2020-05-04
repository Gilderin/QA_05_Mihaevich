package lessons_homework.lesson_5.task_3;

import java.util.Arrays;

public class CatalogOfHouse {
    public static void main(String[] args) {
        ParametersOfHouses[] catalog = {
                new TownHouse(),
                new TownHouse(5, 100, true),
                new VacationHome(),
                new VacationHome(1, 6, false),
                new TownHouse(7, 95, true),
                new TownHouse(9, 129, true),
                new VacationHome(2, 3, true),
                new VacationHome(3, 10, true)
        };
        System.out.println(Arrays.toString(catalog));
    }
}
