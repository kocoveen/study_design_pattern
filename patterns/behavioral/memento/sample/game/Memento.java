package patterns.behavioral.memento.sample.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money; // 현재 소지금
    private List<String> fruits; // 현재 과일

    // 소지금을 얻는다 (narrow interface)
    public int getMoney() {
        return money;
    }

    // 생성자 (wide interface)
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    // 과일 추가 (wide interface)
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    // 과일을 얻음 (wide interface)
    List<String> getFruits() {
        return new ArrayList<>(fruits);
    }
}
