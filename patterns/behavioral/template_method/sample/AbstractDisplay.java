package patterns.behavioral.template_method.sample;

public abstract class AbstractDisplay {
    // open, print, close 하위 클래스에서 구현
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display 구현 (final -> 상속 X)
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
