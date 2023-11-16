package patterns.structural.bridge.A2;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new FileDisplayImpl("patterns/structural/bridge/A2/aluminium.txt"));
        d1.display();
    }
}
