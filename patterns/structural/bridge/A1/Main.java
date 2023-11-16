package patterns.structural.bridge.A1;

public class Main {
    public static void main(String[] args) {
        RandomDisplay d1 = new RandomDisplay(new StringDisplayImpl("Hello, World."));
        d1.randomDisplay(10);
    }
}
