public class Start {
    public static void main(String[] args) {

        CarSelector factory = CarSelector.getInstance();

        Car car = factory.getCar(RoadType.HIGHWAY);
        car.drive();
        car.stop();
        car = factory.getCar(RoadType.OFFROAD);
        car.drive();
        car.stop();
        car = factory.getCar(RoadType.HIGHWAY);
        car.drive();
        car.stop();



    }
}
