package patterns.behavioral.observer.A1;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    // Observer 저장
    private List<Observer> observers = new ArrayList<>();

    // Observer 추가
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Observer 제거
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // Observer 에 통지
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    // 수를 취득
    public abstract int getNumber();

    // 수를 생성
    public abstract void execute();
}
