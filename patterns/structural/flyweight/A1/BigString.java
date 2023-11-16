package patterns.structural.flyweight.A1;

public class BigString {
    // 큰 문자의 배열
    private BigChar[] bigChars;

    // 생성자 (인수 없음, 공유한다)
    public BigString(String string) {
        initShared(string);
    }

    // 생성자 (인수를 통해 공유할지 말지 정함)
    public BigString(String string, boolean shared) {
        if (shared) {
            initShared(string);
        } else {
            initUnshared(string);
        }
    }

    // 공유해서 초기화
    private void initShared(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    // 공유하지 않고 초기화
    private void initUnshared(String string) {
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = new BigChar(string.charAt(i));
        }
    }

    // 표시
    public void print() {
        for (BigChar bc : bigChars) {
            bc.print();
        }
    }
}
