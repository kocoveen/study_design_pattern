package patterns.behavioral.memento.sample;

import patterns.behavioral.memento.sample.game.Gamer;
import patterns.behavioral.memento.sample.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100); // 최초 소지금 100
        Memento memento = gamer.createMemento(); // 최초 상태 저장

        // 게임 시작
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("상태:" + gamer);

            // 게임 진행
            gamer.bet();

            System.out.println("소지금은 " + gamer.getMoney() + "원이 되었습니다.");

            // Memento 취급 방법 결정
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("※많이 늘었으니 현재 상태를 저장하자!");
                memento = gamer.createMemento();

            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("※많이 줄었으니 이전 상태를 복원하자!");
                gamer.restoreMemento(memento);
            }

            // 잠시 대기
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
