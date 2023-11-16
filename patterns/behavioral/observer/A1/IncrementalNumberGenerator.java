package patterns.behavioral.observer.A1;

public class IncrementalNumberGenerator extends NumberGenerator {

    private int inclusiveStartNumber; // 시작하는 수
    private int exclusiveEndNumber; // 종료하는 수
    private int step; // 증가값
    private int number; // 현재 수

    public IncrementalNumberGenerator(int inclusiveStartNumber, int exclusiveEndNumber, int step) {
        this.inclusiveStartNumber = inclusiveStartNumber;
        this.exclusiveEndNumber = exclusiveEndNumber;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = inclusiveStartNumber; i < exclusiveEndNumber; i += step) {
            number = i;
            notifyObservers();
        }
    }
}
