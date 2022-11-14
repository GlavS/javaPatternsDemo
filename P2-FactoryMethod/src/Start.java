public class Start {
    public static void main(String[] args) {


        Car car = CarSelector.getInstance().getCar(RoadType.HIGHWAY);
        car.drive();
        car.stop();
        car = CarSelector.getInstance().getCar(RoadType.OFFROAD);
        car.drive();
        car.stop();
        car = CarSelector.getInstance().getCar(RoadType.HIGHWAY);
        car.drive();
        car.stop();



    }
}
