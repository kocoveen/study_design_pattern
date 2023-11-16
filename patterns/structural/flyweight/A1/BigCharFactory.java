package patterns.structural.flyweight.A1;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    // 이미 만들어진 BigChar 인스턴스 관리
    private Map<String, BigChar> pool = new HashMap<>();

    // Singleton 패턴
    private static BigCharFactory singleton = new BigCharFactory();

    // 생성자
    private BigCharFactory() {
    }

    // 유일한 인스턴스 획득
    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bc = pool.get(String.valueOf(charName));
        if (bc == null) {
            // 여기서 인스턴스 생성
            bc = new BigChar(charName);
            pool.put(String.valueOf(charName), bc);
        }
        return bc;
    }


}
