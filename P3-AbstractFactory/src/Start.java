import factory.impl.RussianFactory;
import factory.impl.USAFactory;
import factory.interfaces.TransportFactory;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class Start {
    static TransportFactory factory;

    public static void main(String[] args) {
        String flag = "USA";

        if(flag.equals("RU")){
            factory = new RussianFactory();
        } else {
            factory = new USAFactory();
        }

        Car car = factory.createCar();
        Aircraft aircraft = factory.createAircraft();
        car.drive();
        car.stop();
        aircraft.fly();
    }
}
