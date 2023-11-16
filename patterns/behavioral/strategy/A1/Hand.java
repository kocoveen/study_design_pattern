package patterns.behavioral.strategy.A1;

public enum Hand {
    // (바위, 가위, 보)를 나타내는 세 개의 enum 상수
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    // enum 필드
    private String name;
    private int handValue;

    // Hand 값으로 상수를 얻기 위한 배열
    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    // 생성자
    private Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    // Hand 값으로 enum 상수 가져옴
    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    // this vs. hand -> this win
    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    // this vs. hand -> hand win
    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    // 무승부: 0, this win: 1, hand win: -1
    public int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    // (바위, 가위, 보)의 문자열 표현
    @Override
    public String toString() {
        return name;
    }
}
