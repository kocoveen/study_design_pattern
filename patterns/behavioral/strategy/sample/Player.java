package patterns.behavioral.strategy.sample;

public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    // 플레이어 이름과 전략을 받아 플레이어 생성
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    // 전략에 따라 다음 낼 거 결정
    public Hand nextHand() {
        return strategy.nextHand();
    }

    // 승리
    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    // 패배
    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    // 무승부
    public void draw() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "["
                + name + ": "
                + gameCount + " games, "
                + winCount + " win, "
                + loseCount + " lose"
                + "]";
    }
}
