package patterns.structural.flyweight.sample;

public class BigString {
    // 큰 문자의 배열
    private BigChar[] bigChars;

    // 생성자
    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 표시
    public void print() {
        for (BigChar bc : bigChars) {
            bc.print();
        }
    }
}
