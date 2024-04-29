package midterm.makar_lavrov_1.task3;

public class FMSTester {
    public static void main(String[] args) {

        Car p1 = new Car();
        p1.setTeam("Red Bull F1");
        p1.setDriver("Max Verstappen");

        Car p2 = new Car();
        p2.setTeam("Mclaren F1");
        p2.setDriver("Lando Norris");

        FMS oms = new FMS();

        oms.addCar(p1);
        oms.addCar(p2);
        oms.removeCar(p1);
        oms.printPit();
    }
}