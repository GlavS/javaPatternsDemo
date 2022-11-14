public class Porshe implements Car{
    @Override
    public void drive() {
        System.out.println("Porshe drives 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Jeep stops for 3.5s");
    }
}
