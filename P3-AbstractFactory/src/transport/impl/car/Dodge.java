package transport.impl.car;

import transport.interfaces.Car;

public class Dodge implements Car {
    @Override
    public void drive() {
        System.out.println("Dodge drives");
    }

    @Override
    public void stop() {
        System.out.println("Dodge stops");
    }
}
