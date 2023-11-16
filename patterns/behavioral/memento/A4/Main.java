package patterns.behavioral.memento.A4;

import patterns.behavioral.memento.A4.game.Gamer;
import patterns.behavioral.memento.A4.game.Memento;

public class Main {
    public static final String SAVE_FILE_NAME = "game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100); // 최초 소지금 100

        // 파일에서 읽어옴
        Memento memento = Memento.loadFromFile(SAVE_FILE_NAME);
        if (memento == null) {
            System.out.println("새로 시작합니다.");
            memento = gamer.createMemento(); // 최초 상태 저장
        } else {
            System.out.println("이전에 지정한 결과부터 시작합니다.");
            gamer.restoreMemento(memento);
        }

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

                // 파일로 기록
                if (Memento.saveToFile(SAVE_FILE_NAME, memento)) {
                    System.out.println("현재 상태를 파일로 저장했습니다.");
                }

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
