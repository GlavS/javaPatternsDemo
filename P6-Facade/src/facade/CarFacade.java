package facade;

import parts.Doors;
import parts.Ignition;
import parts.Wheels;

public class CarFacade {

    Doors doors = new Doors();
    Ignition ignition = new Ignition();
    Wheels wheels = new Wheels();

    public void go(){
        doors.close();
        ignition.start();
        wheels.run();
        System.out.println("========================");
    }
    public void stop(){
        System.out.println("========================");
        wheels.stop();
        ignition.stop();
        doors.open();
    }

}
