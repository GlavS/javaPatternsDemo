package transport.impl.aircraft;

import transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void fly() {
        System.out.println("Boeing 747 flies");
    }
}
