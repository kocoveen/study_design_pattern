package patterns.structural.decorator.A2;

public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
