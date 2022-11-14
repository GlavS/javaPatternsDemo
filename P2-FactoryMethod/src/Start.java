public class Start {
    public static void main(String[] args) {

        CarSelector factory = new CarSelector();

        Car fastCar = factory.getCar(RoadType.HIGHWAY);
        Car offroadCar = factory.getCar(RoadType.OFFROAD);
        Car newOffroad = factory.getCar(RoadType.GRASS);

        fastCar.drive();
        fastCar.stop();

        newOffroad.drive();
        newOffroad.stop();

    }
}
