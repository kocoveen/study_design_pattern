package patterns.behavioral.strategy.A4b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전 순으로 작은 순서
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(list);

        // 사전 순으로 큰 순서
        list.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println(list);
    }
}
