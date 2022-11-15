package publisher;

import listeners.ActionListener;

import java.util.ArrayList;
import java.util.List;


public class Publisher implements PublisherInterface{
    private final List<ActionListener> listeners = new ArrayList<>(); // список слушателей и методы манипуляции с ними
    @Override
    public List<ActionListener> getListeners() {
        return listeners;
    }

    @Override
    public void addListener(ActionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(ActionListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListeners() {
        listeners.clear();
    }

    @Override
    public void notifySubscribers(String message) { // метод уведомления
        for (ActionListener listener :
                listeners) {
            listener.doAction(message);
        }
    }

    public void createMessage(String message){ // рассылка нового сообщения
        System.out.printf("Publisher made broadcast message: %s%n", message);
        notifySubscribers(message);
    }
}
