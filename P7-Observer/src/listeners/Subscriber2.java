package listeners;

public class Subscriber2 implements ActionListener{
    @Override
    public void doAction(String message) { //подписчик может обрабатывать сообщение по-своему
        if (message.equals("Hello")){
            System.out.printf("%s says \"Hello\" too!", this.getClass().getSimpleName());
        } else {
            System.out.printf("%s ignores %s", this.getClass().getSimpleName(), message);
        }

    }
}
