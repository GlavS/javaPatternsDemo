import decorators.BorderDecorator;
import decorators.ColorDecorator;
import objects.Button;
import objects.Component;
import objects.TextView;
import objects.Window;

public class Start {
    private static Component window;
    private static Component textView;
    private static Component button;

    public static void main(String[] args) {
        // Декораторы можно вкладывать друг в друга

        Component borderedWindow = new ColorDecorator(new BorderDecorator(new Window()));
        borderedWindow.draw();
        // Декорирование по условию
        // Очень легко добавлять новые объекты (добавим компонент Button)
        boolean needBorder = true; // Флаг
        if (needBorder) {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        } else {
            window = new Window();
            textView = new TextView();
            button = new Button();
        }

        window.draw();
        textView.draw();
        button.draw();

    }
}
