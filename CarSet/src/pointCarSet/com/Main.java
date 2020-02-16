package pointCarSet.com;

import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedCar lc = new LinkedCar();
        //List<Car> cars = new ArrayList<>();
        LinkedHashSet<Car> cars = new LinkedHashSet<>();

        cars.add(new Car("Volvo", "1988", 16, 18, "літня", "red", "sedan", true));
        cars.add(new Car("Opel", "1998", 24, 15,"літня", "red", "universal", false));
        cars.add(new Car("Audi", "2000", 17, 18, "літня", "red", "heshbek", true));
        cars.add(new Car("Subaru", "2000", 24, 20,"зимня", "red", "sedan", true));
        cars.add(new Car("Lada", "1988", 13, 18, "літня", "green", "sedan", true));
        cars.add(new Car("T4", "1988", 13, 24, "зимня", "green", "sedan", false));
        cars.add(new Car("Tavriya", "1991", "sedan"));
        cars.add(new Car("Reno", "2000", "red"));



        lc.colorEndDiametr(cars);
        lc.deletedCar(cars);
        lc.typeShyn(cars);

    }
}
