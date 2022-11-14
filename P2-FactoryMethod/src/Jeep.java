public class Jeep implements Car{
    @Override
    public void drive() {
        System.out.println("Jeep drives 70 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Jeep stops for 7s");
    }
}
