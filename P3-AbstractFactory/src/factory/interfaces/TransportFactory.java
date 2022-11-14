package factory.interfaces;

import transport.interfaces.Aircraft;
import transport.interfaces.Car;

//фабрика по производству транспортных средств
public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
