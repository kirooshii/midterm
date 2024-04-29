package midterm.makar_lavrov_1.task3;

import java.util.ArrayList;
import java.util.List;

public class FMS {

    private List<Car> pit = new ArrayList<>();

    public void addCar(Car car) {
        pit.add(car);
        System.out.println("New car appeared in the paddock!");
        System.out.println("Welcome, " + car.getDriver() + ", " + car.getTeam() + "!");
    }

    public boolean removeCar(Car car) {
        boolean removed = false;
        for (int i = 0; i < pit.size(); i++) {
            Car b = pit.get(i);
            if (b.getTeam().equals(car.getTeam()) && b.getDriver().equals(car.getDriver())) {
                pit.remove(i);
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println(car.getDriver() + ", " + car.getTeam() + " went on the track!");
        }

        return removed;
    }

    public void printPit() {
        if (pit.isEmpty()) {
            System.out.println("The paddock is empty");
        } else {
            for (Car b: pit) {
                System.out.println("These cars are in the pit:");
                System.out.println(b.getDriver() + ", " + b.getTeam());
            }
        }
    }
}