package patterns.behavioral.chain_of_responsibility.A3;

public class Trouble {
    private int number; // 트러블 번호

    // 트러블 생성
    public Trouble(int number) {
        this.number = number;
    }

    // 트러블 번호 얻기
    public int getNumber() {
        return number;
    }

    // 트러블의 문자열 표현
    @Override
    public String toString() {
        return "[Trouble " + number + ']';
    }
}
