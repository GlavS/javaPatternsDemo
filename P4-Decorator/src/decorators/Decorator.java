package decorators;

import objects.Component;

//можно и интерфейс. Наследуем от родительского интерфейса декорируемых объектов
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
