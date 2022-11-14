package transport.impl.aircraft;

import transport.interfaces.Aircraft;

public class TU154 implements Aircraft {
    @Override
    public void fly() {
        System.out.println("TU-154 flies");
    }
}
