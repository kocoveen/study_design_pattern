package patterns.creational.singleton.A1;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getNextTicketNumber() { // synchronized: 멀티 쓰레드에도 숫자의 무결성 부여
        return ticket++;
    }
}
