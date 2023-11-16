package patterns.behavioral.memento.A4.game;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
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

    // 파일에 저장
    public static boolean saveToFile(String filename, Memento memento) {
        StringBuilder sb = new StringBuilder();

        // 소지금
        sb.append(String.format("%d", memento.money)).append("/n");

        // 과일
        for (String fruit : memento.getFruits()) {
            sb.append(fruit).append("\n");
        }

        // 쓰기
        try {
            Files.writeString(Path.of(filename), sb,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    // 파일로부터 생성
    public static Memento loadFromFile(String filename) {
        try {
            List<String> lines = Files.readAllLines(Path.of(filename));
            if (lines.isEmpty()) { // lines.size() == 0
                System.out.println("Empty File");
                return null;
            }

            // 소지금
            int money = 0;
            try {
                money = Integer.parseInt(lines.get(0));
            } catch (NumberFormatException e) {
                System.out.println("Format Error: " + e);
                return null;
            }

            // 생성
            Memento memento = new Memento(money);

            // 과일
            for (int i = 1; i < lines.size(); i++) {
                memento.addFruit(lines.get(i));
            }
            return memento;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
