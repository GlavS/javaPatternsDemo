import decorators.BorderDecorator;
import decorators.ColorDecorator;
import objects.Component;
import objects.Window;

public class Start {
    public static void main(String[] args) {
        // Декораторы можно вкладывать друг в друга
        Component borderedWindow = new ColorDecorator(new BorderDecorator(new Window()));
        borderedWindow.draw();

    }
}
