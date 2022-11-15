import listeners.ActionListener;
import listeners.Subscriber1;
import listeners.Subscriber2;
import publisher.Publisher;

public class Start {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        ActionListener sub1 = new Subscriber1();
        ActionListener sub2 = new Subscriber2();

        publisher.addListener(sub1);
        publisher.addListener(sub2);
        //добавлять слушатель можно, передавая лямбду
        publisher.addListener(message -> {
            System.out.printf("Third got message %s", message);
        });

        publisher.createMessage("Goodbye");

    }
}
