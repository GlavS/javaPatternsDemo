package publisher;

import listeners.ActionListener;

import java.util.List;

public interface PublisherInterface {
    List<ActionListener> getListeners(); // список слушателей и методы манипуляции с ними
    void addListener(ActionListener listener);
    void removeListener(ActionListener listener);
    void removeAllListeners();
    void notifySubscribers(String message); // метод уведомления
}
