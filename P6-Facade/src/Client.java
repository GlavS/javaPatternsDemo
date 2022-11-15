import facade.CarFacade;
import parts.Doors;
import parts.Ignition;
import parts.Wheels;

public class Client {
    public static void main(String[] args) {
        // Без фасада:
//        Doors doors = new Doors();
//        Ignition ignition = new Ignition();
//        Wheels wheels = new Wheels();
//
//        doors.close();
//        ignition.start();
//        wheels.run();
//        System.out.println("=================================");
//        wheels.stop();
//        ignition.stop();
//        doors.open();
        // С фасадом:
        CarFacade carFacade = new CarFacade();
        carFacade.go();
        carFacade.stop();
    }
}
