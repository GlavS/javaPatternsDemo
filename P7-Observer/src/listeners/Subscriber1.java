package listeners;

public class Subscriber1 implements ActionListener{
    @Override
    public void doAction(String message) {
        System.out.printf("Subscriber %s got message \"%s\"%n", this.getClass().getSimpleName(), message);
    }
}
