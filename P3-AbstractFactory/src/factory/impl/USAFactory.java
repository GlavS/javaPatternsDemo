package factory.impl;

import factory.interfaces.TransportFactory;
import transport.interfaces.Aircraft;
import transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return null;
    }

    @Override
    public Aircraft createAircraft() {
        return null;
    }
}
