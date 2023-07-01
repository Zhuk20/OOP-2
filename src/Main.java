import OOP2.*;

public class Main {
    public static void main(String[] args) {
        Service bicycle = new Bicycle("Урал", 2);
        Service bicycle2 = new Bicycle("Украина", 2);
        Service car = new Car("УАЗ", 4);
        Service car2 = new Car("ВАЗ", 4);
        Service truck = new Truck("Газель", 6);
        Service truck2 = new Truck("Соболь", 8);

        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        station.check(bicycle2);
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
    }
}